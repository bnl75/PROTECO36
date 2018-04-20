import java.util.Scanner;

public class MetodosExcepcion {

  public void lanzarExcepcion() throws MiExcepcion {
    Scanner sc = new Scanner(System.in);
    System.out.println("Presiona 1 para lanzar la excepción");

    int i = sc.nextInt();

    if (i == 1) {
      throw new MiExcepcion();
    }
  }
}
