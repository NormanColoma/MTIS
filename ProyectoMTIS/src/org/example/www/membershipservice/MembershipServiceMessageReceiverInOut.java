
/**
 * MembershipServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.membershipservice;

        /**
        *  MembershipServiceMessageReceiverInOut message receiver
        */

        public class MembershipServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MembershipServiceSkeleton skel = (MembershipServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("registerMember".equals(methodName)){
                
                org.example.www.membershipservice.RegisterMemberResponse registerMemberResponse17 = null;
	                        org.example.www.membershipservice.RegisterMember wrappedParam =
                                                             (org.example.www.membershipservice.RegisterMember)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.membershipservice.RegisterMember.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerMemberResponse17 =
                                                   
                                                   
                                                         skel.registerMember(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerMemberResponse17, false, new javax.xml.namespace.QName("http://www.example.org/MembershipService/",
                                                    "registerMember"));
                                    } else 

            if("checkMember".equals(methodName)){
                
                org.example.www.membershipservice.CheckMemberResponse checkMemberResponse19 = null;
	                        org.example.www.membershipservice.CheckMember wrappedParam =
                                                             (org.example.www.membershipservice.CheckMember)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.membershipservice.CheckMember.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkMemberResponse19 =
                                                   
                                                   
                                                         skel.checkMember(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkMemberResponse19, false, new javax.xml.namespace.QName("http://www.example.org/MembershipService/",
                                                    "checkMember"));
                                    } else 

            if("getMember".equals(methodName)){
                
                org.example.www.membershipservice.GetMemberResponse getMemberResponse21 = null;
	                        org.example.www.membershipservice.GetMember wrappedParam =
                                                             (org.example.www.membershipservice.GetMember)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.membershipservice.GetMember.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMemberResponse21 =
                                                   
                                                   
                                                         skel.getMember(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMemberResponse21, false, new javax.xml.namespace.QName("http://www.example.org/MembershipService/",
                                                    "getMember"));
                                    } else 

            if("updateMember".equals(methodName)){
                
                org.example.www.membershipservice.UpdateMemberResponse updateMemberResponse23 = null;
	                        org.example.www.membershipservice.UpdateMember wrappedParam =
                                                             (org.example.www.membershipservice.UpdateMember)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.membershipservice.UpdateMember.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateMemberResponse23 =
                                                   
                                                   
                                                         skel.updateMember(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateMemberResponse23, false, new javax.xml.namespace.QName("http://www.example.org/MembershipService/",
                                                    "updateMember"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.RegisterMember param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.RegisterMember.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.RegisterMemberResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.RegisterMemberResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.CheckMember param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.CheckMember.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.CheckMemberResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.CheckMemberResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.GetMember param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.GetMember.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.GetMemberResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.GetMemberResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.UpdateMember param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.UpdateMember.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.membershipservice.UpdateMemberResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.membershipservice.UpdateMemberResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.membershipservice.RegisterMemberResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.membershipservice.RegisterMemberResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.membershipservice.RegisterMemberResponse wrapregisterMember(){
                                org.example.www.membershipservice.RegisterMemberResponse wrappedElement = new org.example.www.membershipservice.RegisterMemberResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.membershipservice.CheckMemberResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.membershipservice.CheckMemberResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.membershipservice.CheckMemberResponse wrapcheckMember(){
                                org.example.www.membershipservice.CheckMemberResponse wrappedElement = new org.example.www.membershipservice.CheckMemberResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.membershipservice.GetMemberResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.membershipservice.GetMemberResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.membershipservice.GetMemberResponse wrapgetMember(){
                                org.example.www.membershipservice.GetMemberResponse wrappedElement = new org.example.www.membershipservice.GetMemberResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.membershipservice.UpdateMemberResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.membershipservice.UpdateMemberResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.membershipservice.UpdateMemberResponse wrapupdateMember(){
                                org.example.www.membershipservice.UpdateMemberResponse wrappedElement = new org.example.www.membershipservice.UpdateMemberResponse();
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
        
                if (org.example.www.membershipservice.RegisterMember.class.equals(type)){
                
                           return org.example.www.membershipservice.RegisterMember.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.RegisterMemberResponse.class.equals(type)){
                
                           return org.example.www.membershipservice.RegisterMemberResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.CheckMember.class.equals(type)){
                
                           return org.example.www.membershipservice.CheckMember.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.CheckMemberResponse.class.equals(type)){
                
                           return org.example.www.membershipservice.CheckMemberResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.GetMember.class.equals(type)){
                
                           return org.example.www.membershipservice.GetMember.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.GetMemberResponse.class.equals(type)){
                
                           return org.example.www.membershipservice.GetMemberResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.UpdateMember.class.equals(type)){
                
                           return org.example.www.membershipservice.UpdateMember.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.membershipservice.UpdateMemberResponse.class.equals(type)){
                
                           return org.example.www.membershipservice.UpdateMemberResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    