import java.util.Scanner;
class Prueba2 {
  float PI = 3.1416f;
  static double PI2 = 3.15;

  public static void main(String... machi) {
    System.out.println(new Prueba2().PI);
    System.out.println(PI2);

    Scanner teclado = new Scanner(System.in);

    //float f = Float.parseFloat(ddnew java.util.Scanner(System.in).next()); Es como el import Scanner

    String salida = teclado.next();  //Aquí lee de la consola

    float f1 = Float.parseFloat(salida); //Usa la clase FLOAT con el método parseFloat para convertir un String a un flotante

    System.out.println("Este es el float: " + f1);

    double d = Double.parseDouble(new java.util.Scanner(System.in).next());

    System.out.println("Este es el double: " + d);
  }
}
