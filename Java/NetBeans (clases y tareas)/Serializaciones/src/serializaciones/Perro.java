/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializaciones;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Perro {
    private String raza;
    private String color;
    private int edad;
    private Collar collar;
    
     public Perro(String raza, String color, int edad, Collar collar) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.collar = collar;
    }
    

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }
    
    
   @Override
   public String toString() {
       return "Perro {raza = " + raza + ", color = " + color + ", edad = " + edad + ", collar: " + collar+"}";
   }
    
}
