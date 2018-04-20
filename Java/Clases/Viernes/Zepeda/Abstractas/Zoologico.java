public class Zoologico {
  private final int N = 10;     //Es el número máximo de animales que puedo tener en el zoologico

  //Para declarar el arreglo
  public Animal[] animales = new Animal[N];

  //Para agregar animales nuevos al zoologico
  public int numero;

  public void agregarAnimal(Animal a) {
    if (numero == N) {
      System.out.println("Zoologico lleno!");
    } else {
      animales[numero] = a;
      numero++;
    }
  }
}
