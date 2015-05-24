
/**
 * MatchMakingNotificacionServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.matchmakingnotificacionservice;

        /**
        *  MatchMakingNotificacionServiceMessageReceiverInOut message receiver
        */

        public class MatchMakingNotificacionServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MatchMakingNotificacionServiceSkeleton skel = (MatchMakingNotificacionServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("readNotify".equals(methodName)){
                
                org.example.www.matchmakingnotificacionservice.RespuestaBooleana respuestaBooleana20 = null;
	                        org.example.www.matchmakingnotificacionservice.NotifyId wrappedParam =
                                                             (org.example.www.matchmakingnotificacionservice.NotifyId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingnotificacionservice.NotifyId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana20 =
                                                   
                                                   
                                                         skel.readNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana20, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingNotificacionService/",
                                                    "readNotify"));
                                    } else 

            if("notifyTeam".equals(methodName)){
                
                org.example.www.matchmakingnotificacionservice.RespuestaBooleana respuestaBooleana22 = null;
	                        org.example.www.matchmakingnotificacionservice.NotifyE wrappedParam =
                                                             (org.example.www.matchmakingnotificacionservice.NotifyE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingnotificacionservice.NotifyE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana22 =
                                                   
                                                   
                                                         skel.notifyTeam(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana22, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingNotificacionService/",
                                                    "notifyTeam"));
                                    } else 

            if("getNotifyTeamList".equals(methodName)){
                
                org.example.www.matchmakingnotificacionservice.ListaNotificaciones listaNotificaciones24 = null;
	                        org.example.www.matchmakingnotificacionservice.TeamId wrappedParam =
                                                             (org.example.www.matchmakingnotificacionservice.TeamId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingnotificacionservice.TeamId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listaNotificaciones24 =
                                                   
                                                   
                                                         skel.getNotifyTeamList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listaNotificaciones24, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingNotificacionService/",
                                                    "getNotifyTeamList"));
                                    } else 

            if("deleteNotify".equals(methodName)){
                
                org.example.www.matchmakingnotificacionservice.RespuestaBooleana respuestaBooleana26 = null;
	                        org.example.www.matchmakingnotificacionservice.NotifyId wrappedParam =
                                                             (org.example.www.matchmakingnotificacionservice.NotifyId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingnotificacionservice.NotifyId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana26 =
                                                   
                                                   
                                                         skel.deleteNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana26, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingNotificacionService/",
                                                    "deleteNotify"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingnotificacionservice.NotifyId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingnotificacionservice.NotifyId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingnotificacionservice.RespuestaBooleana param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingnotificacionservice.RespuestaBooleana.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingnotificacionservice.NotifyE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingnotificacionservice.NotifyE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingnotificacionservice.TeamId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingnotificacionservice.TeamId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingnotificacionservice.ListaNotificaciones param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingnotificacionservice.ListaNotificaciones.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.matchmakingnotificacionservice.RespuestaBooleana param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.matchmakingnotificacionservice.RespuestaBooleana.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrapreadNotify(){
                                org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingnotificacionservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrapnotifyTeam(){
                                org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingnotificacionservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.matchmakingnotificacionservice.ListaNotificaciones param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.matchmakingnotificacionservice.ListaNotificaciones.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.matchmakingnotificacionservice.ListaNotificaciones wrapgetNotifyTeamList(){
                                org.example.www.matchmakingnotificacionservice.ListaNotificaciones wrappedElement = new org.example.www.matchmakingnotificacionservice.ListaNotificaciones();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrapdeleteNotify(){
                                org.example.www.matchmakingnotificacionservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingnotificacionservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.matchmakingnotificacionservice.NotifyId.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.NotifyId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.NotifyE.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.NotifyE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.TeamId.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.TeamId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.ListaNotificaciones.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.ListaNotificaciones.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.NotifyId.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.NotifyId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingnotificacionservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingnotificacionservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    