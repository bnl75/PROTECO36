/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Diego
 */
public class ExcepcionSegundoGrado extends Exception {
    
    public Throwable mensaje() {
        System.out.println("No es un polinomio de segundo grado");
        return null;
    }
}
