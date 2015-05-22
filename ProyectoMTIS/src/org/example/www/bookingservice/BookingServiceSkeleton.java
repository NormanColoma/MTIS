
/**
 * BookingServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.bookingservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
    /**
     *  BookingServiceSkeleton java skeleton for the axisService
     */
    public class BookingServiceSkeleton{
        
    	private MysqlDataSource ds = null;
    	private Connection connect = null;
    	private Statement statement = null;
    	
        public void conectarDB() throws NamingException 
        {
        	
        	try
        	{
        		ds = new MysqlDataSource();
        		ds.setUrl("jdbc:mysql://localhost:3306/centrosdeportivos");
        		ds.setUser("root");
        		ds.setPassword("capullo");
        		
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
                                     * @param cancelBooking 
             * @return cancelBookingResponse 
         */
        
                 public org.example.www.bookingservice.CancelBookingResponse cancelBooking
                  (
                  org.example.www.bookingservice.CancelBooking cancelBooking
                  )
            {
                	 CancelBookingResponse result = new CancelBookingResponse();
                	 
                	try {
						conectarDB();
						statement = connect.createStatement();
						String delete = "delete from boocking where idField="+cancelBooking.getBooking().getIdField()+" and"
								+ " date='"+cancelBooking.getBooking().getDate()+"'";
	          			int resultSet = statement.executeUpdate(delete);
	          			if(resultSet>0){
	          				result.setOk(true);
	          				result.setMessage("Reserva borrada con éxito");
	          			}
	          			else{
	          				result.setOk(false);
	          				result.setMessage("No se ha encontrado la reserva");
	          			}
					} catch (NamingException e) {
						result.setOk(false);
          				result.setMessage("No se ha podido borrar la reserva: "+e.getMessage());
					}
                	catch (SQLException e) {
                		result.setOk(false);
          				result.setMessage("No se ha podido borrar la reserva "+e.getMessage());
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
                                     * @param validateBooking 
             * @return validateBookingResponse 
         */
        
                 public org.example.www.bookingservice.ValidateBookingResponse validateBooking
                  (
                  org.example.www.bookingservice.ValidateBooking validateBooking
                  )
            {
                ValidateBookingResponse result = new ValidateBookingResponse();
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select * from boocking where code="+validateBooking.getBooking().getCode()+" and date='"
							+validateBooking.getBooking().getDate()+"'";
          			ResultSet resultSet = statement.executeQuery(query);
          			
          			if(resultSet.first()){
          				result.setOk(true);
          				result.setMessage("Reserva validada con éxito");
          			}
          			else{
          				result.setOk(false);
          				result.setMessage("No se ha encontrado la reserva");
          			}
				} catch (NamingException e) {
					result.setOk(false);
      				result.setMessage("No se ha podido borrar la reserva: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setOk(false);
      				result.setMessage("No se ha podido borrar la reserva "+e.getMessage());
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
                                     * @param getFields 
             * @return getFieldsResponse 
         */
        
                 public org.example.www.bookingservice.GetFieldsResponse getFields
                  (
                  org.example.www.bookingservice.GetFields getFields
                  )
            {
                GetFieldsResponse result = new GetFieldsResponse();
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select * from field left join sportCenter on sportCenter.id=field.sportCenter left join boocking on "
							+ "boocking.idField=field.id where sportCenter.name='"+getFields.getSportCenter()+"' and boocking.date not in"
							+ "('"+getFields.getDate()+"')";
					String query2 = "select count(*) from field left join sportCenter on sportCenter.id=field.sportCenter left join boocking on "
							+ "boocking.idField=field.id where sportCenter.name='"+getFields.getSportCenter()+"' and boocking.date not in"
							+ "('"+getFields.getDate()+"')";

          			ResultSet resultSet2 = statement.executeQuery(query2);
          			resultSet2.next();
      				Field[] fields = new Field[resultSet2.getInt(1)];
      				ResultSet resultSet = statement.executeQuery(query);
          			Field field = new Field();
          			
          			for(int i=0;resultSet.next();i++)
          			{
          				field.setName(resultSet.getString("field.name"));
          				field.setStartDate(resultSet.getString("startDate"));
          				field.setEndDate(resultSet.getString("endDate"));
          				field.setSportCenter(getFields.getSportCenter());
          				fields[i] = field;
          			}
          			result.setFields(fields);
				} catch (NamingException e) {
					System.out.println("No se ha podido obtener los campos: "+e.getMessage());
				}
            	catch (SQLException e) {
            		System.out.println("No se ha podido obtener los campos: "+e.getMessage());
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
                                     * @param createBooking 
             * @return createBookingResponse 
         */
        
                 public org.example.www.bookingservice.CreateBookingResponse createBooking
                  (
                  org.example.www.bookingservice.CreateBooking createBooking
                  )
            {
                CreateBookingResponse result = new CreateBookingResponse();
           
                switch(createBooking.getBooking().getSport()){
	                case "Futbol": 		createBooking.getBooking().setTotal(16);break;
	                case "Padel": 		createBooking.getBooking().setTotal(10);break;
	                case "Natacion": 	createBooking.getBooking().setTotal(4);break;
	                case "Tenis": 		createBooking.getBooking().setTotal(8);break;
	                case "Baloncesto":	createBooking.getBooking().setTotal(14);break;
	                default: createBooking.getBooking().setTotal(7);break;
                }
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String insert = "insert into boocking(userNumber,date,sport,payMethodSelect,total,idField) values("
							+createBooking.getBooking().getUserNumber()+",'"+createBooking.getBooking().getDate()+"','"
							+createBooking.getBooking().getSport()+"','"+createBooking.getBooking().getPayMethodSelected()+"',"
							+createBooking.getBooking().getTotal()+","+createBooking.getBooking().getIdField()+")";
          			int resultSet = statement.executeUpdate(insert);
          			if(resultSet>0){
          				result.setOk(true);
          				result.setMessage("Reserva creada con éxito");
          			}
          			else{
          				result.setOk(false);
          				result.setMessage("No se ha encontrado la reserva");
          			}
          			
				} catch (NamingException e) {
					result.setOk(false);
            		result.setMessage("Error crear reserva: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setOk(false);
            		result.setMessage("Error crear reserva: "+e.getMessage());
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
                                     * @param getBooking 
             * @return getBookingResponse 
         */
        
                 public org.example.www.bookingservice.GetBookingResponse getBooking
                  (
                  org.example.www.bookingservice.GetBooking getBooking
                  )
            {
                GetBookingResponse result = new GetBookingResponse();
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select * from boocking where code="+getBooking.getBookingCode();
          			ResultSet resultSet = statement.executeQuery(query);
          			Booking book = new Booking();
          			while(resultSet.next()){
          				book.setCode(resultSet.getInt("code"));
              			book.setTotal(resultSet.getFloat("total"));
              			book.setPayMethodSelected(resultSet.getString("payMethodSelect"));
              			book.setSport(resultSet.getString("sport"));
              			book.setDate(resultSet.getString("date"));
              			book.setUserNumber(resultSet.getString("userNumber"));
              			book.setIdField(resultSet.getInt("idField"));
          			}
          			
          			result.setBooking(book);
          			
				} catch (NamingException e) {
					System.out.println("Error obtener reserva: "+e.getMessage());
				}
            	catch (SQLException e) {
            		System.out.println("Error obtener reserva: "+e.getMessage());
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
     
    } 