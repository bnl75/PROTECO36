package proyectointermedio3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Servidor extends Thread {
    private String nombreCliente;
    private BufferedReader entrada;
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    
    //Método constructor
    public Servidor(Socket s) throws IOException {
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        nombreCliente = s.getInetAddress().getCanonicalHostName();
        clientes.add(new Cliente(nombreCliente, s.getInetAddress().toString()));
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
}

