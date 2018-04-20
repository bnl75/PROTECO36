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
public class Actualizar {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement ps;
        int renglones_afectados;
        
        Conexion.cargar();
        conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
        
        int edad = 30;
        String nombre = "Sofia";
        int id = 4;
        String sexo = "F";
        
        String query = "UPDATE persona SET edad = ?, nombre = ?, sexo = ? WHERE id = ?";
        
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, edad);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setInt(4, id);
            renglones_afectados = ps.executeUpdate();
            System.out.println("Número de renglones actualizados: " + renglones_afectados);
            ps.close();
            conn.close();
        } catch (SQLException e) {
            
        }
        
    }
    
}
