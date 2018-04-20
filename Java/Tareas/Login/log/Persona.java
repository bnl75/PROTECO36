/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Persona implements Serializable {

    private String nombre;
    private int edad;
    private double altura;
    private String usuario;
    private String contrasena;

    //Método constructor
    public Persona(String nombre, int edad, double altura, String usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    //Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    //Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setUsuario(String usuaro) {
        this.usuario = usuaro;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    //Método toString
    @Override
    public String toString() {
       return "\nNombre: " + nombre + "\nEdad: " + edad + "\nAltura: " + altura + "\nUsuario: " + usuario + "\nContraseña: " + contrasena;
   }
}
