public class Auto {
  private String marca;
  private String modelo;
  private int anio;
  private String color;

  //Constructor por defecto
  Auto() {

  }

  //Constructor sobrecargado
  Auto(String marca, String modelo, int anio, String color){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
  }

  //Métodos setters
  public void setMarca (String ma) {
    marca = ma;
  }

  public void setModelo (String mo) {
    modelo = mo;
  }

  public void setAnio (int a) {
    anio = a;
  }

  public void setColor (String c) {
    color = c;
  }

  //Métodos getters
  public String getMarca () {
    return marca;
  }

  public String getModelo () {
    return modelo;
  }

  public int getAnio () {
    return anio;
  }

  public String getColor () {
    return color;
  }


  //Métodos de la clase
  public void estacionar() {
    System.out.println("El auto se está estacionando...");
  }

  public void arrancar() {
    System.out.println("El auto está arrancando...RunRunRun!");
  }

  public void avanzarReversa() {
    System.out.println("¡CUIDADO! El auto va en reversa!!!");
  }

}
