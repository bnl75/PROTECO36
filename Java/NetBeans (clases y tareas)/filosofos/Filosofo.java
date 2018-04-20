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
public class Filosofo extends Thread {
    private Palillo palilloIzquierdo;
    private Palillo palilloDerecho;
    private String nombre;
    int comida = 5;

    //Método constructor
    public Filosofo ( String nombre, Palillo palilloIzquierdo, Palillo palilloDerecho) {
            this.nombre = nombre;
            this.palilloIzquierdo = palilloIzquierdo;
            this.palilloDerecho = palilloDerecho;
    }
 
    //Método para cuando los filósofos van a estar comiendo
    public void comer() throws InterruptedException {
        if(! palilloIzquierdo.usado) {
            if(!palilloDerecho.usado) {
                palilloIzquierdo.tomarPalillo();
                palilloDerecho.tomarPalillo();

                System.out.println(nombre + "comiendo");

                Thread.sleep(700);

                palilloDerecho.dejarPalillo();
                palilloIzquierdo.dejarPalillo();
            }
        }		
        pensar();
    }
    
    //Método para cuendo los filósofos no están comiendo. Si no comen entonces se ponen a pensar :v
    public void pensar() throws InterruptedException {
        System.out.println(nombre + "pensando");
        Thread.sleep(700);
    }

    //El método run pero sobreescrito
    @Override
    public void run() {
        for(int i = 0; i <= comida; i ++) {
            try {
                comer();
            } catch (InterruptedException ex) { }
        }
    }
}
