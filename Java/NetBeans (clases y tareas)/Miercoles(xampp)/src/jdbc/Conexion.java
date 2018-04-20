/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class Conexion {
    public static void cargar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();       //Para agregar el Driver
            System.out.println("Driver cargado...");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection conectar(String url, String username, String password) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión a base realizada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
}
