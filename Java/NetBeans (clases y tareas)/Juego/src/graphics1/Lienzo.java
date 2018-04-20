/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Lienzo extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        //Es necesario para pintar dentro del panel
        
        Graphics2D g2d = (Graphics2D) g;    //Un casteo porque o son de la misma clase
        
        g2d.drawString("Hola mundo", 10, 20);   //Muestra cadena en coordenadas (10,20)
    }
}
