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
public class Cuenta {
    private int saldo;
    
    //Método constructor
    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
    
    //Método sincronizado
    public synchronized void retirar(int cantidad) throws InterruptedException {
        if (saldo >= cantidad) {
            Thread.sleep(new java.util.Random().nextInt(500) + 1000);
            saldo -= cantidad;
        }
    }
    
    //Método get
    public int getSaldo() {
        return saldo;
    }
    
}
