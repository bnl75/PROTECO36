public class Trabajador extends Persona implements AccionComun {
  private static String numTrabajador;
  private static String rfc;
  private static String antiguedad;

  //Método Constructor
  Trabajador(String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String edad, String nacionalidad, String numTrabajador, String rfc, String antiguedad) {
    super(nombre, aPaterno, aMaterno, fechaNacimiento, edad, nacionalidad);
    this.numTrabajador = numTrabajador;
    this.rfc = rfc;
    this.antiguedad = antiguedad;
  }

  //Métodos getters
  public static String getNumTrabajador() {
    return numTrabajador;
  }

  public static String getRfc() {
    return rfc;
  }

  public static String getAntiguedad() {
    return antiguedad;
  }

  //Métodos de la interfaz
  public void dormir() {
    System.out.println("Duermo en el trabajo :v");
  }
  public void comer() {
    System.out.println("LLevo mi comida al trabajo en tuppers");
  }
  public void tomarAgua() {
    System.out.println("Tomo agua del garrafón");
  }
  public void respirar() {
    System.out.println("Respiro cuando no tengo tanta carga de trabajo");
  }
}
