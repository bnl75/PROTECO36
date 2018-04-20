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
public class CuentaHabiente extends Thread {        //Cada cliente se va a comportar como un hilo
    private Cuenta cuenta;
    private int retiro;
    
    public CuentaHabiente(String name, Cuenta cuenta, int retiro) { //EL "name" es del hilo
        super(name);
        this.cuenta = cuenta;
        this.retiro = retiro;
    } 
    
    @Override
    public void run(){
        while (cuenta.getSaldo()> retiro) {
            try {
                cuenta.retirar(retiro);
            } catch (InterruptedException ie) {}
            System.out.printf("%s retira %d pesos y quedan %d\n", getName(), this.retiro, cuenta.getSaldo());
        }
    }
}
