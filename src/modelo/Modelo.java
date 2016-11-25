/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import vista.NuevoPersonal;


/**
 *
 * @author UNDC-USI
 */
public class Modelo {
    
   NuevoPersonal np = new NuevoPersonal();
   Connection cx = Database.conexion();
   
    /*Connection cc;  
    public Connection conexion(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        cc = DriverManager.getConnection("jdbc:mysq://localhost/bd_avicola","root","qwerty123");
        } catch (Exception e) {
            System.out.println(e);
        }
        return cc;
    }*/
    public void insertarUsuario(){
        try {
            PreparedStatement ppt = cx.prepareStatement("insert into trabajadores(codigo,nonbre,apellido,galpon,tipo) values(?,?,?,?,?)");
            ppt.setString(1,);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

}