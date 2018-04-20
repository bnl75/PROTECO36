//Metodos que resiven arreglos como parametro
public class PasoArreglo {
  public static void main(String[] args) {
    int[] arreglo = {1,2,3,4,5};

    System.out.println("Efecto de pasar una referencia de un arreglo");

    for (int i = 0; i < arreglo.length; i++) {
        System.out.println("Arregl [" + i + "]: " + arreglo[i]);
    }

    modificarArreglo(arreglo);
    System.out.println("Los valores del arreglo modificado son:");
    for (int i = 0; i < arreglo.length; i++) {
        System.out.println("Arregl [" + i + "]: " + arreglo[i]);
    }
  }

    public static void modificarArreglo(int[] a) {
      for (int i = 0; i < a.length; i++) {
      a[i] *= 5;
      }
    }
  }
