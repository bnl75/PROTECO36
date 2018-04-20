import java.util.ArrayList;

public class ColeccionArrayList {
  public static void main(String[] args) {
    ArrayList<String> elementos = new ArrayList<String>();    //Se le conoce como colecciones genéricas porque no son de un tipo especifco

    elementos.add("rojo");  //Para agregar un elemento al ArrayList uso "add"
    elementos.add(0, "azul");   //Con el 0 le indico en qué posicion quiero insertar el nuevo elemento. Va a recorrer todos los elementos si es que no lo inserto al final

    System.out.println("Primer ArrayList");

    //Para imprimir los elementos del arreglo
    for (int i = 0; i < elementos.size(); i++) {
      System.out.printf("%s\n", elementos.get(i));    //Con get imprimo los valores del arreglo

    }

    elementos.remove("azul");   //Para borrar un elemento del arreglo por el contenido
    elementos.remove(0);    //Para borrar un elemento del arreglo por el índice

    System.out.println("\nArrayList modificado");

    for (int i = 0; i < elementos.size(); i++) {
      System.out.printf("%s\n", elementos.get(i));    //Con get imprimo los valores del arreglo

    }

  }
}
