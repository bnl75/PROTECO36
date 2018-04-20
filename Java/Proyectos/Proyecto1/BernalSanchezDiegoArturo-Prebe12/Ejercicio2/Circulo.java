public class Circulo {

  public static final double PI = 3.1416;   //Es final porque quiero que el valor de PI nunca cambie, por eso está escrito con mayúsculas (como si fuera una constante).
  private double radio;
  private double diametro;
  private double area;
  private double perimetro;

  //Métodos setters
  public void setRadio(double r) {
    radio = r;
  }

  public void setDiametro(double d) {
    diametro = d;
  }

  //Método para obtener el área del círculo
  public double areaCirculo() {
    area = PI * (Math.pow(radio, 2));   //Aquí uso el método pow de la clase Math.
    return area;
  }

  //Método para obtener el perímetro del círculo con el diámetro
  public double perimetroCirculo() {
    perimetro = diametro * PI;
    return perimetro;
  }

  //Método para obtener el perímetro del círculo sin el diámetro
  public double perimetroCirculoConElRadio() {
    perimetro = (radio * 2) * PI;
    return perimetro;
  }

}
