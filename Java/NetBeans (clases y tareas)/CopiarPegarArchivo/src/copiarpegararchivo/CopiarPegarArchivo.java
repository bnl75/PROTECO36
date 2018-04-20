/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiarpegararchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Diego
 */
public class CopiarPegarArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fw;  //Para escribir el contenido de copiado del archivo original al archivo copia
        File archivo1;  //Para indicar el archivo original
        FileReader fr;  //Para leer el contenido del archivo original
        BufferedReader br;  //Para leer las líneas del archivo original
        
        try {
            
            fw = new FileWriter("\\Users\\USER\\Desktop\\archivoCPA_copiado.txt", true);    //El true es para que no borre lo que ya tenía el archivo de copia (si es que ya tenía algo)
            archivo1 = new File("\\Users\\USER\\Desktop\\archivoCPA.txt");
            fr = new FileReader(archivo1);
            br = new BufferedReader(fr);
            
            String cadena;
            
            while((cadena = br.readLine()) != null) {
                cadena = cadena + ("\n");
                
                for(int i = 0; i < cadena.length(); i++) {
                    fw.write(cadena.charAt(i)); //Para que devuelva la posición del índice
                }
                br.close();
                fr.close();
                fw.close();
            }
        } catch(IOException e) {
            
        } 
    }
}
