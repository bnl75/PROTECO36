/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarchivos;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

/**
 *
 * @author Diego
 */
public class LecturaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para leer caracter por caracter
        Leer archivo = new Leer();
        archivo.leer();
        //Para leer linea por linea
        //LeerBuffer lb = new LeerBuffer();
        //lb.lectura();
    }
    
}

class Leer {
    public void leer() {
        try {
            FileReader fr = new FileReader("\\Users\\USER\\Desktop\\prebe.txt");
            int caracter;
            char c;
            while((caracter = fr.read()) != -1) {
                c = (char) caracter;
                System.out.print(c);
            }
            fr.close();
        }
        catch(IOException e) {}
    }
}

class LeerBuffer {
    public void lectura() {
        try {
            File f = new File("\\Users\\USER\\Desktop\\prebe.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {}
        
    }
}