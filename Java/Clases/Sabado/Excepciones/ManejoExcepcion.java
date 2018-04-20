public class ManejoExcepcion {
  public static void main(String[] args) {
    MetodosExcepcion me = new MetodosExcepcion();

    try {
      me.lanzarExcepcion();
    } catch (MiExcepcion mie) {   //"mie" es el nombre de la excepción-objeto que yo se lo doy. Se usa la convencion de las iniciales de la excepción
      System.out.println(mie);
      mie.hola();
      mie.getMessage();
    }
  }
}
