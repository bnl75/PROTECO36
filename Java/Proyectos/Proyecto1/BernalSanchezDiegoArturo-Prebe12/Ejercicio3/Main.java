import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String captura;
    Scanner teclado = new Scanner(System.in);
    Persona p1 = new Persona();

    //Lee el nombre de la persona como un String
    System.out.print("Ingresa el nombre de la persona: ");
    p1.setNombre(teclado.nextLine());

    //Lee la edad de una persona como un String y lo convierte a un etero
    System.out.print("Ingresa la edad de la persona (en años): ");
    captura = teclado.nextLine();
    p1.setEdad(Integer.parseInt(captura));

    //Lee la estatura de una persona como un String y lo convierte a un double
    System.out.print("Ingresa la estatura de la persona (en metros): ");
    captura = teclado.nextLine();
    p1.setEstatura(Double.parseDouble(captura));

    //Lee el peso de una persona como un String y lo convierte a un double
    System.out.print("Ingresa el peso de la persona (en Kg): ");
    captura = teclado.nextLine();
    p1.setPeso(Double.parseDouble(captura));

    //Imprime los valores de los atributos de la persona p1
    System.out.println("\n\nNombre de la persona: " + p1.getNombre());
    System.out.println("Edad: " + p1.getEdad() + " años");
    System.out.println("Estatura: " + p1.getEstatura() + " m");
    System.out.println("Peso: " + p1.getPeso() + " kg");

  }
}
