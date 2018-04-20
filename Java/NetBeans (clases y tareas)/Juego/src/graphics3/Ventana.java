/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics3;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Ventana extends JFrame {
    
    //Método constructor
    public Ventana() {
        super("Figuras");        //Para ponerle un nombre a la ventana
        
        Lienzo lienzo = new Lienzo();
        this.add(lienzo);
        
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ventana();
    }
}
