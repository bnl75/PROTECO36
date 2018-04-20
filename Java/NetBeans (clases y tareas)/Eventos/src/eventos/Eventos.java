/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;




/**
 *
 * @author Diego
 */
public class Eventos extends JFrame {
    JButton boton;
    JLabel etiqueta;
    JPanel panel;
    int contador = 0;

    /**
     * @param args the command line arguments
     */
    
    public Eventos(){
        panel = new JPanel();
        boton = new JButton();
        etiqueta = new JLabel();
        agregarElementos();
        crearVentana();
    }
    
    private void agregarElementos() {
        boton.addActionListener(new ActionListener()) {
        
    }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Eventos();
    }
    
}
