package org.example.www.sportcenterservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDConnector {
	private static Connection con = null;
    private static Statement st = null;
    private static ResultSet rs = null;
    
    public BDConnector(){
    	 
        try{
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(Exception e){
        	System.out.println("Error: "+ e.getMessage());
        }
        String url = "jdbc:mysql://localhost:3306/centrosdeportivos";

        try {
            con = DriverManager.getConnection(url,"root","capullo");
            st = con.createStatement();
        }catch (SQLException ex) {
        	System.out.println("Error: "+ ex.getMessage());
        }
    }
	public  SportCenter getSportCenter(int id){
		SportCenter sc = null;
		 try {
	            rs = st.executeQuery("SELECT * FROM sportcenter where id ="+id);
	            while (rs.next()) {  	 
	            	 sc = new SportCenter(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4));
	            }
	            return sc;

	        } catch (SQLException ex) {
	        	System.out.println("Error: "+ ex.getMessage());
	        	return null;
	        }
	        finally{
	        	try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	 
	        }
	}
	
	public  ArrayList<Integer> getSportCenters(){
		ArrayList<Integer> centers = new ArrayList<Integer>();
		 try {
	            rs = st.executeQuery("SELECT id FROM sportcenter");
	            
	            while (rs.next()) {
	            	centers.add(rs.getInt(1));
	            }
	            return centers;

	        } catch (SQLException ex) {
	        	System.out.println("Error: "+ ex.getMessage());
	        	return centers;
	        }
	        finally{
	        	try {
					st.close();
					return centers;
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	 
	        }
	}
	
	public  ArrayList<Sport> getSports(int id){
		ArrayList<Sport> sports = new ArrayList<Sport>();
		 try {
	            rs = st.executeQuery("SELECT * FROM sport where id_sp ="+id);
	            
	            while (rs.next()) {
	            	 Sport s = new Sport(rs.getInt(1), rs.getInt(2),rs.getString(3));
	            	 sports.add(s);
	            }
	            return sports;

	        } catch (SQLException ex) {
	        	System.out.println("Error: "+ ex.getMessage());
	        	return sports;
	        }
	        finally{
	        	try {
					st.close();
					return sports;
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	 
	        }
	}
	
	
	public  ArrayList<Field> getFields(int id_sc, int id_sport){
		ArrayList<Field> fields = new ArrayList<Field>();
		 try {
	            rs = st.executeQuery("SELECT * FROM field where id_sport ="+id_sport+" and sportCenter ="+id_sc);
	            
	            while (rs.next()) {
	            	 Field f = new Field(rs.getInt(1), rs.getInt(2),rs.getString(3));
	            	 fields.add(f);
	            }
	            return fields;

	        } catch (SQLException ex) {
	        	System.out.println("Error: "+ ex.getMessage());
	        	return fields;
	        }
	        finally{
	        	try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	 
	        }
	}
	
	
}
