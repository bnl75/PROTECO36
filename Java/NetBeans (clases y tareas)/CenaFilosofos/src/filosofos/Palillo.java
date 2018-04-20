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

public class Palillo {
    public boolean usado; 
    public String nombre;

    //Método constructor
    public Palillo(String nombre) {
        this.nombre = nombre;
    }

    //Método para tomar palillo
    public synchronized void tomarPalillo() {
        System.out.println("Palillo usado: " + nombre );
        usado = true;
    }
    
    //Método para dejar libre palillo
    public synchronized void dejarPalillo() {
        System.out.println("Palillo liberado: " + nombre );
        usado = false ;
    }
    
}
