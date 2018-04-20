import java.util.Scanner;

public class MainPokemon {
  public static boolean p1 = true;
  public static int atac;

  public static void main(String[] args) {

    Pokemon poke1 = new Pokemon();
    Pokemon poke2 = new Pokemon();

    Ataque ataque1 = new Ataque();
    Ataque ataque2 = new Ataque();
    Ataque ataque3 = new Ataque();
    Ataque ataque4 = new Ataque();

    Scanner teclado = new
    Scanner(System.in);

    ataque1.nombre = "Lanzarrocas";
    ataque2.nombre = "Arañazo";
    ataque3.nombre = "Golpe bajo";
    ataque4.nombre = "Corte";

    ataque1.daño = 30;
    ataque2.daño = 23;
    ataque3.daño = 16;
    ataque4.daño = 5;

    System.out.println("BIENVENIDO AL POKÉJUEGO\n\n");
    System.out.println("Ingresa el nombre del primer Pokémon: ");
    poke1.nombre = teclado.nextLine();
    System.out.println("Ingresa el nombre del segundo Pokémon: ");
    poke2.nombre = teclado.nextLine();

    System.out.println("El nombre del Pokémon 1 es: " + poke1.nombre);
    System.out.println("El nombre del Pokémon 2 es: " + poke2.nombre);

    System.out.println("\n\nEstos son los ataques disponibles:\n");
    System.out.println("1) " + ataque1.nombre);
    System.out.println("2) " + ataque2.nombre);
    System.out.println("3) " + ataque3.nombre);
    System.out.println("4) " + ataque4.nombre);

    while ((poke1.vida > 0) && (poke2.vida > 0)) {
      if (p1 == true) {
        System.out.println("\n\nTurno de " + poke1.nombre + " (vida: " + poke1.vida + ")");
        System.out.println("Ingrese el número del ataque: ");
        atac = teclado.nextInt();

        switch (atac) {
          case 1:
            poke2.vida -= ataque1.daño;
            p1 = false;
            break;

          case 2:
            poke2.vida -= ataque2.daño;
            p1 = false;
            break;

          case 3:
            poke2.vida -= ataque3.daño;
            p1 = false;
            break;

          case 4:
            poke2.vida -= ataque4.daño;
            p1 = false;
            break;

          default:
            System.out.println("Opción incorrecta!");
        }

      } else {
        System.out.println("\n\nTurno de " + poke2.nombre + " (vida: " + poke2.vida + ")");
        System.out.println("Ingrese el número del ataque: ");
        atac = teclado.nextInt();

        switch (atac) {
          case 1:
            poke1.vida -= ataque1.daño;
            p1 = true;
            break;

          case 2:
            poke1.vida -= ataque2.daño;
            p1 = true;
            break;

          case 3:
            poke1.vida -= ataque3.daño;
            p1 = true;
            break;

          case 4:
            poke1.vida -= ataque4.daño;
            p1 = true;
            break;

          default:
            System.out.println("Opción incorrecta!");
        }
      }
    }

    if (poke2.vida <= 0 && poke1.vida > 0) {
      System.out.println("\n\nGanó " + poke1.nombre);
    }

    if (poke1.vida <= 0 && poke2.vida > 0) {
      System.out.println("\n\nGanó " + poke2.nombre);
    }
  }
}
