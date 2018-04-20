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
public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
	
	Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
    	this(nombre, apellidoPaterno, apellidoMaterno);
    	this.edad = edad;
	}
	Persona(){    
        }
        
	Persona(String nombre, String apellidoPaterno, String apellidoMaterno){
 		this(nombre,apellidoPaterno);
    	this.apellidoMaterno = apellidoMaterno;
	}
	Persona(String nombre){
    	this.nombre = nombre;
	}
	Persona(String nombre, String apellidoPaterno){
   		this(nombre);
    	this.apellidoPaterno = apellidoPaterno;
	}
	void diHola() {
        System.out.println("Hola, soy " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + " y tengo " + edad + " años.");
   	}
   @Override
  public String toString(){
    return nombre;
  }
}
