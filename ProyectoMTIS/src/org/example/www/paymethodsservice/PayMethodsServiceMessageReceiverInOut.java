
/**
 * PayMethodsServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.paymethodsservice;

        /**
        *  PayMethodsServiceMessageReceiverInOut message receiver
        */

        public class PayMethodsServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PayMethodsServiceSkeleton skel = (PayMethodsServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("validateMethod".equals(methodName)){
                
                org.example.www.paymethodsservice.ValidateMethodResponse validateMethodResponse13 = null;
	                        org.example.www.paymethodsservice.ValidateMethod wrappedParam =
                                                             (org.example.www.paymethodsservice.ValidateMethod)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.paymethodsservice.ValidateMethod.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateMethodResponse13 =
                                                   
                                                   
                                                         skel.validateMethod(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateMethodResponse13, false, new javax.xml.namespace.QName("http://www.example.org/PayMethodsService/",
                                                    "validateMethod"));
                                    } else 

            if("validateIBAN".equals(methodName)){
                
                org.example.www.paymethodsservice.ValidateIBANResponse validateIBANResponse15 = null;
	                        org.example.www.paymethodsservice.ValidateIBAN wrappedParam =
                                                             (org.example.www.paymethodsservice.ValidateIBAN)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.paymethodsservice.ValidateIBAN.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateIBANResponse15 =
                                                   
                                                   
                                                         skel.validateIBAN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateIBANResponse15, false, new javax.xml.namespace.QName("http://www.example.org/PayMethodsService/",
                                                    "validateIBAN"));
                                    } else 

            if("validateCreditCard".equals(methodName)){
                
                org.example.www.paymethodsservice.ValidateCreditCardResponse validateCreditCardResponse17 = null;
	                        org.example.www.paymethodsservice.ValidateCreditCard wrappedParam =
                                                             (org.example.www.paymethodsservice.ValidateCreditCard)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.paymethodsservice.ValidateCreditCard.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateCreditCardResponse17 =
                                                   
                                                   
                                                         skel.validateCreditCard(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateCreditCardResponse17, false, new javax.xml.namespace.QName("http://www.example.org/PayMethodsService/",
                                                    "validateCreditCard"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateMethod param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateMethod.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateMethodResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateMethodResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateIBAN param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateIBAN.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateIBANResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateIBANResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateCreditCard param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateCreditCard.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.paymethodsservice.ValidateCreditCardResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.paymethodsservice.ValidateCreditCardResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.paymethodsservice.ValidateMethodResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.paymethodsservice.ValidateMethodResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.paymethodsservice.ValidateMethodResponse wrapvalidateMethod(){
                                org.example.www.paymethodsservice.ValidateMethodResponse wrappedElement = new org.example.www.paymethodsservice.ValidateMethodResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.paymethodsservice.ValidateIBANResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.paymethodsservice.ValidateIBANResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.paymethodsservice.ValidateIBANResponse wrapvalidateIBAN(){
                                org.example.www.paymethodsservice.ValidateIBANResponse wrappedElement = new org.example.www.paymethodsservice.ValidateIBANResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.paymethodsservice.ValidateCreditCardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.paymethodsservice.ValidateCreditCardResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.paymethodsservice.ValidateCreditCardResponse wrapvalidateCreditCard(){
                                org.example.www.paymethodsservice.ValidateCreditCardResponse wrappedElement = new org.example.www.paymethodsservice.ValidateCreditCardResponse();
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
        
                if (org.example.www.paymethodsservice.ValidateMethod.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateMethod.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.paymethodsservice.ValidateMethodResponse.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateMethodResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.paymethodsservice.ValidateIBAN.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateIBAN.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.paymethodsservice.ValidateIBANResponse.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateIBANResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.paymethodsservice.ValidateCreditCard.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateCreditCard.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.paymethodsservice.ValidateCreditCardResponse.class.equals(type)){
                
                           return org.example.www.paymethodsservice.ValidateCreditCardResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    