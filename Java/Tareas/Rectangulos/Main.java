import java.util.Scanner;

public class Main {
  public static int nuevo;
  public static void main(String[] args) {
    Rectangulo rec1 = new Rectangulo();
    Rectangulo rec2 = new Rectangulo();

    Scanner teclado = new Scanner(System.in);

    System.out.println("Las dimensiones del primer rectangulo son:");
    System.out.println("Base: " + rec1.getBase());
    System.out.println("Altura: " + rec1.getAltura());


    System.out.println("\n\nIngresa cuántas veces quieres agrandar el rectangulo:");
    nuevo = teclado.nextInt();

    agrandar(nuevo);

    System.out.println("\n\nLas dimensiones del nuevo rectangulo son:");
    System.out.println("Base: " + rec2.getBase2());
    System.out.println("Altura: " + rec2.getAltura2());
  }
}
