/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JComponent;


/**
 *
 * @author Diego
 */
public class Lienzo extends JComponent implements Runnable {

    Map<String, Point> palabras;
    List<String> lista = new ArrayList<String>();
    String palabraUsuario;
    int score;

    public Lienzo() {
        setPreferredSize(new Dimension(800, 600));
        palabras = new HashMap<String, Point>();
        palabraUsuario = "";
        setFocusable(true);
        requestFocus();
        llenaLista();
        Collections.shuffle(lista);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        compararPalabra();
                        break;
                    default:
                        palabraUsuario += e.getKeyChar();
                }
            }

        });
    }

    private void llenaLista() {
        lista.add("hola");
        lista.add("palabra");
        lista.add("java");
        lista.add("graphics");
        lista.add("teclado");
    }

    private void compararPalabra() {
        if (palabras.containsKey(palabraUsuario)) {
            score++;
            palabras.remove(palabraUsuario);
        }

        palabraUsuario = "";

    }

    private void agregarPalabraMapa() {
        if (lista.size() > 0) {
            String s = lista.get(0);
            lista.remove(0);
            int x = new Random().nextInt(600);  //Coordenada x aleatorio
            palabras.put(s, new Point(x, 0));
        }
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawString("Score: " + score, 10, 10);
        
        for(String s : palabras.keySet()) {
            g2d.setColor(Color.blue);
            g2d.fillRect(palabras.get(s).x, palabras.get(s).y, s.length()*20, 40);
            g2d.setColor(Color.white);
            Font f = new Font("Helvetica", Font.PLAIN, 24);
            g2d.setFont(f);
            g2d.drawString(s, palabras.get(s).x + 20, palabras.get(s).y + 20);
        }
    }
    
    @Override
    public void run() {
        long referencia = new Date().getTime();
        while (true) {
            for (String s : palabras.keySet()) {
                palabras.get(s).y += 2;
            }
            
            if (new Date().getTime() - referencia >= 15000) {
                agregarPalabraMapa();
                referencia = new Date().getTime();
            }
            
            repaint();
            
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) { }
            
        }
    }

}
