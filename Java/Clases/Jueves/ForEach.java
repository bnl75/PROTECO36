public class ForEach {
  public static void main(String[] args) {

    int[] arreglo = {10,10,10,10,10,10,10,10};
    int total = 0;

    //For mejorado (FOR EACH)
    for (int i : arreglo) {
      total += i;
    }

    System.out.println("El total de la suma del arreglo es: " + total);
    }
  }
