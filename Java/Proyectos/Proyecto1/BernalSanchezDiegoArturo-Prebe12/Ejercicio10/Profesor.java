public class Profesor extends Trabajador {
  private static int numDeGrupos;
  private static int totalDeAlumnos;
  private static final String tipo = "Profesor";

  //Método constructor
  Profesor(String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String edad, String nacionalidad, String numTrabajador, String rfc, String antiguedad, int numDeGrupos, int totalDeAlumnos) {
    super(nombre, aPaterno, aMaterno, fechaNacimiento, edad, nacionalidad, numTrabajador, rfc, antiguedad);
    this.numDeGrupos = numDeGrupos;
    this.totalDeAlumnos = totalDeAlumnos;
  }

  //Métodos setters
  public void setNumGrupos(int ng) {
    numDeGrupos = ng;
  }

  public void setTotalDeAlumnos(int tda) {
    totalDeAlumnos = tda;
  }

  //Métodos getters
  public static int getNumDeGrupos() {
    return numDeGrupos;
  }

  public static int getTotalDeAlumnos() {
    return totalDeAlumnos;
  }

  //Método toString
    public String toString() {
      return String.format("Nombre(s): %s\nApellido paterno: %s\nApellido materno: %s\nFecha de nacimiento: %s\nEdad: %s\nNacionalidad: %s\nNúmero de trabajador: %s\nRFC: %s\nAntigüedad: %s\nTipo de puesto: %s\nGrupos a cargo de dar clases: %d\nTotal de alumnos a impartir clases: %d", Profesor.getNombre(), Profesor.getAPaterno(), Profesor.getAMaterno(), Profesor.getFechaNacimiento(), Profesor.getEdad(), Profesor.getNacionalidad(), Profesor.getNumTrabajador(), Profesor.getRfc(), Profesor.getAntiguedad(), Profesor.tipo, Profesor.getNumDeGrupos(), Profesor.getTotalDeAlumnos());
    }
}
