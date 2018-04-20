public class PruebaPersona {
  public static void main (String[] args) {
    Persona p1 = new Persona ();

    p1.nombre = "Diego";
    p1.edad = 19;
    p1.peso = 59.5;

    p1.caminar();
    p1.dormir();


    /*Persona per;                      //se puede instanciar también de esta forma
    per = new Persona ();
    Persona p3 = p1;
    p1 = null;*/
  }
}
