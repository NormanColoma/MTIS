
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.example.www.tournamentservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "newTournament".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.NewTournament.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "tournamentTeam".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.TournamentTeam.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "Tournament".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.Tournament.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "Team".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.Team.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "inscripcionTorneo".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.InscripcionTorneo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "Teams".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.Teams.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/TournamentService/".equals(namespaceURI) &&
                  "Tournaments".equals(typeName)){
                   
                            return  org.example.www.tournamentservice.Tournaments.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    