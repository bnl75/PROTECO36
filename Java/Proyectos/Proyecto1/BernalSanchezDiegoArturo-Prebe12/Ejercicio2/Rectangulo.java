public class Rectangulo {
  private double base;
  private double altura;
  private double area;
  private double perimetro;

  //Métodos setters
  public void setBase(double b) {
    base = b;
  }

  public void setAltura(double a) {
    altura = a;
  }

  public double areaRectangulo() {
    area = base * altura;
    return area;
  }

  public double perimetroRectangulo() {
    perimetro = (base * 2) + (altura * 2);
    return perimetro;
  }
}
