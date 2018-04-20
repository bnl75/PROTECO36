/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializaciones;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Collar {
    String placa;
    
    public Collar(String placa) {
        this.placa = placa;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString() {
        return "Collar {placa = " + placa + "}";
    }
    
}
