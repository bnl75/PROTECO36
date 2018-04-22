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
public class Leon extends Carnivoro {
    
    //Método constructor
    public Leon(String especie, String comidaFavorita, int edad) {
        super(especie, comidaFavorita, edad);
    }
    
    

    @Override
    public void jugar() {
        System.out.println("Me gusta jugar a perseguir ratones");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo mi comida favorita: ");
    }
    
    
}
