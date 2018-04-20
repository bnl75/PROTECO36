/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;

/**
 *
 * @author Diego
 */
public class MouseHandler implements MouseListener, MouseMotionListener {
    
    @Override
    public void mouseClicked(MouseEvent e) {
        barraEstado.setText(String.format("Click en [%d, %d]", e.getX(), e.getY())):
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        barraEstado.setText(String.format("Presionado en [%d, %d]", e.getX(), e.getY()));
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        barraEstado.setText(String.format("Soltado en [%d, %d]", e.getX(), e.getY()));
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        mousePanel.setBackground(Color.CYAN);
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        barraEstado.setText(String.format("Arrastrado en [%d, %d]", e.getX(), e.getY()));
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        barraEstado.setText(String.format("Movido en [%d, %d]", e.getX(), e.getY()));
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        barraEstado.setText("Saliste del JPanel");
        mousePanel.setBackground(Color.WHITE);
    }
}
