public class Barco extends VehiculoAcuatico {

  public Barco(String nombre) {
    super(nombre);
  }

  public void encenderMotores() {
    System.out.println("Estoy encendiendo los motores");
  }

  //Sobreescritura del método navegar
  @Override     //Se pone por buenas prácticas
  public void navegar(){
    System.out.println("Soy un barco y mi nombre es " + nombre);    //Se está cambiando el comportamiento del método navegar (del original); por lo tanto ya es polimorfismo
  }

}
