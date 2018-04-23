/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujoRombo;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Rombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número entero para formar un rombo: ");
        int numero = teclado.nextInt();
        
        for(int i = 0; i < numero; i ++) {
            System.out.println();
            
            for(int j = 0; j < (numero - i) - 1; j ++){
                System.out.print(" ");
            }
            
            for (int k = 0; k < (2 * i) + 1; k ++){
                System.out.print("*");
            }           
        }
        
        for (int l = (numero - 2); l >= 0; l --) {
            System.out.println();
            
            for(int m = 0; m < (numero - l) - 1; m ++) {
                System.out.print(" ");       
            }
            
            for(int n = 0; n < (2 * l) + 1; n ++){
                System.out.print("*");
            }           
        }
        
        System.out.println();
    }
}
