/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_servidor;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;

/**
 *
 * @author Diego
 */
public class Servidor {
    public static void main(String[] args) throws IOException {  //Yo aquí no necesito una dir IP porque el cliente es el que se conecta
        //Paso 1: Crear el Socket del servidor
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Esperando la conexión en el puerto....");
        
        String cadena = "";
        
        //Paso 2: Espera la conexión
        Socket s = ss.accept();
        System.out.println("Conexión aceptada desde "  + s.getInetAddress().getCanonicalHostName());
        
        //Paso 3: Obtener los flujos de Entrada/Salida del Socket
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        //Paso 4: Realizar el procesamiento
        while (!cadena.equals("quit")) {
            cadena = br.readLine();     //Aqui guardamos la información del flujo
            System.out.println(cadena);     //Imprimimos lo que guardamos 
        }
        
        //Paso 5: Cerrar la conexión
        br.close();
        s.close();
        ss.close();
    }
    
}
