/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Raiz {
    public static void main(String[] args) throws Throwable {
        Scanner teclado = new Scanner(System.in);
        int a, b , c, grado, raiz;
        
        System.out.println("Este programa calcula las raíces de un polinomio de segundo grado");
        System.out.println("\t\tForma: ax² + bx + c = 0");
        
        System.out.println("Ingrese el coeficiente a y la potencia de x (en ax)");
        System.out.print("a: ");
        a = teclado.nextInt();
        System.out.print("\"x\" a la: ");
        grado = teclado.nextInt();
        if (grado != 2) {
            throw new ExcepcionSegundoGrado().mensaje();
        }
        System.out.print("Ingrese el coeficiente b: ");
        b = teclado.nextInt();
        System.out.print("Ingrese el coeficiente c: ");
        c = teclado.nextInt();
        
        raiz = (b*b) - 4 * (a*c);
        if (raiz < 0) {
            throw new Imaginario().mensaje();
        }
        
        System.out.println("Raíz 1...");
        System.out.println("\tX1 = " + (-b + Math.sqrt(raiz)) / (2 * a));
        System.out.println("Raíz 2...");
        System.out.println("\tX2 = " + (-b - Math.sqrt(raiz)) / (2 * a));
        
    }
}
