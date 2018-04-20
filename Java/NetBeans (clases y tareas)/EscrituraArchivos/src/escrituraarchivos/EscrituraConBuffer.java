/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EscrituraConBuffer {
    public void escribe() {
        String cadena;
        File archivo;
        FileWriter fw;
        BufferedWriter bw;
        try {
            archivo = new File("\\Users\\USER\\Desktop\\pruebaDeEscritura.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            Scanner teclado = new Scanner(System.in);
            
            do {
                cadena = teclado.nextLine();
                bw.write(cadena + "\n");
            } while (!cadena.equals("adios"));
            bw.flush();
            fw.close();
            bw.close();
        } catch(IOException e) {
            
        }
    }
}
