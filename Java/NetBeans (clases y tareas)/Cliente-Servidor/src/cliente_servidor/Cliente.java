/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cliente_servidor;

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
    public static void main(String[] args) throws IOException {
        //Paso1: Crear un Socket para conectar con el Servidor
        Socket s = new Socket("192.168.1.75", 9999);     //Socket(dirección_IP, puerto)    //Si le pongo 0 en el puerto, me va a buscar puertos disponibles
        
        String cadena = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));      //Para leer datos del teclado por medio de flujos
        
        //Paso 2: Obtener los flujos de entrada/salida del Socket
        PrintStream ps = new PrintStream(s.getOutputStream());  //Para que me consiga el socket a donde voy a enviar la información (el puerto que abrí)
        
        //Paso 3: Realizar procesamento (las acciones que voy a querer realizar)
        while (!cadena.equals("quit")) {
            cadena = teclado.readLine();
            ps.println(cadena);   //Este método es para poder enviar la información l servidor... OJO: no es igual que System.out.println();
            ps.flush();     //Para limpiar el buffer
        }
        
        //Paso 4: Cerrar la conexión
        ps.close();
        teclado.close();
        s.close();
    }
}
