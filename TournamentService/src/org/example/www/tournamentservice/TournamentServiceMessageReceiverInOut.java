
/**
 * TournamentServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.tournamentservice;

        /**
        *  TournamentServiceMessageReceiverInOut message receiver
        */

        public class TournamentServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TournamentServiceSkeleton skel = (TournamentServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTeamsdByTournament".equals(methodName)){
                
                org.example.www.tournamentservice.ListTeams listTeams41 = null;
	                        org.example.www.tournamentservice.TournamentId wrappedParam =
                                                             (org.example.www.tournamentservice.TournamentId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.TournamentId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listTeams41 =
                                                   
                                                   
                                                         skel.getTeamsdByTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listTeams41, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "getTeamsdByTournament"));
                                    } else 

            if("deleteTournament".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana43 = null;
	                        org.example.www.tournamentservice.TournamentId wrappedParam =
                                                             (org.example.www.tournamentservice.TournamentId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.TournamentId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana43 =
                                                   
                                                   
                                                         skel.deleteTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana43, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "deleteTournament"));
                                    } else 

            if("validateInscription".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana45 = null;
	                        org.example.www.tournamentservice.Inscripcion wrappedParam =
                                                             (org.example.www.tournamentservice.Inscripcion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.Inscripcion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana45 =
                                                   
                                                   
                                                         skel.validateInscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana45, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "validateInscription"));
                                    } else 

            if("startTournament".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana47 = null;
	                        org.example.www.tournamentservice.TournamentId wrappedParam =
                                                             (org.example.www.tournamentservice.TournamentId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.TournamentId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana47 =
                                                   
                                                   
                                                         skel.startTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana47, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "startTournament"));
                                    } else 

            if("getAvalibleTournaments".equals(methodName)){
                
                org.example.www.tournamentservice.ListTournaments listTournaments49 = null;
	                        org.example.www.tournamentservice.Sport wrappedParam =
                                                             (org.example.www.tournamentservice.Sport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.Sport.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listTournaments49 =
                                                   
                                                   
                                                         skel.getAvalibleTournaments(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listTournaments49, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "getAvalibleTournaments"));
                                    } else 

            if("disjoinTournament".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana51 = null;
	                        org.example.www.tournamentservice.TournamentTeamE wrappedParam =
                                                             (org.example.www.tournamentservice.TournamentTeamE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.TournamentTeamE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana51 =
                                                   
                                                   
                                                         skel.disjoinTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana51, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "disjoinTournament"));
                                    } else 

            if("addNewTournament".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana53 = null;
	                        org.example.www.tournamentservice.NewTournement wrappedParam =
                                                             (org.example.www.tournamentservice.NewTournement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.NewTournement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana53 =
                                                   
                                                   
                                                         skel.addNewTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana53, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "addNewTournament"));
                                    } else 

            if("joinTournament".equals(methodName)){
                
                org.example.www.tournamentservice.RespuestaBooleana respuestaBooleana55 = null;
	                        org.example.www.tournamentservice.TournamentTeamE wrappedParam =
                                                             (org.example.www.tournamentservice.TournamentTeamE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.tournamentservice.TournamentTeamE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               respuestaBooleana55 =
                                                   
                                                   
                                                         skel.joinTournament(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), respuestaBooleana55, false, new javax.xml.namespace.QName("http://www.example.org/TournamentService/",
                                                    "joinTournament"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.TournamentId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.TournamentId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.ListTeams param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.ListTeams.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.RespuestaBooleana param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.RespuestaBooleana.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.Inscripcion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.Inscripcion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.Sport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.Sport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.ListTournaments param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.ListTournaments.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.TournamentTeamE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.TournamentTeamE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.tournamentservice.NewTournement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.tournamentservice.NewTournement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.tournamentservice.ListTeams param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.tournamentservice.ListTeams.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.tournamentservice.ListTeams wrapgetTeamsdByTournament(){
                                org.example.www.tournamentservice.ListTeams wrappedElement = new org.example.www.tournamentservice.ListTeams();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.tournamentservice.RespuestaBooleana param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.tournamentservice.RespuestaBooleana.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapdeleteTournament(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapvalidateInscription(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapstartTournament(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.tournamentservice.ListTournaments param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.tournamentservice.ListTournaments.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.tournamentservice.ListTournaments wrapgetAvalibleTournaments(){
                                org.example.www.tournamentservice.ListTournaments wrappedElement = new org.example.www.tournamentservice.ListTournaments();
                                return wrappedElement;
                         }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapdisjoinTournament(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapaddNewTournament(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
                                return wrappedElement;
                         }
                    
                         private org.example.www.tournamentservice.RespuestaBooleana wrapjoinTournament(){
                                org.example.www.tournamentservice.RespuestaBooleana wrappedElement = new org.example.www.tournamentservice.RespuestaBooleana();
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
        
                if (org.example.www.tournamentservice.TournamentId.class.equals(type)){
                
                           return org.example.www.tournamentservice.TournamentId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.ListTeams.class.equals(type)){
                
                           return org.example.www.tournamentservice.ListTeams.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.TournamentId.class.equals(type)){
                
                           return org.example.www.tournamentservice.TournamentId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.Inscripcion.class.equals(type)){
                
                           return org.example.www.tournamentservice.Inscripcion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.TournamentId.class.equals(type)){
                
                           return org.example.www.tournamentservice.TournamentId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.Sport.class.equals(type)){
                
                           return org.example.www.tournamentservice.Sport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.ListTournaments.class.equals(type)){
                
                           return org.example.www.tournamentservice.ListTournaments.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.TournamentTeamE.class.equals(type)){
                
                           return org.example.www.tournamentservice.TournamentTeamE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.NewTournement.class.equals(type)){
                
                           return org.example.www.tournamentservice.NewTournement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.TournamentTeamE.class.equals(type)){
                
                           return org.example.www.tournamentservice.TournamentTeamE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.tournamentservice.RespuestaBooleana.class.equals(type)){
                
                           return org.example.www.tournamentservice.RespuestaBooleana.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    