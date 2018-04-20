/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

import java.util.Scanner;
/**
 *
 * @author Diego
 */

//Clase "pivote": para emular que se selecciona un caballo
class HorseSelected {
    static String selectName = "";
}

//Puntaje del caballo
class Score {
    int position = 0;
    static boolean winner = false;
}

//Clase para el caballo
class Horse implements Runnable {    //Aquí emulamos que el caballo está corriendo
    Score s = new Score();
    String horseName = null;    //Es igual que inicializarlo como vacio
    
    public Horse(String name) {
        horseName = name;
    }
    
    public void run() {
        System.out.println(horseName + " está corriendo");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.currentThread().sleep(1000);
                s.position ++;
                
                if (s.winner==false) {
                    System.out.println("Posición " + horseName + ": " + s.position);
                }
                if (s.position == 5 && s.winner == false) {
                    System.out.println(horseName + " ya ganó");
                    s.winner = true;
                    if (HorseSelected.selectName.equals(horseName)) {
                        System.out.println("Te ganaste un pomo 7u7");
                    } else {
                        System.out.println("Debes un pomo :'v");
                    }
                    Thread.currentThread().interrupt();
                }
            }
            
        } catch(Exception e) { }
}
    

public class HorseRacing {
    Scanner teclado = new Scanner(System.in);

    
    public HorseRacing() {
        System.out.println("Escoje un caballo: 1.Horse1 2.Horse2 3.Horse3");
        String opcion = teclado.nextLine();
        
        switch(opcion) {
            case "1":
                HorseSelected.selectName = "Horse1";
                break;
                
            case "2":
                HorseSelected.selectName = "Horse2";
                break;
                
            case "3":
                HorseSelected.selectName = "Horse3";
                break;
                
            default:
                System.out.println("Elige una opción válida");
                break;
        }
        System.out.println("Comienza la carrera");
        Horse c1 = new Horse("Horse1");
        Horse c2 = new Horse("Horse2");
        Horse c3 = new Horse("Horse3");
        
        //Aquí va la parte de los hilos
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HorseRacing carrera = new HorseRacing();
    }
    
}
