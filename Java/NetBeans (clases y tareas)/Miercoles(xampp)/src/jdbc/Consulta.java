/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class Consulta {
    public static void main(String [] args) {
        Connection conn;
        Statement stmt;
        ResultSet rs;
        
        Conexion.cargar();
        conn = Conexion.conectar("jdbc:mysql://localhost:3306/miercoles", "luis", "123");
        
        String query = "SELECT * FROM persona";
        
        try {
            stmt = conn.createStatement();     //Creamos el statement
            rs = stmt.executeQuery(query);     //Guardamos el resultado de nuestra query
            rs = stmt.getResultSet();
            System.out.println("Consulta exitosa: ");
            while (rs.next()) {
                String msj = "";
                
                 //Imprime de las columnas de la base de datos con el getInt
                msj += "Id: " + rs.getInt("id") + " ";
                msj += "Nombre: " + rs.getString("nombre") + " ";
                msj += "Edad: " + rs.getString("edad") + " ";
                msj += "Sexo: " + rs.getString("sexo") + " ";
                
                System.out.println(msj);
            }
            stmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
