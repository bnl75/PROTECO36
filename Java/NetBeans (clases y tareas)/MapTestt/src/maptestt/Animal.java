/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maptestt;

/**
 *
 * @author Diego
 */
public class Animal {
    String nombre;

    	public Animal(String nombre) {
    		this.nombre=nombre;	
    	}
      @Override
    	public String toString(){
            return nombre; 
        }
    	
    
}
