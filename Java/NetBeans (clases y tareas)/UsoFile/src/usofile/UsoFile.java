/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofile;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class UsoFile {
    
    File f;
    
    public UsoFile(String ruta) {
        f = new File(ruta);
        
        if(f.exists()) {
            System.out.println("\nNombre del archivo: " + f.getName());
            System.out.println("\nTamanio: " + f.length());
            System.out.println("\nRuta absoluta: " + f.getAbsolutePath());
            System.out.println("\nPuede leerse: " + f.canRead());
            System.out.println("\nPuede editarse: " + f.canWrite());
            System.out.println("\nEs archivo: " + f.isFile());
            System.out.println("\nModificado por última vez: " + new Date(f.lastModified()));
            System.out.println("\nEs directorio: " + f.isDirectory());
            if (f.isDirectory()) {
                System.out.println("\nContenido de la carpeta:");
                System.out.println("------------------------------");
                String[] list = f.list();
                for(String archivo : list) {
                    System.out.println("-->" + archivo);
                }
            }
        } else {
            System.out.println("\nEl archivo no existe");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsoFile archivo = new UsoFile("\\Users\\USER\\Desktop");
    }
    
}
