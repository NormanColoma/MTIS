
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.example.www.sportcenterservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/SportCenterService/".equals(namespaceURI) &&
                  "SportCenter".equals(typeName)){
                   
                            return  org.example.www.sportcenterservice.SportCenter.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SportCenterService/".equals(namespaceURI) &&
                  "Sport".equals(typeName)){
                   
                            return  org.example.www.sportcenterservice.Sport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/SportCenterService/".equals(namespaceURI) &&
                  "Field".equals(typeName)){
                   
                            return  org.example.www.sportcenterservice.Field.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    