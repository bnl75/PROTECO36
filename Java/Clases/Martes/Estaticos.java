 class CampoEstatico {
  static int contador = 0;

  CampoEstatico() {
    contador ++;
  }                     //El Constructor es quien incrementa al contador

  public static void main(String args[]) {
    System.out.println(CampoEstatico.contador); //Por buenas prácticas se pone de qué clase pertenece el atributo
    new CampoEstatico();
    System.out.println(CampoEstatico.contador);
  }
}
