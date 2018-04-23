/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CifradoCesar {
    public static void main(String[] args) {
        Scanner objetoScanner = new Scanner(System.in);
        ArrayList<Character> caracteres = new ArrayList<Character>();
        
        if(args[0].equals("0")) {
            System.out.print("\n Ingresa la cadena a cifrar: ");
            String palabra = objetoScanner.nextLine();
            for (int i = 0; i < palabra.length(); i ++) {
                caracteres.add(palabra.charAt(i));
            }
            
            for(int j = 0; j < caracteres.size(); j ++) {
                char aux = (char) ((int) caracteres.get(j) + 3);
                caracteres.set(j, aux);
            }
            
            System.out.println("\n Palabra cifrada: " + caracteres);
        
        } else {
            args[0].equals("1");
            System.out.print("\n Ingresa la palabra a descifrar: ");
            String palabra = objetoScanner.next();
            
            for(int k = 0; k < palabra.length(); k ++) {
                caracteres.add(palabra.charAt(k));
            }

            for(int l = 0; l < caracteres.size(); l ++) {
                char aux = (char) ((int) caracteres.get(l) - 3);
                caracteres.set(l, aux);
            }
            
            System.out.println("\n Palabra descifrada: "+caracteres);
        
        }
    }
}
