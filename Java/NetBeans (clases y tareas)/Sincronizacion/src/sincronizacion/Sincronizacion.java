/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion;

/**
 *
 * @author Diego
 */
public class Sincronizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(1000);
        
        CuentaHabiente persona1 = new CuentaHabiente("Juanito", cuenta, 100);
        CuentaHabiente persona2 = new CuentaHabiente("Serj", cuenta, 50);
        CuentaHabiente persona3 = new CuentaHabiente("Patish", cuenta, 200);
        
        persona1.start();
        persona2.start();
        persona3.start();
    }
    
}
