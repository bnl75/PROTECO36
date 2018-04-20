public class Main {
  public static void main(String[] args) {

    //Instancia del control
    ControlRemoto control = new ControlRemoto(new Foco(), new Computadora(), new Foco(), new Computadora());   //Recibe como argumentos dos cosas que puedan encender y apagar

    //Para encender
    control.oprimirBoton1();
    control.oprimirBoton2();

    //Para apagar
    control.oprimirBoton3();
    control.oprimirBoton4();
  }
}
