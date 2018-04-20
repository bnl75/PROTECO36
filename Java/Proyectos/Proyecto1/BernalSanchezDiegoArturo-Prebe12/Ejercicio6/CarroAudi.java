public class CarroAudi extends Carro {
  private String modelo;

  //Método constructor
  CarroAudi(double peso, double altura, String modelo) {
    super(peso, altura);
    this.modelo = modelo;
  }

  //Método get
  public String getModelo() {
    return modelo;
  }

  //Método toString
  public String toString() {
    return String.format("El peso es: %f\nLa altura es: %f\nEl modelo es: %s", CarroAudi.getPeso(), CarroAudi.getAltura(), modelo);
  }
}
