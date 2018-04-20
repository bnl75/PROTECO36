public class VehiculoAcuatico extends Vehiculo {
  String nombreAcuatico;

  //Constructor
  public VehiculoAcuatico(String nombre) {
    super(nombre);
  }

  public void navegar() {
    System.out.println(super.transportar() + "acuatico");   //Con super manda a llamar al metodo "transporte" de la clase padre (de donde hereda) y lo concatena con la palabra "acuatico".
  }
}
