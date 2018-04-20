public class PruebaAlumno {
  public static void main (String[] args) {
    Alumno a1 = new Alumno ();

    a1.nombre = "Diego Arturo";
    a1.aPaterno = "Bernal";
    a1.aMaterno = "Sanchez";
    a1.numCuenta = 314151313;

    System.out.println("El numero de cuenta del alumno es: " + a1.numCuenta);

    a1.dormir ();
  }
}
