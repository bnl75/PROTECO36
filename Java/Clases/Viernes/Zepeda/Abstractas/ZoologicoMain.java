public class ZoologicoMain {
  public static void main(String[] args) {
    Zoologico z = new Zoologico();

    z.agregarAnimal(new Jirafa());
    z.agregarAnimal(new Leon());

    for (int i = 0; i < z.numero; i++) {
      Animal a = z.animales[i];
      a.alimentar(new Carne());
      a.alimentar(new Manzana());   //Se está haciendo un UpCasting***¿?

      if (a instanceof Leon) {    //instanceof sirve para saber cuando un OBJETO es INSTANCIA de una clase
        Leon l = (Leon) a;    //Es un DownCasting porque se está convirtiendo de lo general a lo particular
        l.rugir();    //
      }

    }
  }
}
