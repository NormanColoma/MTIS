
/**
 * MatchMakingNotificacionServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.example.www.matchmakingnotificacionservice;

    /**
     *  MatchMakingNotificacionServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MatchMakingNotificacionServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MatchMakingNotificacionServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MatchMakingNotificacionServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for readNotify method
            * override this method for handling normal response from readNotify operation
            */
           public void receiveResultreadNotify(
                    org.example.www.matchmakingnotificacionservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from readNotify operation
           */
            public void receiveErrorreadNotify(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for notifyTeam method
            * override this method for handling normal response from notifyTeam operation
            */
           public void receiveResultnotifyTeam(
                    org.example.www.matchmakingnotificacionservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from notifyTeam operation
           */
            public void receiveErrornotifyTeam(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNotifyTeamList method
            * override this method for handling normal response from getNotifyTeamList operation
            */
           public void receiveResultgetNotifyTeamList(
                    org.example.www.matchmakingnotificacionservice.ListaNotificaciones result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNotifyTeamList operation
           */
            public void receiveErrorgetNotifyTeamList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteNotify method
            * override this method for handling normal response from deleteNotify operation
            */
           public void receiveResultdeleteNotify(
                    org.example.www.matchmakingnotificacionservice.RespuestaBooleana result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteNotify operation
           */
            public void receiveErrordeleteNotify(java.lang.Exception e) {
            }
                


    }
    