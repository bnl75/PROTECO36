import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PrebeMart {

  public static void main(String[] args) {
    ArrayList<String> productos = new ArrayList<String>();
    ArrayList<String> precios = new ArrayList<String>();

    //Declaración de variables
    int opcion;
    int opcion2;
    int opcion3;
    int eliminar;
    double total = 0;
    String insertarNombre;
    String insertarPrecio;
    boolean salir = false;
    boolean salir2 = false;
    boolean salir3 = false;

    Scanner teclado = new Scanner(System.in);

    //While para que el menú principal se cierre hasta que el usuario lo indique
    while (!salir) {
      System.out.println("Si desea agregar productos pulse \"1\"...");
      System.out.println("Si desea ver la lista de sus productos pulse \"2\"...");
      System.out.println("Para SALIR pulse \"3\"");

      //Excepción para cuando se inserta una opción inválida (que no sea numérica)
      try {
        System.out.print("Ingresa una opción: ");
        opcion = teclado.nextInt();
        System.out.println("");

        //Switch del menú principal
        switch (opcion) {
          case 1: //Para agregar productos
            while (!salir2) {
              System.out.println("\nAGREGAR PRODUCTOS AL CARRITO");
              System.out.println("  1) Agregar producto");
              System.out.println("  2) Regresar al menú anterior");

              try {
                System.out.print("Ingresa una opción: ");
                opcion2 = teclado.nextInt();
                System.out.println("");

                //Switch del submenú para agregar productos
                switch (opcion2) {
                  case 1:
                    System.out.print("\tIngresa el nombre del producto: ");
                    insertarNombre = teclado.next();
                    productos.add(insertarNombre);

                    System.out.print("\tIngresa el precio del producto " + productos.get(productos.size() - 1) + ": ");
                    insertarPrecio = teclado.next();
                    precios.add(insertarPrecio);
                    break;

                  case 2:
                    salir2 = true;
                    break;

                  default:
                    System.out.println("Opción inválida!");
                }
              } catch (InputMismatchException ime) {
                System.out.println("\nDebes insertar un número del 1 al 2");
                teclado.next();
              }
            }
            break;

          case 2: //Para ver lista de productos y mostrar menú de comprar
            System.out.println("\nLISTA DE PRODUCTOS EN CARRITO");

            System.out.println("\t**Producto** \t\t**Precio**");

            //Imprime la lista de productos
            for (int i = 0; i < productos.size(); i++) {
              System.out.printf("\t  %s \t\t  %s\n", productos.get(i), precios.get(i));
            }

            //Calcula el importe total
            for (int j = 0; j < precios.size(); j++) {
              total = total + Double.parseDouble(precios.get(j));
            }

            System.out.println("\nImporte total en el carrito: $" + total);

            while (!salir3) {
              System.out.println("\nSelecciona una opción...");
              System.out.println("1) Comprar");
              System.out.println("2) Quitar productos del carrito");

              try {
                System.out.print("\nOpción: ");
                opcion3 = teclado.nextInt();
                System.out.println("");

                //submenú para comprar o para quitar productos
                switch (opcion3) {
                  case 1: //Para comprar
                    if (total <= 500 && total > 0) {  //si el dinero es suficiente
                      System.out.println("Gracias por su compra!");
                      salir3 = true;
                      salir2 = true;
                      salir = true;
                    } else if (total <= 0) {  //si no hay productos en el carrito
                      System.out.println("No ha comprado productos... Adios!");
                      salir3 = true;
                      salir2 = true;
                      salir = true;
                    } else {  //si el dinero es insuficiente
                      System.out.println("Dinero insuficiente :(");
                      System.out.println("Debe quitar productos del carrito para poder realizar la compra!\n");
                    }
                    break;

                  case 2: //Para quitar productos del carrito
                    System.out.println("\nELIMINAR PRODUCTOS");

                    //Imprime la lista de productos actuales en el carrito junto con su precio e índice
                    for (int i = 0; i < productos.size(); i++) {
                      System.out.printf("\t%s ($%s) en el índice: [%d]\n", productos.get(i), precios.get(i), i);
                    }

                    //Solicita el índice del producto a eliminar y lo elimina
                    System.out.print("Inserte el índice del producto a eliminar: ");
                    eliminar = teclado.nextInt();
                    System.out.println("");

                    productos.remove(eliminar);
                    precios.remove(eliminar);

                    //Vuelve a calcular el importe total de productos en el carrito
                    total = 0;

                    for (int j = 0; j < precios.size(); j++) {
                      total = total + Double.parseDouble(precios.get(j));
                    }

                    //Muestra el nuevo importe total
                    System.out.println("\nImporte total en el carrito: $" + total);
                    break;

                  default:
                    System.out.println("Opción incorrecta!\n\n");
                }

              } catch (InputMismatchException ime) {
                System.out.println("\nDebes insertar una opción del 1 al 2");
                teclado.next();
              }
            }
            break;

          case 3: //Para salir del programa
            System.out.println("Adios...");
            salir = true;
            break;

          default:
            System.out.println("Opción incorrecta!\n\n");
        }
      } catch (InputMismatchException ime) {
        System.out.println("\nDebes insertar un número del 1 al 3");
        teclado.next();
      }
    }
  }
}
