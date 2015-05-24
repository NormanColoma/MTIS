
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.example.www.matchmakingservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/MatchMakingService/".equals(namespaceURI) &&
                  "Match".equals(typeName)){
                   
                            return  org.example.www.matchmakingservice.Match.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/MatchMakingService/".equals(namespaceURI) &&
                  "DatosMatch".equals(typeName)){
                   
                            return  org.example.www.matchmakingservice.DatosMatch.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/MatchMakingService/".equals(namespaceURI) &&
                  "TeamMatch".equals(typeName)){
                   
                            return  org.example.www.matchmakingservice.TeamMatch.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/MatchMakingService/".equals(namespaceURI) &&
                  "Matches".equals(typeName)){
                   
                            return  org.example.www.matchmakingservice.Matches.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    