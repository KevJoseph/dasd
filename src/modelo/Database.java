/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UNDC-USI
 */
public class Database {
    public static Connection conn;
    
   public static Connection conexion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_avicola","root","qwerty123");
           System.out.println("success");
       }catch (Exception e){
           System.out.println(e);
       } 
       return conn;
   }
    
   public Connection getConexion(){
       return this.conn;
   }
}
