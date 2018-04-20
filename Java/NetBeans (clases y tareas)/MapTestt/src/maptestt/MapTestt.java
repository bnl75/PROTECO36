/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maptestt;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class MapTestt {
    static Map<Persona, Animal> mascotas = new HashMap<Persona, Animal>();      //Map<clave, valor> nombre_del_Map = new clase_del_Map_que_quiero_usar[puede ser HashMap, TreeMap, LinkedHashMap, etc]<clave, valor>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan", "Perez");
        Persona p2 = new Persona("Pepe", "Gonzales");
        Animal a1 = new Animal("perro");
        Animal a2 = new Animal("canario");
        
        mascotas.put(p1, a1);       //"put" añade un elemento al Map: nombreMap.put(clave, valor)
        mascotas.put(p2, a2);
        
        System.out.println(p1 + " tiene un " + mascotas.get(p1));          //"get" devuelve el valor de la clave que se le pasa como parámetro o null si la clave no existe: nombreMap.get(clave)
        System.out.println(p2 + " tiene un " + mascotas.get(p2));
        
        imprimirMapa();
        
        System.out.println("Mapa contiene a Pepe: " + mascotas.containsKey(p2));        //"containsKey" devuelve true si en el Map hay una clave que coincide con el argumento que le pasamos: containsKey(clave);
        
        mascotas.remove(p2);        //"remove" borra el par clave/valor de la clave que se le pasa como parámetro: remove(clave)
        
        System.out.println("Mapa contiene a Pepe: " + mascotas.containsKey(p2));
        imprimirMapa();
        
    }
    
    public static void imprimirMapa() {
        System.out.println("\nContenido de mapa: ");
        for(Persona p : mascotas.keySet()) {        //keySet nos da un mapa con las llaves
            System.out.println(p + " : " + mascotas.get(p));        //"get" devuelve el valor de la clave que se le pasa como parámetro o null si la clave no existe: get(clave)
        }
        System.out.println("Total: " + mascotas.size() + " entradas\n");        //"size" devuelve el número de elementos del map: size()
    }
    
}
