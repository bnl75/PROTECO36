/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 *
 * @author Diego
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        boolean salir = false;
        
        System.out.println("\tBienvenido(a)\n");
        do {
            System.out.println("\nSeleccione una opción...");
            System.out.println("1. Agregar nuevo usuario\n2. Iniciar sesión\n3. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("\n\tAgregar nuevo usuario");
                    System.out.print("\nIngrese su nombre: ");
                    String n = teclado.next();
                    System.out.print("\nIngrese su edad: ");
                    int e = teclado.nextInt();
                    System.out.print("\nIngrese su altura: ");
                    double a = teclado.nextDouble();
                    System.out.print("\nIngrese su usuario: ");
                    String u = teclado.next();
                    System.out.print("\nIngrese su contraseña: ");
                    String c = teclado.next();

                    Persona persona = new Persona(n, e, a, u, c);

                    try {
                        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File("\\Users\\USER\\Desktop\\" + u)));
                        salida.writeObject(persona);
                        salida.close();
                    } catch(IOException ioe){ }
                    break;

                case 2:
                    System.out.println("\n\tIniciar sesión");
                    System.out.print("\nIngrese su usuario: ");
                    String user = teclado.next();

                    File archivo = new File("\\Users\\USER\\Desktop\\" + user);
                    if (!archivo.isFile()) {
                        System.out.println("El usuario no existe");
                        break;
                    }

                    System.out.print("\nIngrese su contraseña: ");
                    String password = teclado.next();

                    try {
                        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(new File("\\Users\\USER\\Desktop\\" + user)));
                        Persona person = (Persona)entrada.readObject(); //Nos devuelve un objeto de tipo object

                        if (password.equals(person.getContrasena())) {
                            System.out.println(person);
                            System.out.println("\nHola " + person.getUsuario());
                        } else {
                            System.out.println("Contraseña incorrecta!!!");
                            break;
                        }
                    } catch(Exception ioe){ }
                    break;
                    
                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida!");
                    break;
            }
            
        } while(!salir);
        
    }
    
}
