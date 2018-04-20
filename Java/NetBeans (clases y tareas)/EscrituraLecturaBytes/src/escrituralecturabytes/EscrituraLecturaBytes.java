/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituralecturabytes;

import java.io.IOException;
import java.io.FileInputStream;     //Esta clase trabaja exclusivamente con bytes
import java.io.FileOutputStream;

/**
 *
 * @author Diego
 */
public class EscrituraLecturaBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        
        int[] datos = new int[20780];
        
        try {
            FileInputStream archivo_lectura = new FileInputStream("\\Users\\USER\\Desktop\\fenix.png");
            
            boolean final_archivo = false;
            int byte_entrada;
            
            while(!final_archivo) {
                byte_entrada = archivo_lectura.read();
                
                if(byte_entrada != -1) {
                    datos[contador] = byte_entrada;
                }
                
                if(byte_entrada == -1) {
                    final_archivo = true;
                }
                //System.out.println(byte_entrada);
                System.out.println(datos[contador]);
                contador ++;
            }
            
            System.out.println("Contador: " + contador);
            archivo_lectura.close();
        } catch(IOException e) {
            
        }
        
        crea_imagen(datos);
    }
    
    public static void crea_imagen(int[] datos) {
        try {
            FileOutputStream nuevaImagen = new FileOutputStream("\\Users\\USER\\Desktop\\fenix_copiaxdxd.png");
            for(int i = 0; i < datos.length; i++) {
                nuevaImagen.write(datos[i]);
            }
            nuevaImagen.close();
        } catch(IOException e) {
            
        }
    }
    
}
