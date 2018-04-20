/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leersinstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

/**
 *
 * @author Diego
 */
public class LeerSinString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Encontré que este es un método viejito para leer desde teclado antes de que existiera la clase Console:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = br.readLine();
        
        System.out.print("Hola " + nombre + "!!!\nIngresa tu edad: ");
        String teclado = br.readLine();
        
        //Como lo único que puede leer son cadenas, debemos convertir el String a int para poder almacenar de forma correcta la edad
        int edad = Integer.parseInt(teclado);
        
        System.out.println(nombre + " hemos registrado tu edad con éxito: " + edad + " años");
        
     
    /*
        //Método con la clase Console
        Console consola = System.console();
        
        String nombre;
        nombre = consola.readLine("%s", "Ingresa tu nombre completo: ");
        consola.format("Hola %s!!!", nombre);
     */   
        
    }
    
}
