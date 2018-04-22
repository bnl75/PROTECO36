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
public class Imaginario extends Exception {
    
    public Throwable mensaje() {
        System.out.println("Raíces complejas, no las puedo calcular");
        return null;  
    }
}
