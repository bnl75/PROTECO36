/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterfazprebe;

/**
 *
 * @author Diego
 */
public class PruebaInterfazPrebe  implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion " + (i + 1) + " de " + Thread.currentThread().getName());
        }
        System.out.println("Terminó " + Thread.currentThread().getName());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new Thread(new PruebaInterfazPrebe(), "Diego").start();     //Es el constructor sobrecargado de Thread
        PruebaInterfazPrebe nestor = new PruebaInterfazPrebe(); //Es lo mismo que la línea de arriba pero separado por pasos    //Creo el objeto "nestor" de tipo PruebaInterfazPrebe   //Necesito un objeto (en este caso es "nestor") de mi clase para poderselo pasar a la clase Thread...Es lo mismo que el dibujo que hice en el cuaderno
        Thread t = new Thread(nestor, "Nestor");  //Es lo mismo que la línea de arriba pero separado por pasos      //Lo que está entre comillas es el nombre de mi hilo
        t.start();
        
        new Thread(new PruebaInterfazPrebe(), "Diego").start();     //Se crea un nuevo hilo -> Se crea la instancia(objeto)     //Lo que está entre comillas es el nombre de mi hilo
    }
    
}
