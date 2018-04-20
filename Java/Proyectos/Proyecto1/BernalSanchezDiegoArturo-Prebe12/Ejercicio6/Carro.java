public class Carro {
  private static double peso;
  private static double altura;
  private boolean encendido = false;

  //Método constructor
  Carro(double peso, double altura) {
    this.peso = peso;
    this.altura = altura;
  }

  //Métodos getters
  public static double getPeso() {
    return peso;
  }

  public static double getAltura() {
    return altura;
  }


  //Métodos de la clase
  public void encender() {
    encendido = true;
    System.out.println("Se ha encendido el carro!");
  }

  public void apagar() {
    encendido = false;
    System.out.println("Se ha apagado el carro!");
  }

  public void estado() {
    if (encendido == true) {
      System.out.println("Estado del carro: ENCENDIDO.");
    } else {
      System.out.println("Estado del carro: APAGADO.");
    }
  }

  //Método toString
  public String toString() {
    return String.format("El peso es: %f\nLa altura es: %f", peso, altura);
  }
}
