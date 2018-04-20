/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alv;

import java.lang.reflect.Field;

/**
 *
 * @author Diego
 */
public class Alv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String s1 = "Hola";
        String s2 = "Hola";
        Field f = String.class.getDeclaredField("value");
        f.setAccessible(true);
        f.set(s1, "ppcdsalvc".toCharArray());
        
        //reflexión en java (explicar el código)
        
        //s1 = s1 + " adios";
        System.out.println(s2);
        System.out.println("Hola");
        
        /*
        Aquí tenemos 3 objetos: 1 = hola, 2 = adios, 3 = hola adios
        
        Los Strings son INMUTABLES (inmutabilidad en java)
        */
        /////////////////////////////////////////
    }
    
}
