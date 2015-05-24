
/**
 * MatchMakingNotificacionServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.matchmakingnotificacionservice;


    import java.sql.SQLException;

    import com.example.backend.matchmakingnotificacion.MatchMakingNotificacionBE;
    import com.example.backend.matchmakingnotificacion.NotificacionPartidoVO;
    import com.example.db.RespuestaDBQuery;
    import com.example.db.RespuestaDBUpdate;
   
    public class MatchMakingNotificacionServiceSkeleton{
    	
    	private MatchMakingNotificacionBE notificacionBE;
    	
    	public MatchMakingNotificacionServiceSkeleton() {
    		
    		this.notificacionBE = new MatchMakingNotificacionBE();
    	}
    	
    	/*
    	 * Devuelve una lista con todas las notificaciones de partidos del equipo indicado por teamID.
    	 */
    	public ListaNotificaciones getNotifyTeamList(TeamId teamID) {
       	 
            ListaNotificaciones listaNotificaciones = new ListaNotificaciones();
            NotificacionesPartidos notificaciones = new NotificacionesPartidos();
            NotificacionPartido notificacion = null;
            
            RespuestaDBQuery respuesta;
            
            respuesta = notificacionBE.obtenerNotificacionesPorEquipo(teamID.getTeamId());
            
            if (!respuesta.isError()) { //No ha habido errores
            	
            	// iterate through the java resultset
                try {
                	
					while (respuesta.getResultado().next()) {
						
						notificacion = new NotificacionPartido();
						
						notificacion.setId(respuesta.getResultado().getInt("id"));
						notificacion.setEquipo_notificado(teamID.getTeamId());
						notificacion.setEquipo_rival(respuesta.getResultado().getInt("equipo_rival"));
						notificacion.setPartido(respuesta.getResultado().getInt("partido"));
						notificacion.setNotificacion(respuesta.getResultado().getString("notificacion"));
						notificacion.setLeida(respuesta.getResultado().getInt("leida"));
						
						notificaciones.addLista(notificacion);
					}
					
				} catch (SQLException e) {
					
					System.err.println("ERROR AL OBTENER DATOS DE LA CONSULTA: obtenerNotificacionesPorEquipo\n"
									 + "EquipoID = " + teamID.getTeamId() + "\nStack Trace: "
									 + e.getStackTrace());
				}
                
            } else { // Error
            	
            	System.err.println(respuesta.getMensajeError());
            }
            
           listaNotificaciones.setListaNotificaciones(notificaciones);
           return listaNotificaciones;
        }
    	
    	
    	
        /*
         * Crea una nueva notificacion de un partido para el equipo indocado en notify.getNotify().getEquipo_notificado().
         */
    	public RespuestaBooleana notifyTeam(NotifyE notify) {
       	 
    		 RespuestaBooleana respuesta = new RespuestaBooleana();
	       	 respuesta.setRespuestaBooleana(true);
	       	 
	       	 NotificacionPartidoVO notificacion = new NotificacionPartidoVO();
	       	 notificacion.setEquipoNotificado(notify.getNotify().getEquipo_notificado());
	       	 notificacion.setEquipoRival(notify.getNotify().getEquipo_contrincante());
	       	 notificacion.setPartido(notify.getNotify().getPartido());
	       	 notificacion.setNotificacion("Un equipo desea unirse a su partido.");
	       	 notificacion.setLeida(0);
	       	 
	       	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
	       	 
	       	 respuestadb = notificacionBE.crearNotificacionPartido(notificacion);
	       	 
	       	 if (respuestadb.isError()) {
	       		respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       	 }

	       	 return respuesta;
        }
         
        
    	
    	/*
    	 * Marca el atributo 'leida' de la tonitifacion indicada por notifyID a 1.
    	 */
        public RespuestaBooleana readNotify(NotifyId notifyID) {
              		
        	RespuestaBooleana respuesta = new RespuestaBooleana();
       	 	respuesta.setRespuestaBooleana(true);
       	 	
       	 	RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 	
       	 	respuestadb = notificacionBE.marcarNotificacionComoLeida(notifyID.getNotifyId());
       	 
       	 	if (respuestadb.isError()) {
       	 		 respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       	}
	       	 
	       	return respuesta;
        }
     
         
        
        /*
         * Elimina la notificacion de partido indicada por notifyID.
         */
        public RespuestaBooleana deleteNotify(NotifyId notifyID) {
        	
        	 RespuestaBooleana respuesta = new RespuestaBooleana();
	       	 respuesta.setRespuestaBooleana(true);
	       	 
	       	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 	
       	 	 respuestadb = notificacionBE.eliminarNotificacionPartido(notifyID.getNotifyId());
       	 
       	 	 if (respuestadb.isError()) {
       	 		 respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       	 }
	       	 
	       	 return respuesta;
	   }
     
    }
    