/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres;

/**
 *
 * @author Diego
 */
public class Torre {
    public static void pasos(int discos, char a, char b, char c) {
        
        if (discos != 1) {
            pasos(discos - 1, a, c, b);
            System.out.println("Disco " + discos + ": " + a + " -> " + c);
            pasos(discos - 1, b, a, c);
        } else {
            System.out.println("Disco 1: " + a + " -> " + c);
        }
    }
}
