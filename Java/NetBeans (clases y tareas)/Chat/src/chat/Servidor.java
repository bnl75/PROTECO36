/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;

/**
 *
 * @author Diego
 */
public class Servidor extends Thread {
    private String nombreCliente;
    private BufferedReader entrada;
    
    
    //Método constructor
    public Servidor(Socket s) throws IOException {
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        nombreCliente = s.getInetAddress().getCanonicalHostName();
        System.out.println("Conexión aceptada desde " + s.getRemoteSocketAddress());        //Devuelve la conexión de donde se conecto el servidor
    }
    
    
    //Método para que reciva el flujo de entrada (las cadenas)
    public String recibir() throws IOException {
        String str = entrada.readLine();
        return str;
    }
    
    //Método para cerrar el flujo de entrada
    public void cerrar() throws IOException {
        entrada.close();
    }
    
    @Override
    public void run() {
        try {
            String cadena = "";
            do {
                cadena = recibir();
                System.out.println(nombreCliente + " dice: " + cadena);
            } while (!cadena.equals("salir"));
            
        } catch (IOException e) {
            System.out.println("Se cerró la conexión con " + nombreCliente);
        } finally {
            try {
                cerrar();
            } catch (IOException e) {}
        }
    }
    
    public static void main(String[] args) throws IOException {
        ServerSocket ss;
        ss = new ServerSocket(0);
        System.out.println("Servidor aceptando onexiones en el puerto " + ss.getLocalPort());//Con este método veo qué puerto es el que está aceptando la conexión
        while (true) {
            Socket cliente = ss.accept();  //Está a la espera de la conexión
            Servidor hilo = new Servidor(cliente);
            hilo.start();
            
        }
    }

}