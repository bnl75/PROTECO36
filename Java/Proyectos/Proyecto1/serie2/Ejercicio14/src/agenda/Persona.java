/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Diego
 */
public class Persona {
    protected String nombre;
    protected String telefono;
    protected Mascota mascota;
    
    public Persona(String nombre, String telefono, Mascota mascota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Mascota getMascota() {
        return mascota;
    }
}
