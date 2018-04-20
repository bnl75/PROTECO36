/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraarchivos;

/**
 *
 * @author Diego
 */
public class EscrituraArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EscrituraSinBuffer esb = new EscrituraSinBuffer();
        //esb.escribir();
        
        EscrituraConBuffer ecb = new EscrituraConBuffer();
        ecb.escribe();
        
    }
    
}
