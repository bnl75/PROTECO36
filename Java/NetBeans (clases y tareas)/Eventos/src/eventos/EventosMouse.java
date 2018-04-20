/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Diego
 */
public class EventosMouse extends JFrame{
    private JPanel mousePanel;
    private JLabel barraEstado;
    
    public EventosMouse() {
        super("Demostrando eventos del mouse");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);
        
        barraEstado = new JLabel("Mouse fuera del JPanel");
        add(barraEstado, BorderLayout.SOUTH);
        
        MouseHandler manejador = new MouseHandler();
        mousePanel.addMouseListener(manejador);
        mousePanel.addMouseListenerMotionListener(manejador);
    }
    
    public static void main(String[] args) {
        EventosMouse eventos = new EventosMouse();
        eventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventos.
    }
    
    
    class MouseHandler implements MouseListener, MouseMotionListener {
    
    @Override
    public void mouseClicked(MouseEvent e) {
        barraEstado.setText(String.format("Click en [%d, %d]", e.getX(), e.getY()));
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
    
}
