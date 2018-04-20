/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics2;

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
        
        //Pinta líneas con parámetros (x1, y1, x2, y2)
        g2d.drawLine(30, 30, 200, 30);//(x1,y1) - (x2-y2)   Dibuja una línea recta
        g2d.drawLine(200, 30, 30, 200);//(x1,y1) - (x2-y2)   Dibuja una línea recta
        g2d.drawLine(30, 200, 200, 200);
        g2d.drawLine(200, 200, 30, 30);
        
    }
}
