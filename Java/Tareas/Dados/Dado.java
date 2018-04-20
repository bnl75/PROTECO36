import java.util.Random;
import java.util.Scanner;

public class Dado {
  public static void main(String[] args) {

    Random aleatorio = new Random();
    Scanner teclado = new Scanner(System.in);

    int x;

    System.out.print("Ingresa el número de veces a tirar los dados: ");
    x = teclado.nextInt();

    int[] arreglo1 = new int[6];
    int[] arreglo2 = new int[6];

    for (int i = 0; i < arreglo1.length; i++) {
      arreglo1[i] = aleatorio.nextInt(6*x) + 1;
      arreglo2[i] = aleatorio.nextInt(6*x) + 1;
    }

    System.out.println("Distribución\nCaras");

    for (int contador = 0; contador < arreglo1.length; contador++) {
      if (contador == 0) {
        System.out.printf("%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      if (contador == 1) {
        System.out.printf("\n%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      if (contador == 2) {
        System.out.printf("\n%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      if (contador == 3) {
        System.out.printf("\n%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      if (contador == 4) {
        System.out.printf("\n%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      if (contador == 5) {
        System.out.printf("\n%02d-01: ", contador+1);
        System.out.printf("\n%02d-02: ", contador+1);
        System.out.printf("\n%02d-03: ", contador+1);
        System.out.printf("\n%02d-04: ", contador+1);
        System.out.printf("\n%02d-05: ", contador+1);
        System.out.printf("\n%02d-06: ", contador+1);
      }

      for (int asterisco = 0; asterisco < arreglo1[contador]; asterisco++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
