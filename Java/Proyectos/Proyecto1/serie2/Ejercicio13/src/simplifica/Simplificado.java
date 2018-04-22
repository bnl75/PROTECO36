/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplifica;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
    public class Simplificado {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);

            int numerador, denominador;

            System.out.println("Programa que simplifica una fracción a su mínima expresión");

            System.out.print("Ingresa el numerador: "); 
            numerador = teclado.nextInt(); 

            System.out.print("Ingresa el denominador: "); 
            denominador = teclado.nextInt(); 
            
            if (denominador == 0) {
                System.out.println("\nNo puedes divisir entre 0");
                System.out.println("\nEsto no es posible:");
            }


            for (int i = 1; i <= numerador + 1; i ++) { 

                if (((numerador % i) == 0) && ((denominador % i) == 0)) { 

                    numerador = numerador / i; 
                    denominador = denominador / i;
                } 
            } 

            for (int i = 1; i <= numerador + 1; i ++) { 

                if (((numerador % i) == 0) && ((denominador % i) == 0)) { 

                    numerador = numerador / i; 
                    denominador = denominador / i;
                } 
            }

            System.out.println("Fracción simplificada:");
            System.out.println("\t" + numerador + "/" + denominador);
        }
    }
