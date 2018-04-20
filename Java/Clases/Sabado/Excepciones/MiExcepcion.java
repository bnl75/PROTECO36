public class MiExcepcion extends Exception {
  @Override //Para indicar que estoy haciendo sobreescritura
  public String toString() {
    return "Mi propia excepción";
  }

  @Override
  public String getMessage() {
    return "Es nuestro propio mensaje";
  }

  public void hola() {
    System.out.println("Hola mundo desde la excepción");
  }
}
