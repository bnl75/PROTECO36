/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirnumeros;

/**
 *
 * @author Diego
 */
public class ImprimirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 100; i++) {
            if ((i % 15) == 0) {
                System.out.println("FizzBuzz");
            } else if  ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        
        
    }
    
}
