package com.example.backend.matchmaking;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.db.DbConnection;
import com.example.db.RespuestaDBQuery;
import com.example.db.RespuestaDBUpdate;

public class MatchMakingBE {
	
	DbConnection db;
	Statement st;
	
	
	public MatchMakingBE() {
		
		try {
			
			db = new DbConnection();
			st = db.getConnection().createStatement();
			
		} catch (Exception e) {
			
			System.err.println("Error en la conexión con la BD:");
			e.printStackTrace();
		}
	}
	
	
	
	public RespuestaDBQuery obtenerPartidosDisponiblesPorDeporte(String deporte) {
		
		RespuestaDBQuery respuesta = new RespuestaDBQuery();
		
		/* Seleccionar todos los partidos (Game), el nombre del centro deportivo donde se juegan y
         * el nombre del equipo contrincante que sean del deporte pasado por argumento y que solo
         * aparezcan una vez en la tabla teamgame (osea, que aun no tengan contricante)
         */
        String consulta = "select g.id, g.date, sc.name 'center', g.sport, t.name 'team' "
        				 + "from game g, sportcenter sc, teamgame tg, team t "
        				 + "where g.sportCenter = sc.id "
        				 + "and g.id = tg.game and tg.team = t.id "
        				 + "and g.sport='" + deporte + "' "
        				 + "and (select count(*) from teamgame tg where tg.game=g.id) = 1;";
        
        try {
            
            // ejecutar consulta:
            ResultSet resultado = st.executeQuery(consulta);
            respuesta.setResultado(resultado);
            
        } catch (Exception e) {
        	
        	respuesta.setError(true);
        	respuesta.setMensajeError("ERROR REALIZANDO CONSULTA A LA BD: \n" 
        							+ "Obtener partidos disponibles por deporte: Deporte= " + deporte
        							+ "\nStack Trace: \n" + e.getStackTrace());
        }
            
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate crearPartido(GameVO partido) {
			
			RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
			
			String insert = "insert into game (sport, date, sportCenter, confirmed) "
			 			  + "values ('" + partido.getSport() + "', '"
			 			  + partido.getDate() + "', "
			 			  + partido.getSportCenter() + ", 0)";
			
			 try {
		            
		            // ejecutar insercion:
		            st.executeUpdate(insert);
		            respuesta.setResultado(true);
		            
		            // obtener el id del campo insertado:
		            ResultSet rs = st.executeQuery("select last_insert_id() as last_id from game");
		            rs.next();
		            respuesta.setIDActualizada(rs.getInt("last_id"));
		            
		        } catch (Exception e) {
		        	
		        	respuesta.setResultado(false);
		        	respuesta.setError(true);
		        	respuesta.setMensajeError("ERROR INSERTANDO DATOS EN LA BD: \n" 
		        							+ "Crear nuevo partido."
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		        }
			
			return respuesta;
		}
	
		
		
	public RespuestaDBUpdate crearRelacionPartidoEquipo(int partidoID, int equipoID) {
		
		 RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		 String consulta = "select count(*) 'n' from teamgame where game='" 
		 		  		 + partidoID + "';";

		 String insert = "insert into teamgame (team, game) values ("
		 			   + equipoID + ", " + partidoID + ")";
		 
		 int n_equipos = 0;
		
		 try {
			 
			 // Obtenermos el numero de equipos del partido:
	         ResultSet rs = st.executeQuery(consulta);
	         rs.next();
	         n_equipos = rs.getInt("n");
	    
		 } catch (Exception e) {
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR EJECUTANDO CONSULTA DE COMPROBACION EN LA BD: \n" 
		        						+ "Crear relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID
		        						+ "\nStack Trace: \n" + e.getStackTrace());
		 }
           
           
         if (n_equipos <= 1) { // Solo se podrá unir al partido si hay un hueco libre:
           	
        	 try {
        		 
        		// ejecutar insercion:
 	            st.executeUpdate(insert);
 	            respuesta.setResultado(true);
 	            
 	            // obtener el id del campo insertado:
 	            ResultSet rs = st.executeQuery("select last_insert_id() as last_id from teamgame");
 	            rs.next();
 	            respuesta.setIDActualizada(rs.getInt("last_id"));
        		 
        	 } catch (Exception e) {
 	        	
 	        	respuesta.setResultado(false);
 	        	respuesta.setError(true);
 	        	respuesta.setMensajeError("ERROR INSERTANDO DATOS EN LA BD: \n" 
 	        							+ "Crear relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID
 	        							+ "\nStack Trace: \n" + e.getStackTrace());
 	        }
               
         } else {
           	
        	 respuesta.setResultado(false);
	         respuesta.setError(true);
           	 System.err.println("ERROR ACTUALIZANDO DATOS EN LA BD: El partido ya tiene 2 equipos.\n"
           			 		  + "Crear relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID);	
         }
		
		return respuesta;
	}
	
	
	
public RespuestaDBUpdate eliminarRelacionPartidoEquipo(int partidoID, int equipoID) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String select = "select count(*) 'n' from teamgame where game=" + partidoID + " and team= " + equipoID + ";";
		String delete = "delete from teamgame where game=" + partidoID + " and team=" + equipoID + ";";
		
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
	        						+ "Eliminar relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID
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
		        							+ "Eliminar relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		    }
			
		} else { // Si no existe
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: La fila a modificar no existe\n" 
	        						+ "OPERACION: Eliminar relacion Partido-Equipo: ID-Partido= " + partidoID + "  ID-Equipo= " + equipoID);
		}
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate eliminarPartido(int partidoID) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String select = "select count(*) 'n' from game where id=" + partidoID + ";";
		String delete1 = "delete from teamgame where game=" + partidoID + ";";
		String delete2 = "delete from game where id=" + partidoID + ";";
		
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
	        							+ "Eliminar partido: ID-Partido= " + partidoID
	        							+ "\nStack Trace: \n" + e.getStackTrace());
		}
		
		
		if (num_notificaciones >= 1) { // Si la fila a modificar existe:
			try {
				 
		            // ejecutar borrado de relaciones partido-equipo:
		            st.executeUpdate(delete1);
		            // ejecutar borrado de partido:
		            st.executeUpdate(delete2);
		            respuesta.setResultado(true);
		            
		            respuesta.setIDActualizada(partidoID);
		            
		    } catch (Exception e) {
		        	
		    	   respuesta.setResultado(false);
		    	   respuesta.setError(true);
		    	   respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: \n" 
		        							+ "Eliminar partido: ID-Partido= " + partidoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		    }
			
		} else { // Si no existe
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: La fila a modificar no existe\n" 
	        						+ "OPERACION: Eliminar partido: ID-Partido= " + partidoID);
		}
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate marcarPartidoComoConfirmado(int partidoID) {
			
			RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
			
			String select = "select count(*) 'n' from game where id=" + partidoID + ";";
			String update = "update game set confirmed=1 where id=" + partidoID + ";";
			
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
		        							+ "Marcar partido como confirmado: ID-Partido= " + partidoID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
			}
			
			
			if (num_notificaciones >= 2) { // Si la fila a modificar existe:
				try {
					 
			            // ejecutar actualizacion:
			            st.executeUpdate(update);
			            respuesta.setResultado(true);
			            
			            respuesta.setIDActualizada(partidoID);
			            
			    } catch (Exception e) {
			        	
			    	   respuesta.setResultado(false);
			    	   respuesta.setError(true);
			    	   respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: \n" 
			        							+ "Marcar partido como confirmado: ID-Partido= " + partidoID
			        							+ "\nStack Trace: \n" + e.getStackTrace());
			    }
				
			} else { // Si no existe
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: La fila a modificar no existe\n" 
		        						+ "OPERACION: Marcar partido como confirmado: ID-Partido= " + partidoID);
			}
			
			return respuesta;
		}

}
