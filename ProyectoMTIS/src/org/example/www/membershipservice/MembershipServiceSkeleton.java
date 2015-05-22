
/**
 * MembershipServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.membershipservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
    /**
     *  MembershipServiceSkeleton java skeleton for the axisService
     */
    public class MembershipServiceSkeleton{
        
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
                                     * @param registerMember 
             * @return registerMemberResponse 
         */
        
                 public org.example.www.membershipservice.RegisterMemberResponse registerMember
                  (
                  org.example.www.membershipservice.RegisterMember registerMember
                  )
            {
                RegisterMemberResponse result = new RegisterMemberResponse();
                
                int VIP = 0;
                if(registerMember.getMember().getVIP()==true){
                	VIP = 1;
                }
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String insert = "insert into Member(email,name,surname,NIF,province,city,VIP,img) values('"
					+registerMember.getMember().getEmail()+"','"+registerMember.getMember().getName()+"','"
					+registerMember.getMember().getSurname()+"','"+registerMember.getMember().getNIF()+"','"
					+registerMember.getMember().getProvince()+"','"+registerMember.getMember().getCity()+"',"+VIP+",'"
							+registerMember.getMember().getImg()+"')";
          			int resultSet = statement.executeUpdate(insert);
          			if(resultSet>0){
          				result.setStatus(true);
          				result.setMessage("Miembro creado con éxito");
          			}
          			else{
          				result.setStatus(false);
          				result.setMessage("No se ha encontrado el miembro");
          			}
          			
				} catch (NamingException e) {
					result.setStatus(false);
            		result.setMessage("Error crear miembro: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setStatus(false);
            		result.setMessage("Error crear miembro: "+e.getMessage());
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
                                     * @param checkMember 
             * @return checkMemberResponse 
         */
        
                 public org.example.www.membershipservice.CheckMemberResponse checkMember
                  (
                  org.example.www.membershipservice.CheckMember checkMember
                  )
            {
                CheckMemberResponse result = new CheckMemberResponse();
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select * from Member where code="+checkMember.getMemberCode();
          			ResultSet resultSet = statement.executeQuery(query);
          			
          			if(resultSet.first()){
          				result.setOk(true);
          				result.setMessage("Miembro validado con éxito");
          			}
          			else{
          				result.setOk(false);
          				result.setMessage("No se ha encontrado el miembro");
          			}
				} catch (NamingException e) {
					result.setOk(false);
      				result.setMessage("No se ha podido borrar al miembro: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setOk(false);
      				result.setMessage("No se ha podido borrar al miembro: "+e.getMessage());
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
                                     * @param getMember 
             * @return getMemberResponse 
         */
        
                 public org.example.www.membershipservice.GetMemberResponse getMember
                  (
                  org.example.www.membershipservice.GetMember getMember
                  )
            {
                GetMemberResponse result = new GetMemberResponse();
                
                try {
					conectarDB();
					statement = connect.createStatement();
					String query = "select * from Member where code="+getMember.getCode();
          			ResultSet resultSet = statement.executeQuery(query);
          			Member member = new Member();
          			resultSet.next();
          			boolean VIP=false;
          			if(resultSet.getInt("VIP")==1){
          				VIP=true;
          			}
          			member.setEmail(resultSet.getString("email"));
          			member.setName(resultSet.getString("name"));
          			member.setNIF(resultSet.getString("NIF"));
          			member.setCity(resultSet.getString("city"));
          			member.setVIP(VIP);
          			member.setSurname(resultSet.getString("surname"));
          			member.setProvince(resultSet.getString("province"));
      				if(!resultSet.wasNull())//ojo esto no esta correcto pero no he encontrado manera
      				{
      					member.setImg("");
      				}else{
      					member.setImg(resultSet.getString("img"));
      				}
          			member.setCode(getMember.getCode());
          			result.setMember(member);
          			
				} catch (NamingException e) {
					System.out.println("No se ha podido obtener el miembro: "+e.getMessage());
				}
            	catch (SQLException e) {
            		System.out.println("No se ha podido obtener el miembro: "+e.getMessage());
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
                                     * @param updateMember 
             * @return updateMemberResponse 
         */
        
                 public org.example.www.membershipservice.UpdateMemberResponse updateMember
                  (
                  org.example.www.membershipservice.UpdateMember updateMember
                  )
            {
                UpdateMemberResponse result = new UpdateMemberResponse();
                
                try {
					conectarDB();
					int VIP=0;
					if(updateMember.getMember().getVIP()==true){
						VIP=1;
					}
					statement = connect.createStatement();
					String update = "update member set email='"+updateMember.getMember().getEmail()+"', name='"
							+updateMember.getMember().getName()+"', surname='"+updateMember.getMember().getSurname()
							+"', NIF='"+updateMember.getMember().getNIF()+"', province='"+updateMember.getMember().getProvince()
							+"', city='"+updateMember.getMember().getCity()+"', VIP="+VIP+", img='"+updateMember.getMember().getImg()
							+"' where code="+updateMember.getMember().getCode();
          			int resultSet = statement.executeUpdate(update);
          			if(resultSet>0){
          				result.setStatus(true);
          				result.setMessage("Miembro modificado con éxito");
          			}
          			else{
          				result.setStatus(false);
          				result.setMessage("No se ha encontrado el miembro");
          			}
          			
				} catch (NamingException e) {
					result.setStatus(false);
            		result.setMessage("Error modificar miembro: "+e.getMessage());
				}
            	catch (SQLException e) {
            		result.setStatus(false);
            		result.setMessage("Error modificar miembro: "+e.getMessage());
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