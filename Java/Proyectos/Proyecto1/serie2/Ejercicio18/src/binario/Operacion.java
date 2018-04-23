/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Operacion {
    public static void hacerBinario(ArrayList<String> binarios) {
        int total = 0;
        
        for(int i = 0; i < binarios.size(); i++) {
            if(binarios.get(i).length() > total) {
                
                total = binarios.get(i).length();
                
            }
        }
    }
}
