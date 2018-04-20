public class Main {
  public static void main(String[] args) {
    Diego diego = new Diego();
    Felipe felipe = new Felipe();
    Luis luis = new Luis();

    System.out.println("Qué piensa Diego cuando va a:");
    System.out.println("  - Estudiar..." + diego.estudiar());
    System.out.println("  - Dormir..." + diego.dormir());
    System.out.println("  - Comer..." + diego.comer());
    System.out.println("  - Ir a la escuela..." + diego.irALaEscuela());
    System.out.println("  - Hacer tarea..." + diego.hacerTarea());
    System.out.println("  - Presentar un examen..." + diego.presentarExamen());
    System.out.println("  - Regresar a casa..." + diego.regresarACasa() + "\n\n");

    System.out.println("Qué piensa Felipe cuando va a:");
    System.out.println("  - Estudiar..." + felipe.estudiar());
    System.out.println("  - Dormir..." + felipe.dormir());
    System.out.println("  - Comer..." + felipe.comer());
    System.out.println("  - Ir a la escuela..." + felipe.irALaEscuela());
    System.out.println("  - Hacer tarea..." + felipe.hacerTarea());
    System.out.println("  - Presentar un examen..." + felipe.presentarExamen());
    System.out.println("  - Regresar a casa..." + felipe.regresarACasa() + "\n\n");

    System.out.println("Qué piensa Luis cuando va a:");
    System.out.println("  - Estudiar..." + luis.estudiar());
    System.out.println("  - Dormir..." + luis.dormir());
    System.out.println("  - Comer..." + luis.comer());
    System.out.println("  - Ir a la escuela..." + luis.irALaEscuela());
    System.out.println("  - Hacer tarea..." + luis.hacerTarea());
    System.out.println("  - Presentar un examen..." + luis.presentarExamen());
    System.out.println("  - Regresar a casa..." + luis.regresarACasa());
  }
}
