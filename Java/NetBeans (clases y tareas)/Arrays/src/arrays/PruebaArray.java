/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Diego
 */



public class PruebaArray {
    
 public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[10];
        Random ran = new Random();
        ran.setSeed(System.currentTimeMillis()); //regresa el timepo en milisegundos desde el 1° de enero de 1970
        
        for (int i = 0; i < num.length; i++) {
         num[i] = ran.nextInt(100);     //El máximo de números. De 0 al 99
        }  
        int[] antes = (int[]) num.clone();
        System.out.println("Arreglo num es igual antes de ser ordenado a :" + Arrays.equals(antes, num));
        Arrays.sort(num);
        System.out.println("Arreglo num es igual después de ser ordenado a :" + Arrays.equals(antes, num));
        System.out.println("Antes = " + Arrays.toString(antes));
        System.out.println("num = " + Arrays.toString(num));
        System.out.println("Búsqueda del número 9, resultado: " + Arrays.binarySearch(num, 9)); //Si sí está el elemento a buscar, regresa el índice en el que se encuentra
    }

    
}
