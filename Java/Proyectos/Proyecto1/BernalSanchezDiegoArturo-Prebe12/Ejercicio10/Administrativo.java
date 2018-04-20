public class Administrativo extends Trabajador {
  private static String area;
  private static String turnoTiempo;
  private static final String tipo = "Administrativo";

  Administrativo(String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String edad, String nacionalidad, String numTrabajador, String rfc, String antiguedad, String area, String turnoTiempo) {
    super(nombre, aPaterno, aMaterno, fechaNacimiento, edad, nacionalidad, numTrabajador, rfc, antiguedad);
    this.area = area;
    this.turnoTiempo = turnoTiempo;
  }

  //Métodos setters
  public void setArea(String a) {
    area = a;
  }

  public void setTurnoTiempo(String tt) {
    turnoTiempo = tt;
  }

  //Métodos getters
  public static String getArea() {
    return area;
  }

  public static String getTurnoTiempo() {
    return turnoTiempo;
  }

  //Método toString
  public String toString() {
    return String.format("Nombre(s): %s\nApellido paterno: %s\nApellido materno: %s\nFecha de nacimiento: %s\nEdad: %s\nNacionalidad: %s\nNúmero de trabajador: %s\nRFC: %s\nAntigüedad: %s\nTipo de puesto: %s\nÁrea: %s\nJornada de trabajo: %s", Administrativo.getNombre(), Administrativo.getAPaterno(), Administrativo.getAMaterno(), Administrativo.getFechaNacimiento(), Administrativo.getEdad(), Administrativo.getNacionalidad(), Administrativo.getNumTrabajador(), Administrativo.getRfc(), Administrativo.getAntiguedad(), Administrativo.tipo, Administrativo.getArea(), Administrativo.getTurnoTiempo());
  }
}
