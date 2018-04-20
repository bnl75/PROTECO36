public class Persona {
  private static String nombre;
  private static String aPaterno;
  private static String aMaterno;
  private static String fechaNacimiento;
  private static String edad;
  private static String nacionalidad;

  //Método constructor
  Persona(String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String edad, String nacionalidad) {
    this.nombre = nombre;
    this.aPaterno = aPaterno;
    this.aMaterno = aMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.edad = edad;
    this.nacionalidad = nacionalidad;
  }

  //Métodos getters
  public static String getNombre() {
    return nombre;
  }

  public static String getAPaterno() {
    return aPaterno;
  }

  public static String getAMaterno() {
    return aMaterno;
  }

  public static String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public static String getEdad() {
    return edad;
  }

  public static String getNacionalidad() {
    return nacionalidad;
  }
}
