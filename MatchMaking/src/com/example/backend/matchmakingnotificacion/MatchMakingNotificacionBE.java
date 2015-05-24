package com.example.backend.matchmakingnotificacion;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.db.DbConnection;
import com.example.db.RespuestaDBQuery;
import com.example.db.RespuestaDBUpdate;

public class MatchMakingNotificacionBE {
	
	DbConnection db;
	Statement st;
	
	
	public MatchMakingNotificacionBE() {
		
		try {
			
			db = new DbConnection();
			st = db.getConnection().createStatement();
			
		} catch (Exception e) {
			
			System.err.println("Error en la conexión con la BD:");
			e.printStackTrace();
		}
	}
	
	
	
	public RespuestaDBQuery obtenerNotificacionesPorEquipo(int equipoID) {
		
		RespuestaDBQuery respuesta = new RespuestaDBQuery();
		
		/* Seleccionar todas las notificaciones que tenga un equipo:
         */
        String consulta = "select id, equipo_rival, partido, notificacion, leida "
        				 + "from notificacionpartido "
        				 + "where equipo_notificado = " + equipoID + ";";
        
        try {
            
            // ejecutar consulta:
            ResultSet resultado = st.executeQuery(consulta);
            respuesta.setResultado(resultado);
            
        } catch (Exception e) {
        	
        	respuesta.setError(true);
        	respuesta.setMensajeError("ERROR REALIZANDO CONSULTA A LA BD: \n" 
        							+ "Obtener lista de notificaciones por equipo: ID-Equipo= " + equipoID
        							+ "\nStack Trace: \n" + e.getStackTrace());
        }
            
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate crearNotificacionPartido(NotificacionPartidoVO notificacion) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String insert = "insert into notificacionpartido (equipo_notificado, equipo_rival, partido, notificacion, leida) "
			 		  + "values (" + notificacion.getEquipoNotificado() + ", '"
			 		  + notificacion.getEquipoRival() + "', '"
			 		  + notificacion.getPartido() + "', "
			 		  + "'" + notificacion.getNotificacion() + "', "
			 		  + notificacion.getLeida() + ");";
		
		 try {
	            
	            // ejecutar insercion:
	            st.executeUpdate(insert);
	            respuesta.setResultado(true);
	            
	            // obtener el id del campo insertado:
	            ResultSet rs = st.executeQuery("select last_insert_id() as last_id from notificacionpartido");
	            rs.next();
	            respuesta.setIDActualizada(rs.getInt("last_id"));
	            
	        } catch (Exception e) {
	        	
	        	respuesta.setResultado(false);
	        	respuesta.setError(true);
	        	respuesta.setMensajeError("ERROR INSERTANDO DATOS EN LA BD: \n" 
	        							+ "Crear nueva notificacion de partido."
	        							+ "\nStack Trace: \n" + e.getStackTrace());
	        }
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate marcarNotificacionComoLeida(int notificacionID) {
		
		RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
		
		String select = "select count(*) 'n' from notificacionpartido where id=" + notificacionID + ";";
		String update = "update notificacionpartido set leida=1 where id=" + notificacionID + ";";
		
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
	        							+ "Marcar notificacion de partido como leida: ID-Notificacion= " + notificacionID
	        							+ "\nStack Trace: \n" + e.getStackTrace());
		}
		
		
		if (num_notificaciones >= 1) { // Si la fila a modificar existe:
			try {
				 
		            // ejecutar actualizacion:
		            st.executeUpdate(update);
		            respuesta.setResultado(true);
		            
		            respuesta.setIDActualizada(notificacionID);
		            
		    } catch (Exception e) {
		        	
		    	   respuesta.setResultado(false);
		    	   respuesta.setError(true);
		    	   respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: \n" 
		        							+ "Marcar notificacion de partido como leida: ID-Notificacion= " + notificacionID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
		    }
			
		} else { // Si no existe
			
			respuesta.setResultado(false);
	    	respuesta.setError(true);
	    	respuesta.setMensajeError("ERROR ACTUALIZANDO DATOS EN LA BD: La fila a modificar no existe\n" 
	        						+ "OPERACION: Marcar notificacion de partido como leida:  ID-Notificacion= " + notificacionID);
		}
		
		return respuesta;
	}
	
	
	
	public RespuestaDBUpdate eliminarNotificacionPartido(int notificacionID) {
			
			RespuestaDBUpdate respuesta = new RespuestaDBUpdate();
			
			String select = "select count(*) 'n' from notificacionpartido where id=" + notificacionID + ";";
			String delete = "delete from notificacionpartido where id=" + notificacionID + ";";
			
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
		        							+ "Eliminar notificacion de partido: ID-Notificacion= " + notificacionID
		        							+ "\nStack Trace: \n" + e.getStackTrace());
			}
			
			
			if (num_notificaciones >= 1) { // Si la fila a modificar existe:
				try {
					 
			            // ejecutar borrado:
			            st.executeUpdate(delete);
			            respuesta.setResultado(true);
			            
			            respuesta.setIDActualizada(notificacionID);
			            
			    } catch (Exception e) {
			        	
			    	   respuesta.setResultado(false);
			    	   respuesta.setError(true);
			    	   respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: \n" 
			        							+ "Eliminar notificacion de partido: ID-Notificacion= " + notificacionID
			        							+ "\nStack Trace: \n" + e.getStackTrace());
			    }
				
			} else { // Si no existe
				
				respuesta.setResultado(false);
		    	respuesta.setError(true);
		    	respuesta.setMensajeError("ERROR ELIMINANDO DATOS DE LA BD: La fila a modificar no existe\n" 
		        						+ "OPERACION: Eliminar notificacion de partido: ID-Notificacion= " + notificacionID);
			}
			
			return respuesta;
		}
}
