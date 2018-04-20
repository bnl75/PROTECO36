public class ControlRemoto {

  private Encendible e1, e2;    //Todo lo que implemente la interfaz Encendible puedo encender. La clase ControlRemoto va a poder ocupar objetos de tipo Encendible
  private Apagable a1, a2;

  //Constructor
  public ControlRemoto (Encendible e1, Encendible e2, Apagable a1, Apagable a2) {
    this.e1 = e1;
    this.e2 = e2;
    this.a1 = a1;
    this.a2 = a2;
  }

  //No sabe que objetos se van a encender, solo sabe que sí se pueden encender

  public void oprimirBoton1() {
    e1.encender();
  }

  public void oprimirBoton2() {
    e2.encender();
  }

  public void oprimirBoton3() {
    a1.apagar();
  }

  public void oprimirBoton4() {
    a2.apagar();
  }
}
