package com.example.db;

import java.sql.*;

/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class DbConnection {
   /**Parametros de conexion*/
   static String bd = "tienda";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;
 
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public DbConnection() throws SQLException, ClassNotFoundException, Exception {
      
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}

