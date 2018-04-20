/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.BufferedReader;

/**
 *
 * @author Diego
 */
public class Cliente {
    private PrintStream ps;
    private String host;
    private int port;       //Porque con 0 toma un valor aleatorio
    
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public void conectar() throws IOException {
        Socket s = new Socket(host, port);
        ps = new PrintStream(s.getOutputStream());
    }
    
    public void enviar(String mensaje) throws IOException {
        ps.println(mensaje);
    }
    
    public void cerrar() throws IOException {
        ps.close();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        Cliente cliente = new Cliente();
        
        System.out.print("Host: ");//Para ver a que dir ip se va a conectar
        cliente.setHost(teclado.readLine());
        
        System.out.print("Puerto: ");
        cliente.setPort(Integer.parseInt(teclado.readLine()));
        
        cliente.conectar();
        
        String cadena = "";
        
        while (!cadena.equals("salir")) {
            System.out.print("Mensaje: ");
            cadena = teclado.readLine();
            
            cliente.enviar(cadena);
        }
        
        cliente.cerrar();
        
    }
    
}
