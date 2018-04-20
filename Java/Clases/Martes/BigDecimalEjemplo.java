public class BigDecimalEjemplo {
  double unCentavo = 0.01;

  public void saludar() {
    System.out.println("Hola mundo OO!");
  }

  public void darEjemploChafa() {
    double suma = unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo;
    System.out.println(suma);
  }

  public void darEjemploChido() {
    java.math.BigDecimal otroCentavo = new java.math.BigDecimal("0.1");   //se está declarando como tipo BigDecimal.., se hace referencia de donde está porque no estoy imortando la clase
    java.math.BigDecimal suma = otroCentavo.add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo).add(otroCentavo);
    System.out.println(suma);
  }

  public static void main(String[] args) {
    BigDecimalEjemplo b = new BigDecimalEjemplo();

    b.saludar();
    b.darEjemploChafa();
    b.darEjemploChido();
  }
}
