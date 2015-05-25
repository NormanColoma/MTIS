package com.example.backend.tournament;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.db.DbConnection;
import com.example.db.RespuestaDBQuery;
import com.example.db.RespuestaDBUpdate;

public class TournamentBE {
	
	DbConnection db;
	Statement st;
	
	
	public TournamentBE() {
		
		try {
			
			db = new DbConnection();
			st = db.getConnection().createStatement();
			
		} catch (Exception e) {
			
			System.err.println("Error en la conexión con la BD:");
			e.printStackTrace();
		}
	}
	
	
	
	public RespuestaDBQuery obtenerTorneosDisponiblesPorDeporte(String deporte) {
		
		RespuestaDBQuery respuesta = new RespuestaDBQuery();
		
		/* Seleccionar todos los torneos (Tournament) y el nombre del centro deportivo donde se juegan,  
		 * que sean del deporte pasado por argumento y que esten disponibles (que no se esten jugando)
         */
        String consulta = "select t.id, t.name, t.info, t.startdata, t.enddata, sc.id 'center_id', sc.name 'center_name', t.sport "
        				+ "from tournament t, sportcenter sc, sportcentertournament st "
        				+ "where t.id = st.tournament and st.sportCenter = sc.id "
        				+ "and t.sport='" + deporte + "' and t.playing=0;";
        
        try {
            
            // ejecutar consulta:
            ResultSet resultado = st.executeQuery(consulta);
            respuesta.setResultado(resultado);
            
        } catch (Exception e) {
        	
        	respuesta.setError(true);
        	respuesta.setMensajeError("ERROR REALIZANDO CONSULTA A LA BD: \n" 
        							+ "Obtener torneos disponibles por deporte: Deporte= " + deporte
        							+ "\nStack Trace: \n" + e.getStackTrace());
        }
            
		return respuesta;
	}
	
	
	
