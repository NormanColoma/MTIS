
/**
 * TournamentServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.example.www.tournamentservice;

    /**
     *  TournamentServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TournamentServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TournamentServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TournamentServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getTeamsdByTournament method
            * override this method for handling normal response from getTeamsdByTournament operation
            */
           public void receiveResultgetTeamsdByTournament(
                    org.example.www.tournamentservice.ListTeams result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTeamsdByTournament operation
           */
            public void receiveErrorgetTeamsdByTournament(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteTournament method
            * override this method for handling normal response from deleteTournament operation
            */
           public void receiveResultdeleteTournament(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteTournament operation
           */
            public void receiveErrordeleteTournament(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for validateInscription method
            * override this method for handling normal response from validateInscription operation
            */
           public void receiveResultvalidateInscription(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateInscription operation
           */
            public void receiveErrorvalidateInscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for startTournament method
            * override this method for handling normal response from startTournament operation
            */
           public void receiveResultstartTournament(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from startTournament operation
           */
            public void receiveErrorstartTournament(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvalibleTournaments method
            * override this method for handling normal response from getAvalibleTournaments operation
            */
           public void receiveResultgetAvalibleTournaments(
                    org.example.www.tournamentservice.ListTournaments result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvalibleTournaments operation
           */
            public void receiveErrorgetAvalibleTournaments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for disjoinTournament method
            * override this method for handling normal response from disjoinTournament operation
            */
           public void receiveResultdisjoinTournament(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from disjoinTournament operation
           */
            public void receiveErrordisjoinTournament(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addNewTournament method
            * override this method for handling normal response from addNewTournament operation
            */
           public void receiveResultaddNewTournament(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addNewTournament operation
           */
            public void receiveErroraddNewTournament(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for joinTournament method
            * override this method for handling normal response from joinTournament operation
            */
           public void receiveResultjoinTournament(
                    org.example.www.tournamentservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from joinTournament operation
           */
            public void receiveErrorjoinTournament(java.lang.Exception e) {
            }
                


    }
    