/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author Diego
 */
public class Main {
    public static void main(String[] args) {
        Animal leon = new Leon("León", "venados", 4);
        Animal cebra = new Cebra("Cebra", "ramitas secas", 7);
        
        /*Aquí podría acceder al método comer pero no al getComidaFavorita de la cebra
        cebra.comer();
        cebra.getComidaFavorita();*/
        
        System.out.println("Para Zebry la cebra...");
        Cebra cebraBien = (Cebra) cebra;
        //Como aqui se hizo un downcasting, ya podemos acceder al método getComidaFavorita de cebra
        cebraBien.comer();
        cebraBien.getComidaFavorita();
        
        Leon leonBien = (Leon) leon;
        leonBien.jugar();
        System.out.println("Soy Juan el león y tengo " + leonBien.getEdad() + " años de experiencia en esto de ser el papi rey");
    }
}
