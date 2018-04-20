public class Computadora implements Encendible, Apagable {
  public void encender() {
    System.out.println("Bienvenido... iniciando sesión...");
  }

  public void apagar() {
    System.out.println("Adios... se ha cerrado sesión");
  }
}
