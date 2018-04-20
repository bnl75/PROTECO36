/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JFrame;

/**
 *
 * @author Diego
 */
public class Ventana extends JFrame {
    
    //Método constructor
    public Ventana() {
        super("Juego");        //Para ponerle un nombre a la ventana
        
        Lienzo lienzo = new Lienzo();
        this.add(lienzo);
        
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Thread t = new Thread(lienzo);
        t.start();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ventana();
    }
}
