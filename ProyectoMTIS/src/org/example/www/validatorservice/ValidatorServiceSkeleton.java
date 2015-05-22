
/**
 * ValidatorServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.validatorservice;

    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    import javax.naming.NamingException;

    import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
    /**
     *  ValidatorServiceSkeleton java skeleton for the axisService
     */
    public class ValidatorServiceSkeleton{
        
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
                                     * @param validateMemberCode 
             * @return validateMemberCodeResponse 
         */
        
                 public org.example.www.validatorservice.ValidateMemberCodeResponse validateMemberCode
                  (
                  org.example.www.validatorservice.ValidateMemberCode validateMemberCode
                  )
            {
                	 ValidateMemberCodeResponse result = new ValidateMemberCodeResponse();
                     
                     try {
     					conectarDB();
     					statement = connect.createStatement();
     					String query = "select * from Member where code="+validateMemberCode.getCode();
               			ResultSet resultSet = statement.executeQuery(query);

               			if(resultSet.first()){
               				result.setValid(true);
               				result.setMessage("El miembro es válido");
               			}
               			else{
               				result.setValid(false);
               				result.setMessage("El miembro no es válido");
               			}
               			
     				} catch (NamingException e) {
     					result.setValid(false);
           				result.setMessage("El miembro no es válido: "+e.getMessage());
     				}
                 	catch (SQLException e) {
                 		result.setValid(false);
           				result.setMessage("El miembro no es válido: "+e.getMessage());
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
                                     * @param validateNIF 
             * @return validateNIFResponse 
         */
        
                 public org.example.www.validatorservice.ValidateNIFResponse validateNIF
                  (
                  org.example.www.validatorservice.ValidateNIF validateNIF
                  )
            {
                	 ValidateNIFResponse result = new ValidateNIFResponse();
                     
                     if(validateNIF.getNIF().length()!=9 || validateNIF.getNIF()==null) {
                 		result.setValid(false); 
                 		result.setMessage("El dni debe contener 9 carácteres");
                 		return result;
                 	}
                 	String dni = validateNIF.getNIF().substring(0, 8);
                 	char letra = validateNIF.getNIF().charAt(8);
                 	Pattern pattern = Pattern.compile("[0-9]{8,8}");
                 	Matcher matcher = pattern.matcher(dni);
                 	String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
                 	long ldni = 0;
                 	try {
                 		ldni = Long.parseLong(dni);
                 	} catch(NumberFormatException e) {
                 		result.setValid(false);
                 		result.setMessage("Formato de número incorrecto");
                 		return result;
                 	}
             		int indice = (int)(ldni % 23);
             		char letraEsperada = letras.charAt(indice);
             		result.setMessage("");
             		if(!matcher.matches()){
             			result.setMessage("No cumple con el patron");
             		}
             		if(letra!=letraEsperada){
             			result.setMessage("La letra no es correcta");
             		}
             		result.setValid(matcher.matches() && letra==letraEsperada);
                     
                     return(result);
        }
     
    } 