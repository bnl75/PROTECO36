/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraarchivos;

import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author Diego
 */
public class EscrituraSinBuffer {
    public void escribir() {
        try {
            String cadena = "Hola, estoy escribiendo\n Hola";
            FileWriter fw = new FileWriter("\\Users\\USER\\Desktop\\pruebaDeEscritura.txt");
            for(int i = 0; i < cadena.length(); i++) {
                fw.write(cadena.charAt(i)); //charAt para que devuelva la posicion
            }
            fw.close();
        } catch(IOException e) {
            
        }
    }
}
