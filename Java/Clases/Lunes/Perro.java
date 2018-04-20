public class Perro {
  private String nombre;
  public int edad;

//Constructor por defecto
  Perro () {

  }

//Constructor creado
  Perro (String nombre, int edad) {
  /*
    nombre = nombre;
    edad = edad;
    Esto causa confusión y por eso se usa la palabra reservada THIS
  */

    this.nombre = nombre;
    this.edad = edad;


  }

  public void traer () {
    System.out.println("Ahhhhhh perro traes el ocnitrix");
  }

  public void recibir (String prro) {
    System.out.println("Dame la pelota :v");
  }

  public int dar () {
    System.out.println("Toma el ocnitrix");
    return 1;
  }

  public void setNombre (String n) {
    nombre = n;
  }

  public String getNombre () {
    return nombre;
  }

  public void traer (int edad) {
    System.out.println("x");
  }
}
