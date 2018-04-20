import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Circulo c1 = new Circulo();
    Rectangulo r1 = new Rectangulo();

    Scanner teclado = new Scanner(System.in);

    //Se solicita el radio del círculo
    System.out.print("Ingresa el radio del círculo: ");
    c1.setRadio(teclado.nextDouble());

    //System.out.print("Ingresa el diámetro del círculo: ");    Esto es por si se usa el otro método para obtener el perímetro
    //c1.setDiametro(teclado.nextDouble());

    //Se muestra el área y perímetro del círculo
    System.out.println("\nEl área del círculo es: " + c1.areaCirculo());
    System.out.println("El perímetro del círculo es: " + c1.perimetroCirculoConElRadio());


    //Se solicita la base y altura del Rectángulo
    System.out.print("\n\nIngresa la base del rectángulo: ");
    r1.setBase(teclado.nextDouble());
    System.out.print("Ingresa la altura del rectángulo: ");
    r1.setAltura(teclado.nextDouble());

    //Se muestra el área y perímetro del rectángulo
    System.out.println("\nEl área del rectángulo es: " + r1.areaRectangulo());
    System.out.println("El perímetro del rectángulo es: " + r1.perimetroRectangulo());
  }
}
