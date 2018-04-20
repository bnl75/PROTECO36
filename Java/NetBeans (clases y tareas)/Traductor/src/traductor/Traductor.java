/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.Map;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

/**
 *
 * @author Diego
 */
public class Traductor {
    static Map <Integer, String> traductor = new HashMap<Integer, String>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static Map <String, Integer> buscar = new HashMap<String, Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        String palabra;
        int x;
        
        //Impares = Español  ...  Pares = Inglés
        traductor.put(1, "Hola");
        buscar.put("Hola" , 1);
        traductor.put(2, "Hello");
        buscar.put("Hello" , 2);
        traductor.put(3, "Adios");
        buscar.put("Adios" , 3);
        traductor.put(4, "Bye");
        buscar.put("Bye" , 4);
        traductor.put(5, "Amigo");
        buscar.put("Amigo" , 5);
        traductor.put(6, "Friend");
        buscar.put("Friend" , 6);
        traductor.put(7, "Perro");
        buscar.put("Perro" , 7);
        traductor.put(8, "Dog");
        buscar.put("Dog" , 8);
        traductor.put(9, "Gato");
        buscar.put("Gato" , 9);
        traductor.put(10, "Cat");
        buscar.put("Cat" , 10);
        
        System.out.println("\tBienvenido al PrebeTraductor\n");
        
        while(!salir) {
            System.out.println("Seleccione una opción de lo que desea hacer:\n");
            System.out.println("   1. Traducir  Español -> Inglés");
            System.out.println("   2. Traducir  Inglés -> Español");
            System.out.println("   3. Agregar nueva traducción");
            System.out.println("   4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());
            
            switch(opcion) {
                case 1:
                    System.out.println("\nTraducir  Español -> Inglés");
                    System.out.print("   Traducir palabra: ");
                    palabra = br.readLine();
                    
                    if (traductor.containsValue(palabra)) {
                        x = buscar.get(palabra);
                        System.out.println("   Traducción: " + traductor.get(x + 1) + "\n\n");
                        break;
                    } else {
                        System.out.println("   \"" + palabra + "\" no se ha agregado al traductor...\n\n" );
                        break;
                    }
                    
                case 2:
                    System.out.println("\nTraducir  Inglés -> Español");
                    System.out.print("   Traducir palabra: ");
                    palabra = br.readLine();
                    
                    if (traductor.containsValue(palabra)) {
                        x = buscar.get(palabra);
                        System.out.println("   Traducción: " + traductor.get(x - 1) + "\n\n");
                        break;
                    } else {
                        System.out.println("   \"" + palabra + "\" no se ha agregado al traductor...\n\n" );
                        break;
                    }
                    
                case 3:
                    System.out.println("\nAgregar nueva traducción");
                    System.out.println("   Ingresar palabra en");
                    
                    System.out.print("      Español: ");
                    palabra = br.readLine();
                    traductor.put(traductor.size() + 1, palabra);
                    buscar.put(palabra , buscar.size() + 1);
                    
                    System.out.print("      Inglés: ");
                    //System.out.println();
                    palabra = br.readLine();
                    traductor.put(traductor.size() + 1, palabra);
                    buscar.put(palabra , buscar.size() + 1);
                    break;
                    
                case 4:
                    salir = true;
                    System.out.println("ADIOS...");
                    break;
                    
                default:
                    System.out.println("Ingresa una opción válida\n\n");
                    break;
            }
        }
    }
}
