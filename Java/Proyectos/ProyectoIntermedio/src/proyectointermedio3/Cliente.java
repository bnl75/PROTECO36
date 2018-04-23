/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointermedio3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.BufferedReader;

public class Cliente {
    public String nombre;
    public String host;
    public int port;
    public Boolean isOn = false;
    private PrintStream ps;
    
    public Cliente(String nombre, String host){
        this.nombre = nombre;
        this.host = host;
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
}
