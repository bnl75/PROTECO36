//Rengo de calif del  00-09, 10-19, 20-29, ..., 90-99, 100

public class GraficoBarras {
  public static void main(String[] args) {
    int[] arreglo = {20,5,7,9,4,5,21,15,3,15,10};  //El primer elemento corresponde al primer intervalo (voy a obtener estos datos aleatoriamente para la tarea)
    System.out.println("Distribución");

    //Para cada elemento del arreglo imprimir una barra del gráfico
    for (int contador = 0; contador < arreglo.length; contador++) {
      if (contador == 10) {
        System.out.printf("%5d", 100);
      } else {
        System.out.printf("%02d-%02d: ", contador*10, contador*10+9);
      }

      //imprimir los asteriscos (la gráfica)
      for (int asterisco = 0; asterisco < arreglo[contador]; asterisco++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
