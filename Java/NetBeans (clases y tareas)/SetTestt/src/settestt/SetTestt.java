/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settestt;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Diego
 */
public class SetTestt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "blanco", "gris"};
        
        List<String> lista = Arrays.asList(colores);    //De un ArrayList estoy creando una lista  //aslist es para tratar a mi arreglo de tipo String como si fuera una lista
        
        System.out.printf("Lista: %s\n", lista); //Imprime todos, tambie los elementos duplicados
        imprimeSinDuplicados(lista);
    }
    
    private static void imprimeSinDuplicados(Collection<String> valores) {
        Set<String> set = new HashSet<String> (valores);
        System.out.printf("\nSin duplicados: ");
        
        for(String valor : set) {
            System.out.printf("%s ", valor);
        }
        
        System.out.println("");
    }
    
}
