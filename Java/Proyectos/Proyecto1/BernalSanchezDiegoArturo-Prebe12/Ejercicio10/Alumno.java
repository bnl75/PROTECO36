public class Alumno extends Persona implements AccionComun {
  private static String numCuenta;
  private static String turno;
  private static String carrera;
  private static String semestre;
  private static String grupo;

  //Método constructor
  Alumno(String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String edad, String nacionalidad, String numCuenta, String turno, String carrera, String semestre, String grupo) {
    super(nombre, aPaterno, aMaterno, fechaNacimiento, edad, nacionalidad);
    this.numCuenta = numCuenta;
    this.turno = turno;
    this.carrera = carrera;
    this.semestre = semestre;
    this.grupo = grupo;
  }

  //Métodos setters
  public void setNumCuenta(String nc) {
    numCuenta = nc;
  }

  public void setTurno(String t) {
    turno = t;
  }

  public void setCarrera (String c) {
    carrera = c;
  }

  public void setSemestre(String s) {
    semestre = s;
  }

  public void setGrupo(String g) {
    grupo = g;
  }

  //Métodos getters
  public static String getNumCuenta() {
    return numCuenta;
  }

  public static String getTurno() {
    return turno;
  }

  public static String getCarrera() {
    return carrera;
  }

  public static String getSemestre() {
    return semestre;
  }

  public static String getGrupo() {
    return grupo;
  }

  //Métodos de la interfaz
  public void dormir() {
    System.out.println("Duermo cuando termino temprano la tarea");
  }
  public void comer() {
    System.out.println("Compro comida en la escuela y como mientras regreso al salón");
  }
  public void tomarAgua() {
    System.out.println("Tomo agua de mi botella");
  }
  public void respirar() {
    System.out.println("Respiro cuando no tengo proyectos por entregar");
  }

  //Método toString
  public String toString() {
    return String.format("Nombre(s): %s\nApellido paterno: %s\nApellido materno: %s\nFecha de nacimiento: %s\nEdad: %s\nNacionalidad: %s\nNúmero de cuenta: %s\nTurno: %s\nCarrera: %s\nSemestre: %s\nGrupo: %s", Alumno.getNombre(), Alumno.getAPaterno(), Alumno.getAMaterno(), Alumno.getFechaNacimiento(), Alumno.getEdad(), Alumno.getNacionalidad(), Alumno.getNumCuenta(), Alumno.getTurno(), Alumno.getCarrera(), Alumno.getSemestre(), Alumno.getGrupo());
  }
}
