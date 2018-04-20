import java.util.Scanner;

public class Pared {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String cuadro = "\u220E";
    int longitud = 0;
    int agua = 1;

    //Para definir la longitud del arreglo
    System.out.println("Ingresa la longitud del arreglo: ");
    longitud = teclado.nextInt();

    int[] arreglo  = new int[longitud];

    //Para leer los valores y llenar el arreglo
    System.out.println("Ingresa " + longitud + " elementos para el arreglo (solo números enteros positivos)...");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("Ingresa el elemento [" + (i + 1)  + "]: ");
      arreglo[i] = teclado.nextInt();
    }

  //  int[] arreglo = {0,1,0,2,1,0,1,3,2,1,2,1};
    int numMayor = arreglo[0];

/*    //Para saber el número más grande en el arreglo
    for(int i = 0; i < arreglo.length; i++){
      if(arreglo[i]>numMayor){
        numMayor = arreglo[i];
      }
    }

    System.out.println(numMayor);
*/

    System.out.println("-------------------------------------------------------------------------");
    //Para imprimir las paredes
    for (int contador = 0; contador < arreglo.length; contador++) {
      for (int bloque = 0; bloque < arreglo[contador]; bloque++) {
        System.out.print(cuadro);
      }

      System.out.println();

    }
    System.out.println("-------------------------------------------------------------------------");


    for (int posicion = 1; posicion < (arreglo.length - 1); posicion++) {
      if (arreglo[posicion] < arreglo[posicion + 1]) {
        agua += arreglo[posicion + 2] - arreglo[posicion];
      }
    }

    System.out.println("El número de bloques llenos de agua es: " + agua);

  }
}
