/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author Diego
 */
public class Cebra extends Herbivoro {
    
    //Método constructor
    public Cebra(String especie, String comidaFavorita, int edad) {
        super(especie, comidaFavorita, edad);
    }

    @Override
    public void jugar() {
        System.out.println("Me gusta jugar entre los árboles con toda mi cebrapandilla");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo mi comida favorita: ");
    }
    
}
