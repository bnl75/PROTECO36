public class Main {
  public static void main(String[] args) {
    Alumno alumno1 = new Alumno("Diego Arturo", "Bernal", "Sánchez", "13.08.1998", "19 años", "Mexicana", "314151313", "Vespertino", "Informática", "4", "1234");
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("ALUMNO 1...");
    System.out.println(alumno1);

    Alumno alumno2 = new Alumno("Luis Felipe", "Zamora", "Campos", "26.09.1998", "19 años", "Mexicana", "314684596", "Matutino", "Informática", "4", "4321");
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("\nALUMNO 2...");
    System.out.println(alumno2);

    Alumno alumno3 = new Alumno("Felipe Itzamatul", "Guillen", "Martínez", "19.10.1997", "20 años", "Mexicana", "325874593", "Vespertino", "Informática", "4", "1224");
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("\nALUMNO 3...");
    System.out.println(alumno3);

    Profesor profesor1 = new Profesor("Ricardo", "Méndez", "Luna", "26.03.1981", "37 años", "Mexicana", "1587459519", "RML191097HDF01", "6 años", 2, 86);
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("\n\nPROFESOR 1...");
    System.out.println(profesor1);

    Profesor profesor2 = new Profesor("Ismael Isrrael", "Perea", "Camarillo", "17.02.1968", "50 años", "Mexicana", "1587459630", "IPC170268HDF03", "20 años", 3, 115);
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("\nPROFESOR 2...");
    System.out.println(profesor2);

    Administrativo admin1 = new Administrativo("Tomás", "Rubio", "Cruz", "30.12.1965", "52 años", "Mexicana", "1487598427", "TRC301265HDF02", "22 años", "Dirección", "Completa");
    //Imprime a la persona a la que se está haciendo referencia y posteriormente imprime el método toString
    System.out.println("\n\nADMINISTRATIVO 1...");
    System.out.println(admin1);

    //Métodos de la interfaz implementados por la clase Alumno a través de sus instancias
    System.out.println("\n\nLos alumnos dicen:");
    alumno1.dormir();
    alumno2.comer();
    alumno3.tomarAgua();
    alumno1.respirar();

    //Métodos de la interfaz implementados por la clase Trabajador a través de sus instancias en las clases Profesor y Administrativo
    System.out.println("\n\nLos trabajadores dicen:");
    profesor1.dormir();
    profesor2.comer();
    admin1.tomarAgua();
    profesor1.respirar();
  }
}
