public class Bidimensional {
  public static void main(String[] args) {

    //Arreglos bidimencionales
    int[][] arreglo1 = {{1,2,3},{4,5,6}};
    int[][] arreglo2 = new int[1][2];
    //NombreClase[] arr = new NombreClase[5];   //Es un arreglo de objetos


      arreglo2[0][0] = Integer.parseInt(args[0]);  //Inicia en 0 porque 0 es el primer elemento del arreglo
      arreglo2[0][1] = Integer.parseInt(args[1]);

  }
}
