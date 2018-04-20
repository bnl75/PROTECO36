/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializaciones;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 *
 * @author Diego
 */
public class Serializaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p = new Perro("mixeado", "blanco", 5, new Collar("Kevin"));
        
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File("\\Users\\USER\\Desktop\\perrisimo2")));
            salida.writeObject(p);
            salida.close();
        } catch(IOException e) {
            
        }
        
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(new File("\\Users\\USER\\Desktop\\perrisimo")));
            Perro p1 = (Perro)entrada.readObject(); //Nos devuelve un objeto de tipo object
            System.out.println(p1);
        } catch(Exception e) {
            
        }
    }
    
}
