import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraMatriz {
  public static int tamano;

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Se pide al usuario el tamaño de las matrices cuadradas
    System.out.print("Ingresa el tamaño que deseas para las matrices cuadradas de enteros nxn\nn = ");
    tamano = teclado.nextInt();

    //Se crean las matrices del tamaño que el usuario indicó
    int[][] matriz1 = new int [tamano][tamano];
    int[][] matriz2 = new int [tamano][tamano];
    int[][] matrizResultado = new int [tamano][tamano];
    int opcion;
    boolean salir = false;

    //Se insertan valores en la matriz 1
    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[i].length; j++) {
        System.out.print("Ingresa el elemento [" + (i + 1) + "]" + "[" + (j + 1) + "] de la matriz 1: ");
        matriz1[i][j] = teclado.nextInt();
      }
    }

    System.out.println("");

    //Se insertan valores en la matriz 2
    for (int i = 0; i < matriz2.length; i++) {
      for (int j = 0; j < matriz2[i].length; j++) {
        System.out.print("Ingresa el elemento [" + (i + 1) + "]" + "[" + (j + 1) + "] de la matriz 2: ");
        matriz2[i][j] = teclado.nextInt();
      }
    }

    while (!salir) {
      //Se muestra un menú para las opciones de la calculadora
      System.out.println("\nLas operaciones disponibles son:");
      System.out.println("1) Suma de matrices");
      System.out.println("2) Resta de matrices");
      System.out.println("3) Multiplicación de matrices");
      System.out.println("4) Salir");

      //Excepción al no ingresar una opción válida
      try {

        System.out.print("\nIngresa el número de la operación a realizar con las dos matrices: ");
        opcion = teclado.nextInt();

        //Switch para ejecutar la operación que el usuario haya elegido
        switch (opcion) {
          case 1: //SUMA
            System.out.println("\n\tSUMA DE MATRICES");

            //Hace la operación
            for (int i = 0; i < matriz1.length; i++) {
              for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
              }
            }

            //Imprime el resultado
            for (int i = 0; i < matrizResultado.length; i++) {
              for (int j = 0; j < matrizResultado.length; j++) {
                System.out.println("\tSuma [" + (i + 1) + "]" + "[" + (j + 1) + "]: " + matrizResultado[i][j]);
              }
            }
            break;

          case 2: //RESTA
            System.out.println("\n\tRESTA DE MATRICES");

            //Hace la operación
            for (int i = 0; i < matriz1.length; i++) {
              for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
              }
            }

            //Imprime el resultado
            for (int i = 0; i < matrizResultado.length; i++) {
              for (int j = 0; j < matrizResultado.length; j++) {
                System.out.println("\tSuma [" + (i + 1) + "]" + "[" + (j + 1) + "]: " + matrizResultado[i][j]);
              }
            }
            break;

          case 3: //MULTIPLICACIÓN
            System.out.println("\n\tMULTIPLICACIÓN DE MATRICES");

            //Hace la operación
            for (int i = 0; i < matriz1.length; i++) {
              for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] * matriz2[i][j];
              }
            }

            //Imprime el resultado
            for (int i = 0; i < matrizResultado.length; i++) {
              for (int j = 0; j < matrizResultado.length; j++) {
                System.out.println("\tSuma [" + (i + 1) + "]" + "[" + (j + 1) + "]: " + matrizResultado[i][j]);
              }
            }
            break;

          case 4: //Para salir del programa
            salir = true;
            break;

          default:
            System.out.println("Opción incorrecta!\n\n");
        }
      } catch (InputMismatchException ime) {
        System.out.println("\nDebes insertar un número del 1 al 4");
        teclado.next();
      }
    }
  }
}
