/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ArrayListt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> items = new ArrayList<String>();
        
        items.add("rojo");
        items.add(0, "amarillo");   //Estamos añadiendo un elemento a la lista pero en un índice especificadi, en este caso el índice 0
        System.out.println("Contenido con for: ");
        
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
        
        mostrar(items, "\nMuestra el contenido de la list usando for-each: ");
        
        items.add("verde");
        items.add("amarillo");
        mostrar(items, "\nMuestra el contenido con nuevos elementos: ");
        
        items.remove("amarillo");   //Elimina segun el primer índce que encuentre. Tenía dos amarrillos, borró el que tenía el índice menor
        mostrar(items, "\nMuestra lo que queda: ");
        items.remove(1);
        mostrar(items, "Borra el segundo elemento de la lista -> verde: ");
        
        System.out.printf("\"rojo\" %s está en la lista ", items.contains("rojo") ? "sí" : "no");
    }
    
    private static void  mostrar(List<String> items, String encabezado) {
        System.out.print(encabezado);
        for(String item: items) {
            System.out.printf(" %s", item);
            System.out.println("");
        }
    }

}
