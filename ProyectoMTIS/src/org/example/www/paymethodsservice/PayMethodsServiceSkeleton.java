
/**
 * PayMethodsServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.paymethodsservice;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.NamingException;

import com.mysql.jdbc.StringUtils;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
    /**
     *  PayMethodsServiceSkeleton java skeleton for the axisService
     */
    public class PayMethodsServiceSkeleton{
        
    	private MysqlDataSource ds = null;
    	private Connection connect = null;
    	private Statement statement = null;
    	
        public void conectarDB() throws NamingException 
        {
        	
        	try
        	{
        		ds = new MysqlDataSource();
        		ds.setUrl("jdbc:mysql://localhost:3306/tienda");
        		ds.setUser("root");
        		ds.setPassword("");
        		
        		connect = ds.getConnection();
        		
        	}
        	catch(SQLException e)
        	{
        		e.printStackTrace();
        	}
        }
        /**
         * Auto generated method signature
         * 
                                     * @param validateMethod 
             * @return validateMethodResponse 
         */
        
                 public org.example.www.paymethodsservice.ValidateMethodResponse validateMethod
                  (
                  org.example.www.paymethodsservice.ValidateMethod validateMethod
                  )
            {
                ValidateMethodResponse result = new ValidateMethodResponse();
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select payMethodSelect from Boocking where code="+validateMethod.getCode();
          			ResultSet resultSet = statement.executeQuery(query);
          			resultSet.next();
          			String expectedMethod = resultSet.getString("payMethodSelect");
          			if(expectedMethod.equals("efectivo") || expectedMethod.equals("tarjeta"))
          			{
          				result.setStatus(true);
          				result.setMessage("Método validado con éxito");
          			}
				} catch (NamingException e) {
					result.setStatus(false);
      				result.setMessage("No se ha validado la reserva: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setStatus(false);
      				result.setMessage("No se ha validado la reserva: "+e.getMessage());
				}
            	finally
	        	 {
	            	try
	        		{
	        			connect.close();
	        			statement.close();
	        		}
	        		catch(SQLException e)
	        		{
	        			e.printStackTrace();
	        		}
	        	 }
                
                return(result);
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param validateIBAN 
             * @return validateIBANResponse 
         */
        
                 public org.example.www.paymethodsservice.ValidateIBANResponse validateIBAN
                  (
                  org.example.www.paymethodsservice.ValidateIBAN validateIBAN
                  )
            {
                	ValidateIBANResponse result = new ValidateIBANResponse();
                	 
                	final String E = "14";
 	        		final String S = "28";
 	        		BigInteger BD_97 = new BigInteger("97");
 	        		BigInteger BD_98 = new BigInteger("98");
 	
 	        		if (StringUtils.isEmptyOrWhitespaceOnly(validateIBAN.getIban())) {
 	        			result.setStatus(true);
 	        			result.setMessage("IBAN vacío");
 	        			return(result);
 	        		}
 	        		Pattern cuentaPattern = Pattern.compile("\\D{2}\\d{22}");
 	        		Matcher m = cuentaPattern.matcher(validateIBAN.getIban());
 	        		if (m.matches()) {
 		        		// cuenta cumple el patrón (24 dígitos)
 		        		String dC = validateIBAN.getIban().substring(2, 4);
 		        		String restoCuenta = validateIBAN.getIban().substring(4, 24);
 		        		String cuentaComprobacion = restoCuenta + E + S + dC;
 		        		BigInteger b = new BigInteger(cuentaComprobacion);
 		        		b = b.divideAndRemainder(BD_97)[1];
 		        		b = BD_98.min(b);
 		        		b = b.divideAndRemainder(BD_97)[1];
 		        		int mod = b.intValue();
 		        		// return ((int)(98 - (Long.parseLong(bban) * 100) % 97L)) % 97;
 		        		if (mod != 1) {
 		        			result.setStatus(false);
 		        			result.setMessage("Módulo diferente de 1");
 		        			return result;
 		        		}
 		        		result.setStatus(true);
 		        		result.setMessage("IBAN validado con éxito!");
 		        		return(result);
 	
 	        		}
 	        		result.setStatus(false);
 	        		result.setMessage("No cumple con el patrón");
                     
                    return(result);
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param validateCreditCard 
             * @return validateCreditCardResponse 
         */
        
                 public org.example.www.paymethodsservice.ValidateCreditCardResponse validateCreditCard
                  (
                  org.example.www.paymethodsservice.ValidateCreditCard validateCreditCard
                  )
            {
                	 ValidateCreditCardResponse result = new ValidateCreditCardResponse();
  
            		 String cadena = validateCreditCard.getNumber();
            		 int longitud = cadena.length();
            		 int cifra = 0;
            		 String cifra_cad="";
            		 int suma=0;
            		 for (int i=0; i < longitud; i+=2){
	            		   cifra = Integer.parseInt(cadena.charAt(i)+"")*2;
	            		   if (cifra > 9){ 
		            		     cifra_cad = cifra+"";
		            		     cifra = Integer.parseInt(cifra_cad.charAt(0)+"") + Integer.parseInt(cifra_cad.charAt(1)+"");
	            		   }
	            		   suma+=cifra;
            		 }
            		 for (int i=1; i < longitud; i+=2){
            			 suma += Integer.parseInt(cadena.charAt(i)+"");
            		 }
            			
            		 if ((suma % 10) == 0){
            			 result.setStatus(true);
            			 result.setMessage("Número de tarjeta correcto");
            		 } else {
            			 result.setStatus(false);
            			 result.setMessage("El número de tarjeta no es válido");
            		 }
            		 
            		 return(result);
        }
     
    }
   