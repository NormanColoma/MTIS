
/**
 * MatchMakingServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.matchmakingservice;

import org.example.www.matchmakingnotificacionservice.RespuestaBooleana;

        /**
        *  MatchMakingServiceMessageReceiverInOut message receiver
        */

        public class MatchMakingServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MatchMakingServiceSkeleton skel = (MatchMakingServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("joinMatch".equals(methodName)){
                
                org.example.www.matchmakingservice.RespuestaBooleana respuestaBooleana37 = null;
	                        org.example.www.matchmakingservice.TeamMatchE wrappedParam =
                                                             (org.example.www.matchmakingservice.TeamMatchE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.TeamMatchE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana37 =
                                                   
                                                   
                                                         skel.joinMatch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana37, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "joinMatch"));
                                    } else 

            if("disjoinMatch".equals(methodName)){
                
                org.example.www.matchmakingservice.RespuestaBooleana respuestaBooleana39 = null;
	                        org.example.www.matchmakingservice.TeamMatchE wrappedParam =
                                                             (org.example.www.matchmakingservice.TeamMatchE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.TeamMatchE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana39 =
                                                   
                                                   
                                                         skel.disjoinMatch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana39, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "disjoinMatch"));
                                    } else 

            if("addNewMatch".equals(methodName)){
                
                org.example.www.matchmakingservice.RespuestaBooleana respuestaBooleana41 = null;
	                        org.example.www.matchmakingservice.MatchE wrappedParam =
                                                             (org.example.www.matchmakingservice.MatchE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.MatchE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana41 =
                                                   
                                                   
                                                         skel.addNewMatch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana41, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "addNewMatch"));
                                    } else 

            if("confirmMatch".equals(methodName)){
                
                org.example.www.matchmakingservice.RespuestaBooleana respuestaBooleana43 = null;
	                        org.example.www.matchmakingservice.IdMatch wrappedParam =
                                                             (org.example.www.matchmakingservice.IdMatch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.IdMatch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana43 =
                                                   
                                                   
                                                         skel.confirmMatch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana43, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "confirmMatch"));
                                    } else 

            if("deleteMatch".equals(methodName)){
                
                org.example.www.matchmakingservice.RespuestaBooleana respuestaBooleana45 = null;
	                        org.example.www.matchmakingservice.IdMatch wrappedParam =
                                                             (org.example.www.matchmakingservice.IdMatch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.IdMatch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana45 =
                                                   
                                                   
                                                         skel.deleteMatch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana45, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "deleteMatch"));
                                    } else 

            

            if("getAvalibleMatches".equals(methodName)){
                
                org.example.www.matchmakingservice.ListaPartidosDisponibles listaPartidosDisponibles49 = null;
	                        org.example.www.matchmakingservice.Sport wrappedParam =
                                                             (org.example.www.matchmakingservice.Sport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.matchmakingservice.Sport.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listaPartidosDisponibles49 =
                                                   
                                                   
                                                         skel.getAvalibleMatches(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listaPartidosDisponibles49, false, new javax.xml.namespace.QName("http://www.example.org/MatchMakingService/",
                                                    "getAvalibleMatches"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.TeamMatchE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.TeamMatchE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.RespuestaBooleana param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.RespuestaBooleana.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.MatchE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.MatchE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.IdMatch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.IdMatch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.Sport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.Sport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.matchmakingservice.ListaPartidosDisponibles param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.matchmakingservice.ListaPartidosDisponibles.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.matchmakingservice.RespuestaBooleana param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.matchmakingservice.RespuestaBooleana.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapjoinMatch(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapdisjoinMatch(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapaddNewMatch(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapconfirmMatch(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapdeleteMatch(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.matchmakingservice.RespuestaBooleana wrapnotifyTeam(){
                                org.example.www.matchmakingservice.RespuestaBooleana wrappedElement = new org.example.www.matchmakingservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.matchmakingservice.ListaPartidosDisponibles param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.matchmakingservice.ListaPartidosDisponibles.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.matchmakingservice.ListaPartidosDisponibles wrapgetAvalibleMatches(){
                                org.example.www.matchmakingservice.ListaPartidosDisponibles wrappedElement = new org.example.www.matchmakingservice.ListaPartidosDisponibles();
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
        
                if (org.example.www.matchmakingservice.TeamMatchE.class.equals(type)){
                
                           return org.example.www.matchmakingservice.TeamMatchE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.TeamMatchE.class.equals(type)){
                
                           return org.example.www.matchmakingservice.TeamMatchE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.MatchE.class.equals(type)){
                
                           return org.example.www.matchmakingservice.MatchE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.IdMatch.class.equals(type)){
                
                           return org.example.www.matchmakingservice.IdMatch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.IdMatch.class.equals(type)){
                
                           return org.example.www.matchmakingservice.IdMatch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.TeamMatchE.class.equals(type)){
                
                           return org.example.www.matchmakingservice.TeamMatchE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.matchmakingservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.Sport.class.equals(type)){
                
                           return org.example.www.matchmakingservice.Sport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.matchmakingservice.ListaPartidosDisponibles.class.equals(type)){
                
                           return org.example.www.matchmakingservice.ListaPartidosDisponibles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    