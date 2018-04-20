/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

/**
 *
 * @author Diego
 */

public class Main {
    public static void main(String[] args) {
        int comida = 5;

        System.out.println("Total de comida: " + comida);

        Palillo[] palillos = new Palillo[5];

        //initlize the chopistics
        for(int i = 0; i < palillos.length; i ++) {
            palillos[i] = new Palillo("palillo " + (i + 1));
        }
        
        //Arreglo de Filosofo
        Filosofo[] filosofos = new Filosofo[5];
        
        //Llenamos el arreglo filosofos con los 5 filósofos
        filosofos[0] = new Filosofo("Filósofo 1: ", palillos[0], palillos[1]);
        filosofos[1] = new Filosofo("Filósofo 2: ", palillos[1], palillos[2]);
        filosofos[2] = new Filosofo("Filósofo 3: ", palillos[2], palillos[3]);
        filosofos[3] = new Filosofo("Filósofo 4: ", palillos[3], palillos[4]);
        filosofos[4] = new Filosofo("Filósofo 5: ", palillos[0], palillos[4]);

        //Creamos los hilos y los iniciamos para los 5 filósofos
        for(int i = 0; i < filosofos.length; i ++) {
            Thread hilo= new Thread(filosofos[i]);
            hilo.start();
        }
        
    }
    
}

