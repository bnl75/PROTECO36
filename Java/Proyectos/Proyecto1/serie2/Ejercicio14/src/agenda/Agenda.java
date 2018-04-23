/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Agenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> agenda = new ArrayList<Persona>();
        boolean salir = false;
        int opcion;
        String nombreP, telefono, nombreM;
        
        System.out.println("Bienvenido(a) a la PrebeAgenda");
        
        while (!salir) {
            System.out.println("\n\t Menú");
            System.out.println(" 1.- Agregar persona\n 2.- Borrar persona\n 3.- Buscar a una persona\n 4.- Borrar toda la agenda\n 5.- Mostrar contactos\n 6.- Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    nombreP = teclado.next();
                    System.out.print("Ingrese el teléfono de la persona: ");
                    telefono = teclado.next();
                    System.out.print("Ingrese el nombre de la mascota de " + nombreP + ": ");
                    nombreM = teclado.next();
                    
                    Persona persona = new Persona(nombreP, telefono, new Mascota(nombreM));
                    agenda.add(persona);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    nombreP = teclado.next();
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getNombre().equals(nombreP)) {
                            agenda.remove(i);
                            System.out.println("Contacto eliminado!");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    nombreP = teclado.next();
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getNombre().equals(nombreP)) {
                            System.out.println("    Nombre: " + agenda.get(i).getNombre());
                            System.out.println("    Teléfono: " + agenda.get(i).getTelefono());
                            System.out.println("    Mascota: " + agenda.get(i).getMascota().getNombre());
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("¿Está seguro que desea borrar TODA la agenda?");
                    System.out.println("    1.- Sí\n    2.- No");
                    System.out.print("Opción: ");
                    opcion = teclado.nextInt();
                    if (opcion == 1) {
                        while (!agenda.isEmpty()) {
                            for (int i = 0; i < agenda.size(); i++) {
                                agenda.remove(i);
                            }
                        }
                        System.out.println("Agenda vacía!!!");
                    } else if (opcion == 2) {
                        break;
                    } else {
                        System.out.println("Opción incorrecta");
                    }
                    break;
                    
                case 5:
                    System.out.println("\nLista de contactos");
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía...");
                    } else {
                        for (int i = 0; i < agenda.size(); i++) {
                            System.out.printf("Contacto " + (i + 1));
                            System.out.println("\n    Nombre: " + agenda.get(i).getNombre());
                            System.out.println("    Teléfono: " + agenda.get(i).getTelefono());
                            System.out.println("    Mascota: " + agenda.get(i).getMascota().getNombre());
                        }
                    }
                    break;
                    
                case 6:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Opción incorrecta");
            }
            
        }
    }
    
}
