public class PruebaAuto{
  public static void main(String[] args) {

    //Instancias
    Auto auto1 = new Auto("Audi", "A3", 2017, "Gris");
    Auto auto2 = new Auto();
    Auto auto3 = new Auto("Chevrolet", "Spark", 2015, "Azul");
    Auto auto4 = new Auto();

    //Establecer un valor a los atributos del auto2 por medio de métodos setters
    auto2.setMarca("Ford");
    auto2.setModelo("Fiesta");
    auto2.setAnio(2014);
    auto2.setColor("Naranja");

    //Establecer un valor a los atributos del auto2 por medio de métodos setters
    auto4.setMarca("Fiat");
    auto4.setModelo("500");
    auto4.setAnio(2018);
    auto4.setColor("Rojo");

    //Llamara a los métodos de la clase Auto
    auto1.estacionar();
    auto2.arrancar();
    auto3.avanzarReversa();

    //Imprimir valores de los atributos
    System.out.println("El auto 1 es un " + auto1.getModelo() + " " + auto1.getColor() + " " + auto1.getAnio() + " de la marca " + auto1.getMarca() + ".");
    System.out.println("El auto 2 es un " + auto2.getModelo() + " " + auto2.getColor() + " " + auto2.getAnio() + " de la marca " + auto2.getMarca() + ".");
    System.out.println("El auto 3 es un " + auto3.getModelo() + " " + auto3.getColor() + " " + auto3.getAnio() + " de la marca " + auto3.getMarca() + ".");
    System.out.println("El auto 4 es un " + auto4.getModelo() + " " + auto4.getColor() + " " + auto4.getAnio() + " de la marca " + auto4.getMarca() + ".");
    
  }
}