	public RespuestaDBQuery obtenerEquiposPorTorneo(int torneoID) {
		
		RespuestaDBQuery respuesta = new RespuestaDBQuery();
		
		/* Seleccionar equipos que juegan en el torneo indicaod por torneoID
         */
		String consulta = "select t.id, t.name, t.img, t.sport from team t, tournamentteam tt "
						+ "where tt.tournament=" + torneoID + " and t.id = tt.team";
        
        try {
            
            // ejecutar consulta:
            ResultSet resultado = st.executeQuery(consulta);
            respuesta.setResultado(resultado);
            
        } catch (Exception e) {
        	
        	respuesta.setError(true);
        	respuesta.setMensajeError("ERROR REALIZANDO CONSULTA A LA BD: \n" 
        							+ "Obtener equipos de un torneo: Torneo= " + torneoID
        							+ "\nStack Trace: \n" + e.getStackTrace());
        }
            
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate crearTorneo(TournamentVO torneo, int sportCenterId) {
			
			RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
			
			String insert = "insert into tournament (name, info, startdata, enddata, sport, playing) "
						  + "values ('" + torneo.getName() + "', '" + torneo.getInfo() + "', '"
						  + torneo.getStartData() + "', '" + torneo.getEndData()  + "', '"
						  + torneo.getSport() + "', " + 0 + ");";
			
			String insert2 = null;

			 try {
		            
		            // ejecutar insercion:
		            st.executeUpdate(insert);

		            // obtener el id del campo insertado:
		            ResultSet rs = st.executeQuery("select last_insert_id() as last_id from tournament");
		            rs.next();
		            respuesta.setIDActualizada(rs.getInt("last_id"));
		            
		            insert2 = "insert into sportcentertournament (sportcenter, tournament) values (" + sportCenterId + ", " + respuesta.getIDActualizada() + ");";
		            st.executeUpdate(insert2);
		            
		            respuesta.setResultado(true);
		            
		        } catch (Exception e) {
		        	
		        	respuesta.setResultado(false);
		        	respuesta.setError(true);
		        	respuesta.setMensajeError("ERROR INSERTANDO DATOS EN LA BD: \n" 
		        							+ "Crear nuevo torneo."
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		        }
			
			return respuesta;
		}
	
		
		
	public RespuestaDBUpdate crearRelacionTorneoEquipo(int torneoID, int equipoID) {
		
		 RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		 String consulta = "select playing 'n' from tournament where id=" + torneoID + ";";

		 String insert = "insert into tournamentteam (tournament, team) values ("
		 			   + torneoID + ", " + equipoID + ");";
		 
		 int playing = 0;
		
		 try {
			 
			 // Obtenermos el numero de equipos del partido:
	         ResultSet rs = st.executeQuery(consulta);
	         rs.next();
	         playing = rs.getInt("n");
	    
		 } catch (Exception e) {
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR EJECUTANDO CONSULTA DE COMPROBACION EN LA BD: \n" 
		        						+ "Crear relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID
		        						+ "\nStack Trace: \n" + e.getStackTrace());
		 }
           
           
         if (playing == 0) { // Solo se podrá unir al torneo si el torneo aun no se esta jugando:
           	
        	 try {
        		 
        		// ejecutar insercion:
 	            st.executeUpdate(insert);
 	            respuesta.setResultado(true);
 	            
 	            // obtener el id del campo insertado:
 	            ResultSet rs = st.executeQuery("select last_insert_id() as last_id from tournamentteam;");
 	            rs.next();
 	            respuesta.setIDActualizada(rs.getInt("last_id"));
        		 
        	 } catch (Exception e) {
 	        	
 	        	respuesta.setResultado(false);
 	        	respuesta.setError(true);
 	        	respuesta.setMensajeError("ERROR INSERTANDO DATOS EN LA BD: \n" 
 	        							+ "Crear relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID
 	        							+ "\nStack Trace: \n" + e.getStackTrace());
 	        }
               
         } else {
           	
        	 respuesta.setResultado(false);
	         respuesta.setError(true);
           	 System.err.println("ERROR ACTUALIZANDO DATOS EN LA BD: El torneo ya se está jugando.\n"
           			 		  + "Crear relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID);	
         }
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate eliminarRelacionTorneoEquipo(int torneoID, int equipoID) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String select = "select count(*) 'n' from tournamentteam where tournament=" + torneoID + " and team= " + equipoID + ";";
		String delete = "delete from tournamentteam where tournament=" + torneoID + " and team=" + equipoID + ";";
		
		ResultSet rs = null;
		int num_notificaciones = 0;
		
		try {
			
			rs = st.executeQuery(select);
			rs.next();
			num_notificaciones = rs.getInt("n");
				
		} catch (Exception e) {
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR EJECUTANDO CONSULTA DE COMPROBACION EN LA BD: \n" 
	        						+ "Eliminar relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID
	        						+ "\nStack Trace: \n" + e.getStackTrace());
		}
		
		
		if (num_notificaciones >= 1) { // Si la fila a modificar existe:
			try {
				 
		            // ejecutar borrado de relacion partido-equipo:
		            st.executeUpdate(delete);
		            respuesta.setResultado(true);
		            
		            respuesta.setIDActualizada(-2);
		            
		    } catch (Exception e) {
		        	
		    	   respuesta.setResultado(false);
		    	   respuesta.setError(true);
		    	   respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: \n" 
		        							+ "Eliminar relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		    }
			
		} else { // Si no existe
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: La fila a modificar no existe\n" 
	        						+ "OPERACION: Eliminar relacion Torneo-Equipo: ID-Torneo= " + torneoID + "  ID-Equipo= " + equipoID);
		}
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate eliminarTorneo(int torneoID) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String select = "select count(*) 'n' from tournament where id=" + torneoID + ";";
		String delete1 = "delete from tournamentteam where tournament=" + torneoID + ";";
		String delete2 = "delete from tournament where id=" + torneoID + ";";
		
		ResultSet rs = null;
		int num_notificaciones = 0;
		
		try {
			
			rs = st.executeQuery(select);
			rs.next();
			num_notificaciones = rs.getInt("n");
				
		} catch (Exception e) {
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR EJECUTANDO CONSULTA DE COMPROBACION EN LA BD: \n" 
	        							+ "Eliminar torneo: ID-Torneo= " + torneoID
	        							+ "\nStack Trace: \n" + e.getStackTrace());
		}
		
		
		if (num_notificaciones >= 1) { // Si la fila a modificar existe:
			try {
				 
		            // ejecutar borrado de relaciones partido-equipo:
		            st.executeUpdate(delete1);
		            // ejecutar borrado de partido:
		            st.executeUpdate(delete2);
		            respuesta.setResultado(true);
		            
		            respuesta.setIDActualizada(torneoID);
		            
		    } catch (Exception e) {
		        	
		    	   respuesta.setResultado(false);
		    	   respuesta.setError(true);
		    	   respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: \n" 
		    			   					+ "Eliminar torneo: ID-Torneo= " + torneoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		    }
			
		} else { // Si no existe
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: La fila a modificar no existe\n" 
	        						+ "OPERACION: Eliminar torneo: ID-Torneo= " + torneoID);
		}
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate marcarTorneoComoJugando(int torneoID) {
			
			RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
			
			String select = "select count(*) 'n' from tournamentteam where tournament=" + torneoID + ";";
			String update = "update tournament set playing=1 where id=" + torneoID + ";";
			
			ResultSet rs = null;
			int num_notificaciones = 0;
			
			try {
				
				rs = st.executeQuery(select);
				rs.next();
				num_notificaciones = rs.getInt("n");
					
			} catch (Exception e) {
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR EJECUTANDO CONSULTA DE COMPROBACION EN LA BD: \n" 
		        							+ "Marcar torneo como jugando: ID-Torneo= " + torneoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
			}
			
			
			if (num_notificaciones >= 3) { // Si el torneo tiene 3 equipos o mas puede empezar a jugarse
				try {
					 
			            // ejecutar actualizacion:
			            st.executeUpdate(update);
			            respuesta.setResultado(true);
			            
			            respuesta.setIDActualizada(torneoID);
			            
			    } catch (Exception e) {
			        	
			    	   respuesta.setResultado(false);
			    	   respuesta.setError(true);
			    	   respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: \n" 
			        							+ "Marcar torneo como jugando: ID-Torneo= " + torneoID
			        							+ "\nStack Trace: \n" + e.getStackTrace());
			    }
				
			} else { // Si no existe
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: La fila a modificar no existe\n" 
		        						+ "OPERACION: Marcar torneo como jugando: ID-Torneo= " + torneoID);
			}
			
			return respuesta;
		}

}


