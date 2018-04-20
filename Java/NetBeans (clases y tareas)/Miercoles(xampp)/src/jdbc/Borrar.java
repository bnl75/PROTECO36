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
public class Borrar {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement ps;
        int id = 6;
        int renglones_afectados;

        Conexion.cargar();
        conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
        
        String query = "DELETE FROM persona WHERE id = ?";

        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            renglones_afectados = ps.executeUpdate();
            System.out.println("Delete exitoso...");
            System.out.println("Renglones afectados: " + renglones_afectados);
            ps.close();
            conn.close();
        } catch (SQLException e) {

        }
    }
}
