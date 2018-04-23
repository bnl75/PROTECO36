/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Binario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cambio;
        String numeros, binario;
        ArrayList<String> binarios = new ArrayList<String>();
        
        System.out.println("Programa que convierte una serie de números en base 10 a binario");
        System.out.print("Ingrese los números (ej: 2, 6, 12, 3, 4, 7): ");
        numeros = teclado.nextLine();
        
        String arreglo[] = numeros.split(", ");
        
        for (String arreglo1 : arreglo) {
            cambio = Integer.parseInt(arreglo1);
            binario = Integer.toBinaryString(cambio);
            binarios.add(binario);
        }
        
        Operacion.hacerBinario(binarios);
        
        System.out.println(binarios);
    }
}
