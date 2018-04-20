public class PruebaPerro {
  public static void main(String[] args) {
    Perro prro = new Perro ();
    Perro perro1 = new Perro("Kevin", 4);

/*
    perro1.traer();
    perro1.dar ();
    perro1.recibir ("hola");
*/

    perro1.setNombre("Firulais");
    System.out.println("El nombre del perro es " + perro1.getNombre());
    perro1.traer();
    perro1.traer(15);
  }


}
