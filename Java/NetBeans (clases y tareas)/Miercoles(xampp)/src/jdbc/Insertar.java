/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class Insertar {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement ps;
        int renglones_afectados;
        
        Conexion.cargar();
        conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
        
        String query = "INSERT INTO persona (nombre, edad, sexo) VALUES(?, ?, ?)";
        String nombre = "Fernanda";
        int edad = 22;
        String sexo = "F";
        
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setInt(2, edad);
            ps.setString(3, sexo);
            renglones_afectados = ps.executeUpdate();
            System.out.println("Update exitoso...");
            System.out.println("Renglones afectados: " + renglones_afectados);
            ps.close();
            conn.close();
        } catch (Exception e) {
            
        }
    }
}
