public class Persona {
  private String nombre;
  private int edad;
  private double estatura;
  private double peso;

  //Métodos setters
  public void setNombre(String n) {
    nombre = n;
  }

  public void setEdad(int ed) {
    edad = ed;
  }

  public void setEstatura(double es) {
    estatura = es;
  }

  public void setPeso(double pe) {
    peso = pe;
  }


  //Métodos getters
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public double getEstatura() {
    return estatura;
  }

  public double getPeso() {
    return peso;
  }
}
