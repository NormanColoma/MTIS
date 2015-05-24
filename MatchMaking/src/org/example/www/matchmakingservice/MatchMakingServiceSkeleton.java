
/**
 * MatchMakingServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.matchmakingservice;
    
    import java.sql.*;

import org.example.www.matchmakingnotificacionservice.NotificacionPartido;
import org.example.www.matchmakingnotificacionservice.RespuestaBooleana;

import com.example.backend.matchmaking.GameVO;
import com.example.backend.matchmaking.MatchMakingBE;
import com.example.backend.matchmakingnotificacion.MatchMakingNotificacionBE;
import com.example.backend.matchmakingnotificacion.NotificacionPartidoVO;
import com.example.db.DbConnection;
import com.example.db.RespuestaDBQuery;
import com.example.db.RespuestaDBUpdate;
    
    public class MatchMakingServiceSkeleton{
    	
    			 private MatchMakingBE partidoBE;
    	
    			 public MatchMakingServiceSkeleton() {
    		
    				this.partidoBE = new MatchMakingBE();
    			 }
        
    			 
    			 /*
    			  * Obtiene una lista de partidos disponibles del deporte indicado por sport.
    			  * disponible significa que aun tenga 1 hueco para 1 equipo.
    			  */
                 public ListaPartidosDisponibles getAvalibleMatches(Sport sport) {
                	 
                     ListaPartidosDisponibles listaPartidos = new ListaPartidosDisponibles();
                     Matches partidos = new Matches();
                     Match partido = null;
                                         
                     RespuestaDBQuery respuesta;
                     
                     respuesta = partidoBE.obtenerPartidosDisponiblesPorDeporte(sport.getSport());
                     
                     if (!respuesta.isError()) { //No ha habido errores
                     	
                     	// iterate through the java resultset
                         try {
                         	
         					while (respuesta.getResultado().next()) {
         						
         						partido = new Match();
         	                	
         	                	partido.setId(respuesta.getResultado().getInt("id"));
         	                	partido.setSportCenter(respuesta.getResultado().getString("center"));
         	                	partido.setDate(respuesta.getResultado().getString("date"));
         	                	partido.setSport(respuesta.getResultado().getString("sport"));
         	                	partido.setEquipoContrincante(respuesta.getResultado().getString("team"));
         	                	
         	                	partidos.addPartido(partido);
         					}
         					
         				} catch (SQLException e) {
         					
         					System.err.println("ERROR AL OBTENER DATOS DE LA CONSULTA: obtenerPartidosDisponiblesPorDeporte\n"
         									 + "Deporte = " + sport.getSport() + "\nStack Trace: "
         									 + e.getStackTrace());
         				}
                         
                     } else { // Error
                     	
                     	System.err.println(respuesta.getMensajeError());
                     }
                     
                     listaPartidos.setListaPartidosDisponibles(partidos);
                     return listaPartidos;

                 }
                 
                 
                 
                 /*
                  * Crea un nuevo partido y lo relaciona con el equipo indicado por match.getMatch().getTeam().
                  */
                 public org.example.www.matchmakingservice.RespuestaBooleana addNewMatch(MatchE match) { // Cambiar a teamid, fecha y centrodeportivo
                	 
                	 org.example.www.matchmakingservice.RespuestaBooleana respuesta = new org.example.www.matchmakingservice.RespuestaBooleana();
        	       	 respuesta.setRespuestaBooleana(true);
        	       	 
        	       	 GameVO partido = new GameVO();
        	       	 partido.setDate(match.getMatch().getFecha());
        	       	 partido.setSportCenter(match.getMatch().getCentroDeportivo());
        	       	 partido.setSport(match.getMatch().getDeporte());
        	       	 partido.setConfirmed(0);
        	       	 
        	       	 
        	       	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
        	       	 RespuestaDBUpdate respuestadb2 = new RespuestaDBUpdate();
        	       	 
        	       	 respuestadb = partidoBE.crearPartido(partido);
        	       	 
        	       	 if (respuestadb.isError()) {
        	       		respuesta.setRespuestaBooleana(false);
        	       		 System.err.println(respuestadb.getMensajeError());
        	       		 
        	       	 } else {
        	       		 
        	       		respuestadb2 = partidoBE.crearRelacionPartidoEquipo(respuestadb.getIDActualizada(), match.getMatch().getTeam());
        	       		
        	       		if (respuestadb2.isError()) {
            	       		respuesta.setRespuestaBooleana(false);
            	       		 System.err.println(respuestadb.getMensajeError());
            	       		 
            	       	 }
        	       	 }

        	       	 return respuesta;
                 }
                 
                 
                 
                 /*
                  * Crea una relacion entre 1 equipo y un partido. (ids indicados en teamMatch)
                  */
                 public org.example.www.matchmakingservice.RespuestaBooleana joinMatch(TeamMatchE teamMatch) {
                	 
                	 org.example.www.matchmakingservice.RespuestaBooleana respuesta = new org.example.www.matchmakingservice.RespuestaBooleana();
                	 respuesta.setRespuestaBooleana(true);
                	 
                	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
                	 
                	 respuestadb = partidoBE.crearRelacionPartidoEquipo(teamMatch.getTeamMatch().getIdMatch(), teamMatch.getTeamMatch().getIdTeam());
     	       		
     	       		 if (respuestadb.isError()) {
         	       		 respuesta.setRespuestaBooleana(false);
         	       		 System.err.println(respuestadb.getMensajeError());
         	       		 
         	       	 }
                	 
                	 return respuesta;
                 }
                 
                 
                 
                 /*
                  * Elimina una relacion entre 1 partido y 1 equipo. (ids indicados en teamMatch)
                  */
                 public org.example.www.matchmakingservice.RespuestaBooleana disjoinMatch(TeamMatchE teamMatch) {
                	 
                	 org.example.www.matchmakingservice.RespuestaBooleana respuesta = new org.example.www.matchmakingservice.RespuestaBooleana();
                	 respuesta.setRespuestaBooleana(true);
                	 
                	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
                	 
                	 respuestadb = partidoBE.eliminarRelacionPartidoEquipo(teamMatch.getTeamMatch().getIdMatch(), teamMatch.getTeamMatch().getIdTeam());
     	       		
     	       		 if (respuestadb.isError()) {
         	       		 respuesta.setRespuestaBooleana(false);
         	       		 System.err.println(respuestadb.getMensajeError());
         	       		 
         	       	 }
                	 
                	 return respuesta;
                	 
                 }
                 
                 
                 
                 /*
                  * Elimina el partido indicado por idMatch y todas sus relaciones con los equipos.
                  */
                 public org.example.www.matchmakingservice.RespuestaBooleana deleteMatch(IdMatch idMatch) {
                     
                	 org.example.www.matchmakingservice.RespuestaBooleana respuesta = new org.example.www.matchmakingservice.RespuestaBooleana();
                	 respuesta.setRespuestaBooleana(true);
                	 
                	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
                	 
                	 respuestadb = partidoBE.eliminarPartido(idMatch.getIdMatch());
     	       		
     	       		 if (respuestadb.isError()) {
         	       		 respuesta.setRespuestaBooleana(false);
         	       		 System.err.println(respuestadb.getMensajeError());
         	       		 
         	       	 }
                	 
                	 return respuesta;
                 }
                 
                 
                 
                 /*
                  * marca la opcion confirmado del partido indicado por idMatch a 1.
                  */
                 public org.example.www.matchmakingservice.RespuestaBooleana confirmMatch(IdMatch idMatch) {
                     
                	 org.example.www.matchmakingservice.RespuestaBooleana respuesta = new org.example.www.matchmakingservice.RespuestaBooleana();
                	 respuesta.setRespuestaBooleana(true);
                	 
                	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
                	 
                	 respuestadb = partidoBE.marcarPartidoComoConfirmado(idMatch.getIdMatch());
     	       		
     	       		 if (respuestadb.isError()) {
         	       		 respuesta.setRespuestaBooleana(false);
         	       		 System.err.println(respuestadb.getMensajeError());
         	       		 
         	       	 }
                	 
                	 return respuesta;
                 }

    }
    