/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Diego
 */
public class Lienzo extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        //Es necesario para pintar dentro del panel
        
        Graphics2D g2d = (Graphics2D) g;    //Un casteo porque o son de la misma clase
        
        //Para mejorar la calidad de las imagenes
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        
        //Para crear y rellenar un rectángulo
        g2d.fillRect(30, 20, 50, 50); //(posicion, posicion, base, altura)
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(120, 20, 90, 60);
        g2d.setColor(Color.orange);
        g2d.fillRoundRect(250, 20, 70, 50, 25, 25); //(posicion, posicion, base, altura, curvatura de base, curvatura de ancho)
        g2d.setColor(Color.BLUE);
        g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
        
        //Pinta líneas con parámetros (x1, y1, x2, y2)
       /* g2d.drawLine(30, 30, 200, 30);//(x1,y1) - (x2-y2)   Dibuja una línea recta
        g2d.drawLine(200, 30, 30, 200);//(x1,y1) - (x2-y2)   Dibuja una línea recta
        g2d.drawLine(30, 200, 200, 200);
        g2d.drawLine(200, 200, 30, 30);
        */
    }
}
