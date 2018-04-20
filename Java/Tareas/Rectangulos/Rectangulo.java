public class Rectangulo {
  private double base;
  private double altura;
  private double base2;
  private double altura2;

  public Rectangulo() {
    this.base = base;
    this.altura = altura;
    this.base2 = base2;
    this.altura2 = altura2;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double b) {
    this.base = b;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double a) {
    this.altura = a;
  }

  public double getBase2() {
    return base2;
  }

  public void setBase2(double b2) {
    this.base2 = b2;
  }

  public double getAltura2() {
    return altura2;
  }


/*
  public Rectangulo agrandar(int x) {   //No me deja compilar por el return con un tipo Rectangulo
    base2 = base * x;
    altura2 = altura * x;
    return ;
  }
*/
  public void agrandar(int x) {
    base2 = base * x;
    altura2 = altura * x;
  }
}
