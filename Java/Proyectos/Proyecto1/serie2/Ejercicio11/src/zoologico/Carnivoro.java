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
public abstract class Carnivoro implements Animal {
    private String especie;
    private String comidaFavorita;
    private int edad;
    
    //Método constructor
    public Carnivoro(String especie, String comidaFavorita, int edad) {
        this.especie = especie;
        this.comidaFavorita = comidaFavorita;
        this.edad = edad;
    }
    
    //Métodos getters
    public String getEspecie() {
        return especie;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public int getEdad() {
        return edad;
    }
    
}
