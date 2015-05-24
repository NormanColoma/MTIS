
/**
 * MatchMakingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.example.www.matchmakingservice;

    /**
     *  MatchMakingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MatchMakingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MatchMakingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MatchMakingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for joinMatch method
            * override this method for handling normal response from joinMatch operation
            */
           public void receiveResultjoinMatch(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from joinMatch operation
           */
            public void receiveErrorjoinMatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for disjoinMatch method
            * override this method for handling normal response from disjoinMatch operation
            */
           public void receiveResultdisjoinMatch(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from disjoinMatch operation
           */
            public void receiveErrordisjoinMatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addNewMatch method
            * override this method for handling normal response from addNewMatch operation
            */
           public void receiveResultaddNewMatch(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addNewMatch operation
           */
            public void receiveErroraddNewMatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for confirmMatch method
            * override this method for handling normal response from confirmMatch operation
            */
           public void receiveResultconfirmMatch(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from confirmMatch operation
           */
            public void receiveErrorconfirmMatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteMatch method
            * override this method for handling normal response from deleteMatch operation
            */
           public void receiveResultdeleteMatch(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteMatch operation
           */
            public void receiveErrordeleteMatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for notifyTeam method
            * override this method for handling normal response from notifyTeam operation
            */
           public void receiveResultnotifyTeam(
                    org.example.www.matchmakingservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from notifyTeam operation
           */
            public void receiveErrornotifyTeam(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvalibleMatches method
            * override this method for handling normal response from getAvalibleMatches operation
            */
           public void receiveResultgetAvalibleMatches(
                    org.example.www.matchmakingservice.ListaPartidosDisponibles result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvalibleMatches operation
           */
            public void receiveErrorgetAvalibleMatches(java.lang.Exception e) {
            }
                


    }
    