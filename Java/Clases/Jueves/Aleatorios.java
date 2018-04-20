import java.util.Random;

public class Aleatorios {
  public static void main(String[] args) {
    System.out.println("Esta es una prueba para arreglos llenados aleatoriamente");
//    Scanner teclado = new Scanner(System.in);
    Random aleatorio = new Random();

    int[] arreglo1 = new int[5];
    int[] arreglo2 = new int[5];

    for (int i = 0; i < arreglo1.length; i++) {
      //System.out.print("Ingresa el elemento " + i + ": ");
      arreglo1[i] = aleatorio.nextInt(70);    //se pone 70 para que sea el delimitador de mis números random... del 0 al
      arreglo2[i] = aleatorio.nextInt(8) + 1;   //+1 para que no empiece desde 0
    }

    System.out.println("Arrglo 1:");
    for (int i = 0; i < arreglo1.length; i++) {
      System.out.println("El contenido en el indice [" + i + "] es: " + arreglo1[i]);
      //System.out.println("El contenido en el indice [" + i + "] es: " + arreglo2[i]);
    }

    System.out.println("Arrglo 2:");
    for (int i = 0; i < arreglo2.length; i++) {
      System.out.println("El contenido en el indice [" + i + "] es: " + arreglo2[i]);
      //System.out.println("El contenido en el indice [" + i + "] es: " + arreglo2[i]);
    }
  }
}
