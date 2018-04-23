/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Disco {
     public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int discos = 0;
          
         System.out.println("Programa para resolver las torres de Hanoi");
         
         while (discos <= 0) {
             System.out.print("Ingresa el número de discos: ");
             discos = teclado.nextInt();
             
             if (discos > 0) {
                 continue;
             } else {
                 System.out.println("Debes ingresar un número entero mayor a 0");
             }
         }
         
         Torre.pasos(discos, 'A', 'B', 'C');
    }
}
