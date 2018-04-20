/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedsettestt;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;


/**
 *
 * @author Diego
 */
public class SortedSetTestt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crea y muestra una List<String>
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "blanco", "cyan", "morado", "gris"};
        SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colores));
        
        System.out.print("sorted set: ");
        imprimeSet(tree);
        
        // Crea un subconjunto con naranja como headset
        System.out.print( "headSet (\"naranja\"): " );  //headset quita todo a la izquierda del elemento que le indiquemos (excluye el elemento indocado como headset)
        imprimeSet(tree.headSet("naranja"));
        
        // Crea un subconjunto con naranja como tailset
        System.out.print( "tailSet (\"naranja\"): " );  //tailset quita todo a la izquierda del elemento que le indiquemos pero lo incluye
        imprimeSet(tree.tailSet("naranja"));
        
        // primer y último elementos
        System.out.printf("primero: %s\n", tree.first());
        System.out.printf("ultimo: %s\n", tree.last());
    }
    
    private static void imprimeSet(SortedSet<String> set){
        for (String s : set) 
            System.out.printf("%s ", s);
        
        System.out.println();
    }

    
}
