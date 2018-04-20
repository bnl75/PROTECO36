public class Vehiculo {
  String nombre;

  //Constructor
  public Vehiculo(String nombre) {
    this.nombre = nombre;   //this.nombre hace referencia a la variable; "nombre" hace referencia al argumento
  }

  public String transportar() {
    return  "Bienvenido al transporte..."; 
  }
}
