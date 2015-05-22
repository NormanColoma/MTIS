
/**
 * BookingServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.bookingservice;

        /**
        *  BookingServiceMessageReceiverInOut message receiver
        */

        public class BookingServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BookingServiceSkeleton skel = (BookingServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("cancelBooking".equals(methodName)){
                
                org.example.www.bookingservice.CancelBookingResponse cancelBookingResponse25 = null;
	                        org.example.www.bookingservice.CancelBooking wrappedParam =
                                                             (org.example.www.bookingservice.CancelBooking)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.CancelBooking.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelBookingResponse25 =
                                                   
                                                   
                                                         skel.cancelBooking(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelBookingResponse25, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "cancelBooking"));
                                    } else 

            if("validateBooking".equals(methodName)){
                
                org.example.www.bookingservice.ValidateBookingResponse validateBookingResponse27 = null;
	                        org.example.www.bookingservice.ValidateBooking wrappedParam =
                                                             (org.example.www.bookingservice.ValidateBooking)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.ValidateBooking.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateBookingResponse27 =
                                                   
                                                   
                                                         skel.validateBooking(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateBookingResponse27, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "validateBooking"));
                                    } else 

            if("getFields".equals(methodName)){
                
                org.example.www.bookingservice.GetFieldsResponse getFieldsResponse29 = null;
	                        org.example.www.bookingservice.GetFields wrappedParam =
                                                             (org.example.www.bookingservice.GetFields)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.GetFields.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFieldsResponse29 =
                                                   
                                                   
                                                         skel.getFields(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFieldsResponse29, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "getFields"));
                                    } else 

            if("getBookings".equals(methodName)){
                
                org.example.www.bookingservice.GetBookingsResponse getBookingsResponse31 = null;
	                        org.example.www.bookingservice.GetBookings wrappedParam =
                                                             (org.example.www.bookingservice.GetBookings)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.GetBookings.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBookingsResponse31 =
                                                   
                                                   
                                                         skel.getBookings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBookingsResponse31, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "getBookings"));
                                    } else 

            if("createBooking".equals(methodName)){
                
                org.example.www.bookingservice.CreateBookingResponse createBookingResponse33 = null;
	                        org.example.www.bookingservice.CreateBooking wrappedParam =
                                                             (org.example.www.bookingservice.CreateBooking)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.CreateBooking.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createBookingResponse33 =
                                                   
                                                   
                                                         skel.createBooking(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createBookingResponse33, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "createBooking"));
                                    } else 

            if("getBooking".equals(methodName)){
                
                org.example.www.bookingservice.GetBookingResponse getBookingResponse35 = null;
	                        org.example.www.bookingservice.GetBooking wrappedParam =
                                                             (org.example.www.bookingservice.GetBooking)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.bookingservice.GetBooking.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBookingResponse35 =
                                                   
                                                   
                                                         skel.getBooking(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBookingResponse35, false, new javax.xml.namespace.QName("http://www.example.org/BookingService/",
                                                    "getBooking"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.CancelBooking param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.CancelBooking.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.CancelBookingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.CancelBookingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.ValidateBooking param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.ValidateBooking.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.ValidateBookingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.ValidateBookingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetFields param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetFields.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetFieldsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetFieldsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetBookings param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetBookings.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetBookingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetBookingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.CreateBooking param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.CreateBooking.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.CreateBookingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.CreateBookingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetBooking param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetBooking.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.bookingservice.GetBookingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.bookingservice.GetBookingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.CancelBookingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.CancelBookingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.CancelBookingResponse wrapcancelBooking(){
                                org.example.www.bookingservice.CancelBookingResponse wrappedElement = new org.example.www.bookingservice.CancelBookingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.ValidateBookingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.ValidateBookingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.ValidateBookingResponse wrapvalidateBooking(){
                                org.example.www.bookingservice.ValidateBookingResponse wrappedElement = new org.example.www.bookingservice.ValidateBookingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.GetFieldsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.GetFieldsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.GetFieldsResponse wrapgetFields(){
                                org.example.www.bookingservice.GetFieldsResponse wrappedElement = new org.example.www.bookingservice.GetFieldsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.GetBookingsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.GetBookingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.GetBookingsResponse wrapgetBookings(){
                                org.example.www.bookingservice.GetBookingsResponse wrappedElement = new org.example.www.bookingservice.GetBookingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.CreateBookingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.CreateBookingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.CreateBookingResponse wrapcreateBooking(){
                                org.example.www.bookingservice.CreateBookingResponse wrappedElement = new org.example.www.bookingservice.CreateBookingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.bookingservice.GetBookingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.bookingservice.GetBookingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.bookingservice.GetBookingResponse wrapgetBooking(){
                                org.example.www.bookingservice.GetBookingResponse wrappedElement = new org.example.www.bookingservice.GetBookingResponse();
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
        
                if (org.example.www.bookingservice.CancelBooking.class.equals(type)){
                
                           return org.example.www.bookingservice.CancelBooking.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.CancelBookingResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.CancelBookingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.ValidateBooking.class.equals(type)){
                
                           return org.example.www.bookingservice.ValidateBooking.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.ValidateBookingResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.ValidateBookingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetFields.class.equals(type)){
                
                           return org.example.www.bookingservice.GetFields.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetFieldsResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.GetFieldsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetBookings.class.equals(type)){
                
                           return org.example.www.bookingservice.GetBookings.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetBookingsResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.GetBookingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.CreateBooking.class.equals(type)){
                
                           return org.example.www.bookingservice.CreateBooking.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.CreateBookingResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.CreateBookingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetBooking.class.equals(type)){
                
                           return org.example.www.bookingservice.GetBooking.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.bookingservice.GetBookingResponse.class.equals(type)){
                
                           return org.example.www.bookingservice.GetBookingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    