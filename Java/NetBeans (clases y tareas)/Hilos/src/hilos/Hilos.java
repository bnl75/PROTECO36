
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Diego
 */
public class Hilos extends Thread {
    public Hilos(String nombre) {
        super(nombre);
    }

    public void run()  /*throws Exception*/ {       //capta la excepción más general :v     Para decir que sé que va a amandar una excepcion pero que no me importa
      try {
          for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1) + " de " + getName());
            sleep(5000);    //Para decirle al hilo que se espere tantito. Trabaja con milisegundos      //Se usa porque a veces no se cargan todas la bibliotecas, paquetes, etc. que el hilo necesita ya que a veces el procesador termina primero que el hilo. Es una forma de asegurarnos de que se cargue todo lo necesario.        //Estos métodos lanzan excepciones
            }
        System.out.println("Terminó el hilo " + getName());  //Imprime en desorden porque se pelean por quien ocupa primero la memoria (multi-tarea)
        }  catch (Exception e) { }
      }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilos h = new Hilos("Diego");
        Hilos h1 = new Hilos("Arturo");
        
        h.start();
        h1.start();
    }
    
}
