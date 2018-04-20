/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics1;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Ventana extends JFrame {
    
    //Método constructor
    public Ventana() {
        super("Hola mundo en Java 2D");
        
        Lienzo lienzo = new Lienzo();
        this.add(lienzo);
        
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ventana();
    }
}
