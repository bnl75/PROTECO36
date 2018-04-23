/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinante;

/**
 *
 * @author Diego
 */
public class Operacion {
    
    public static int determinante(int[][] matriz) {
        int determinante = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int tipo = 1;
        
        // Si n = 1, el determinante es el elemento de la matriz
        if ((columnas == 1) && (filas == 1)) {
            return matriz[0][0];
        }
        
        for (int columna=0;columna<columnas;columna++) {
            int[][] matrizAux = matrizSec(matriz, filas, columnas, columna);
            determinante = determinante + (tipo * matriz[0][columna] * determinante(matrizAux));
            tipo *= -1;
        }
        
        return determinante;
    }
    
    
    public static int[][] matrizSec(int[][] matriz, int filas, int columnas, int columna) {
        int contador = 0;
        
        int[][] matrizAux = new int[filas - 1][columnas - 1];
        
        for (int i = 0; i < columnas; i ++) {
            if (i == columna) {
                continue;
            }
            
            for (int j = 1; j < filas; j ++) {
                matrizAux[j - 1][contador] = matriz[j][j];
                contador ++;
            }
        }
        
        return matrizAux;
    }
}
