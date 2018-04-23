/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinante;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Determinado {
    public static  int tamano;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Se pide al usuario el tamaño de las matrices cuadradas
        System.out.print("Ingresa el tamaño que deseas para la matriz cuadrada de enteros nxn\nn = ");
        tamano = teclado.nextInt();
        
        //Se crea la matriz del tamaño que el usuario indicó
        int[][] matriz = new int [tamano][tamano];
        
        //Se insertan valores en la matriz 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingresa el elemento [" + (i + 1) + "]" + "[" + (j + 1) + "] de la matriz: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("El determinante es: " + Operacion.determinante(matriz));
        
    }
}
