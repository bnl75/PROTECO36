import java.util.Scanner;
import java.util.InputMismatchException;

public class Arrayexception {
  public static void main(String[] args) {

    /*excepcion para cuando se excede la capacidad del arreglo
    try {

      int[] numeros = {1,2,3,4};
      System.out.println("" + numeros[8]);  //Para que truene el programa
      System.out.println("Todo bien");
      //Siempre el try va a llevar su catch

    } catch (ArrayIndexOutOfBoundsException aioobe) { //Por convención se ponen las iniciales de la excepcion para saber de que excepcion se abstracta
      System.out.println("Te excediste del rango del arreglo");
    }*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Scanner sc = new Scanner(System.in);

    int x, y;

    System.out.println("Ingresa un número: ");

    try {
      x = sc.nextInt();
    } catch (InputMismatchException ime) {
      System.out.println("No se ingresó un número");
    } finally {
      System.out.println("Siempre se ejecuta este bloque del código aunque haya excepción o no");
      x = 4;
    }


    String cadena;

    System.out.println("Ingresa un número para ser el divisor");

    try {
      sc.nextLine();    //Para esperar un [Enter]... como un getch en C
      cadena = sc.nextLine();
      y = Integer.parseInt(cadena);    //Aquí casteamos
      System.out.println("El resultado es " + (x/y));
    } catch (NumberFormatException nfe) {
      System.out.println("No se ingresó un número");
    } catch (ArithmeticException ae) {
      System.out.println("No se puede divir entre 0");
    }
  }
}
