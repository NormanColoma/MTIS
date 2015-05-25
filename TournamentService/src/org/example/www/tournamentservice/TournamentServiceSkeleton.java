
/**
 * TournamentServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.tournamentservice;


	import java.sql.SQLException;
	
		import com.example.backend.tournament.TournamentBE;
	import com.example.backend.tournament.TournamentVO;
	import com.example.db.RespuestaDBQuery;
	import com.example.db.RespuestaDBUpdate;
    /**
     *  TournamentServiceSkeleton java skeleton for the axisService
     */
    public class TournamentServiceSkeleton{
    	
    	private TournamentBE torneoBE;
    	
		 public TournamentServiceSkeleton() {
	
			this.torneoBE = new TournamentBE();
		 }
    	
		 /*
		  * Obtiene una lista de torneros del deporte indicado por sport, y que no se esten jugando.
		  */
    	public ListTournaments getAvalibleTournaments(Sport sport) {
            
    		ListTournaments listaTorneos = new ListTournaments();
            Tournaments torneos = new Tournaments();
            Tournament torneo = null;
            
            //Teams equipos = new Teams();
            //Team equipo = null;
                                
            RespuestaDBQuery respuesta_torneos;
            //RespuestaDBQuery respuesta_equipos;
            
            respuesta_torneos = torneoBE.obtenerTorneosDisponiblesPorDeporte(sport.getSport());
            
            if (!respuesta_torneos.isError()) { //No ha habido errores
            	
            	// iterate through the java resultset
                try {
                	
                	
					while (respuesta_torneos.getResultado().next()) {
						
						torneo = new Tournament();
	                	
						torneo.setId(respuesta_torneos.getResultado().getInt("id"));
						torneo.setName(respuesta_torneos.getResultado().getString("name"));
						torneo.setInfo(respuesta_torneos.getResultado().getString("info"));
						torneo.setStartData(respuesta_torneos.getResultado().getString("startdata"));
						torneo.setEndData(respuesta_torneos.getResultado().getString("enddata"));
						torneo.setSport(respuesta_torneos.getResultado().getString("sport"));
						torneo.setSportCenter(respuesta_torneos.getResultado().getInt("center_id"));
						
						/*
						respuesta_equipos = torneoBE.obtenerEquiposPorTorneo(torneo.getId());
						
						
						if (!respuesta_equipos.isError()) { //No ha habido errores
						
							try {
															
								while (respuesta_equipos.getResultado().next()) {
									
									equipo = new Team();
				                	
									equipo.setId(respuesta_equipos.getResultado().getInt("id"));
									equipo.setName(respuesta_equipos.getResultado().getString("name"));
									equipo.setImg(respuesta_equipos.getResultado().getString("img"));
									equipo.setSport(respuesta_equipos.getResultado().getString("sport"));
				                	
				                	equipos.addListaEquipos(equipo);
								}
							
							torneo.setTeams(equipos.getListaEquipos());
							
							} catch (SQLException e) {
								
								System.err.println("ERROR AL OBTENER DATOS DE LA CONSULTA: obtenerEquiposPorTorneo\n"
												 + "Torneo = " + torneo.getId() + "\nStack Trace: "
												 + e.getStackTrace());
							}
							
						} else {
							
							System.err.println(respuesta_equipos.getMensajeError());
						}
						*/
	                	
	                	torneos.addListTournaments(torneo);
					}
					
				} catch (SQLException e) {
					
					System.err.println("ERROR AL OBTENER DATOS DE LA CONSULTA: obtenerTorneosDisponiblesPorDeporte\n"
									 + "Deporte = " + sport.getSport() + "\nStack Trace: "
									 + e.getStackTrace().toString() + "\n" + e.getMessage());
				}
                
            } else { // Error
            	
            	System.err.println(respuesta_torneos.getMensajeError());
            }
            
            listaTorneos.setListTournaments(torneos);
            return listaTorneos;
    	}
        
    	
         /*
          * Obtiene una lista de equipos participantes del torneo indicado por tournamentId.
          */
        public ListTeams getTeamsdByTournament(TournamentId tournamentId) {
        	
        	ListTeams listaEquipos = new ListTeams();
            Teams equipos = new Teams();
            Team equipo = null;
                                
            RespuestaDBQuery respuesta;
            
            respuesta = torneoBE.obtenerEquiposPorTorneo(tournamentId.getTournamentId());
            
            if (!respuesta.isError()) { //No ha habido errores
            	
            	// iterate through the java resultset
                try {
                	
					while (respuesta.getResultado().next()) {
						
						equipo = new Team();
	                	
						equipo.setId(respuesta.getResultado().getInt("id"));
						equipo.setName(respuesta.getResultado().getString("name"));
						equipo.setImg(respuesta.getResultado().getString("img"));
						equipo.setSport(respuesta.getResultado().getString("sport"));
	                	
	                	equipos.addListaEquipos(equipo);
					}
					
				} catch (SQLException e) {
					
					System.err.println("ERROR AL OBTENER DATOS DE LA CONSULTA: obtenerEquiposPorTorneo\n"
									 + "Torneo = " + tournamentId.getTournamentId() + "\nStack Trace: "
									 + e.getStackTrace());
				}
                
            } else { // Error
            	
            	System.err.println(respuesta.getMensajeError());
            }
            
            listaEquipos.setListTeams(equipos);
            return listaEquipos;
        }
     
        
        /*
         * Inserta un nuevo tornero en la base de datos.
         */
        public RespuestaBooleana addNewTournament(NewTournement newtorneo) {
            
        	 RespuestaBooleana respuesta = new RespuestaBooleana();
	       	 respuesta.setRespuestaBooleana(true);
	       	 
	       	 TournamentVO torneo = new TournamentVO();
	       	 torneo.setName(newtorneo.getNewTournement().getName());
	       	 torneo.setInfo(newtorneo.getNewTournement().getInfo());
	       	 torneo.setStartData(newtorneo.getNewTournement().getDataStart());
	       	 torneo.setEndData(newtorneo.getNewTournement().getEndData());
	       	 torneo.setSport(newtorneo.getNewTournement().getSport());
	       	 torneo.setPlaying(0);
	       	 
	       	 RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
	       	 
	       	 respuestadb = torneoBE.crearTorneo(torneo, newtorneo.getNewTournement().getSportCenter());
	       	 
	       	 if (respuestadb.isError()) {
	       		respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       		 
	       	 } 
	       	 
	       	 return respuesta;
        }
        
         /*
          * Elimina un nuevo torneo de la base de datos.
          */
        public RespuestaBooleana deleteTournament(TournamentId tournamentId) {
                
        	RespuestaBooleana respuesta = new RespuestaBooleana();
       	 	respuesta.setRespuestaBooleana(true);
       	 
       	 	RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 
       	 	respuestadb = torneoBE.eliminarTorneo(tournamentId.getTournamentId());
       		
       		 	if (respuestadb.isError()) {
       		 		respuesta.setRespuestaBooleana(false);
       		 		System.err.println(respuestadb.getMensajeError());
	       		 
       		 	}
       	 
       		 	return respuesta;
        }
     
         
        /*
         * Elimina un equipo de la lista de participantes de un torneo.
         */
        public RespuestaBooleana disjoinTournament(TournamentTeamE tournamentTeam) {
                
        	RespuestaBooleana respuesta = new RespuestaBooleana();
       	 	respuesta.setRespuestaBooleana(true);
       	 
       	 	RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 
       	 	respuestadb = torneoBE.eliminarRelacionTorneoEquipo(tournamentTeam.getTournamentTeam().getTournament(), 
       	 													 tournamentTeam.getTournamentTeam().getTeam());
       		
       		if (respuestadb.isError()) {
	       		 respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       		 
	       	}
       	 
       		return respuesta;
        }
     
         
        /*
         * Añade un equipo a las lista de participantes de un torneo.
         */
        public RespuestaBooleana joinTournament(TournamentTeamE tournamentTeam) {
                
        	RespuestaBooleana respuesta = new RespuestaBooleana();
       	 	respuesta.setRespuestaBooleana(true);
       	 
       	 	RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 
       	 	respuestadb = torneoBE.crearRelacionTorneoEquipo(tournamentTeam.getTournamentTeam().getTournament(), 
       	 													    tournamentTeam.getTournamentTeam().getTeam());
       		
       		if (respuestadb.isError()) {
	       		 respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       		 
	       	}
       	 
       		return respuesta;
        }
        
        
        /*
         * marca el atributo playiing de un torneo a 1.
         */
        public RespuestaBooleana startTournament(TournamentId tournamentId) {
        	
        	RespuestaBooleana respuesta = new RespuestaBooleana();
       	 	respuesta.setRespuestaBooleana(true);
       	 
       	 	RespuestaDBUpdate respuestadb = new RespuestaDBUpdate();
       	 
       	 	respuestadb = torneoBE.marcarTorneoComoJugando(tournamentId.getTournamentId());
       		
       		if (respuestadb.isError()) {
	       		 respuesta.setRespuestaBooleana(false);
	       		 System.err.println(respuestadb.getMensajeError());
	       		 
	       	}
       	 
       		return respuesta;
        }
        
        
        /*
         * No sabia que habia que validar, asi que lo he dejado en blanco.
         */
        public RespuestaBooleana validateInscription(Inscripcion inscripcion) {
            
        	RespuestaBooleana respuesta = new RespuestaBooleana();
        	respuesta.setRespuestaBooleana(true);
        	
        	if (true) { // Condicion de validacion
        		
        		respuesta.setRespuestaBooleana(true);
        		
        	} else {
        		
        		respuesta.setRespuestaBooleana(false);
        	}
        	
        	return respuesta;
        }
     
    }
    