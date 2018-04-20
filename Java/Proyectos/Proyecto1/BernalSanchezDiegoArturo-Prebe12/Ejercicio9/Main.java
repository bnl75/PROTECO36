public class Main {
  public static void main(String[] args) {
    Perro perro1 = new Perro();
    Gato gato1 = new Gato();

    System.out.println("Métodos originales:");
    System.out.println("  El perro1 hace: " + perro1.hacerRuido());
    System.out.println("  El gato1 hace: " + gato1.hacerRuido());

    System.out.println("\nPerro1: " + perro1.estado); //Imprime el valor de la variable que heredó
    System.out.println("Gato1: " + gato1.estado); //Imprime el valor de la variable que heredó

    System.out.println(gato1);  //Imprime el método toString que heredó

    Mamifero m1 = new Gato(); //Aquí se está haciendo un UpCasting

    System.out.println(m1.hacerRuido());  //Un objeto del tipo Mamifero puede hacer uso de los métodos de la clase Gato

    Animal a1 = gato1;  //Aquí se está haciendo un UpCasting en donde gato1 no puede usar los métodos de la clase Gato
    System.out.println("gato1: " + gato1.dondeEstoy());
    System.out.println("a1: " + a1.dondeEstoy());

    Gato gato2 = (Gato) a1;   //Aquí se hace el DownCasting para que regrese a su forma original
    System.out.println(gato2.hacerRuido());
    System.out.println(a1.dondeEstoy());




  }
}
