import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double num1, num2;
    int opcion;
    boolean salir = false;

    //While para que el programa termine hasta que el usuario lo indique
    while (!salir) {
      //Menú que muestra las operaciones al usuario
      System.out.println("CALCULADORA");
      System.out.println("\nOperaciones:");
      System.out.println(" 1) Suma");
      System.out.println(" 2) Resta");
      System.out.println(" 3) Multiplicación");
      System.out.println(" 4) División");
      System.out.println(" 5) [SALIR]");

      System.out.print("\nIngresa el número de la operación a realizar: ");

      //Excepción al no ingresar una opción válida
      try {
        //Le la opción del usuario
        opcion = teclado.nextInt();

        //Switch para ejecutar la operación que el usuario haya elegido
        switch (opcion) {
          case 1: //Suma
            //Se solicitan los dos números
            System.out.print("Ingresa el primer número: ");
            num1 = teclado.nextDouble();
            System.out.print("Ingresa el segudo número: ");
            num2 = teclado.nextDouble();
            //Se realiza e imprime la operación
            System.out.println("\nSUMA");
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n\n");
            break;

          case 2: //Resta
            //Se solicitan los dos números
            System.out.print("Ingresa el primer número: ");
            num1 = teclado.nextDouble();
            System.out.print("Ingresa el segudo número: ");
            num2 = teclado.nextDouble();
            //Se realiza e imprime la operación
            System.out.println("\nRESTA");
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + "\n\n");
            break;

          case 3: //Multiplicación
            //Se solicitan los dos números
            System.out.print("Ingresa el primer número: ");
            num1 = teclado.nextDouble();
            System.out.print("Ingresa el segudo número: ");
            num2 = teclado.nextDouble();
            //Se realiza e imprime la operación
            System.out.println("\nMULTIPLICACIÓN");
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) + "\n\n");
            break;

          case 4: //División
            //Se solicitan los dos números
            System.out.print("Ingresa el primer número: ");
            num1 = teclado.nextDouble();
            System.out.print("Ingresa el segudo número: ");
            num2 = teclado.nextDouble();
            //Se realiza e imprime la operación
            System.out.println("\nDIVISIÓN");

            //Excepción para denominador 0
            try {
              System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + "\n\n");
            } catch (NumberFormatException nfe) {
              System.out.println("No se ingresó un número\nDebes ingresar un número");
            } catch (ArithmeticException ae) {
              System.out.println("No se puede divir entre 0 :v");
            }
            break;

          case 5: //Salir del programa
            salir = true;
            break;

          default:
            System.out.println("Opción incorrecta!!!\nSelecciona una opción válida\n\n");
        }

      } catch (InputMismatchException ime) {
        System.out.println("\nDebes insertar un número\n\n");
        teclado.next();
      }
    }
  }
}
