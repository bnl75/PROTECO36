public class Main {
  public static void main(String[] args) {
    //Instancia de CarroBMW y sus métodos
    CarroBMW bmw1 = new CarroBMW(2100000, 135, "118iA (BMW)");
    bmw1.encender();
    bmw1.apagar();
    bmw1.estado();
    System.out.println(bmw1);

    System.out.println("");

    //Instancia de CarroAudi y sus métodos
    CarroAudi audi1 = new CarroAudi(1900000, 150, "A3 (Audi)");
    audi1.apagar();
    audi1.encender();
    audi1.estado();
    System.out.println(audi1);
  }
}
