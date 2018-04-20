/*
  Bernal Sánchez Diego Arturo
  Prebe 12
  Algoritmo de ordenamiento por inserción.
  16/03/18
*/

#include <stdio.h>
#include <stdlib.h>

int main() {

  int eArreglo[20];
  int eCont1, eCont2, ePos, eAux;

//LeerArchivo
  FILE *archivo;
  archivo = fopen("numeros","r");

  for (eCont1 = 0; eCont1 < 20; eCont1 ++) {
    fscanf(archivo, "%d ,", &eArreglo[eCont1]);
  }
//Fin LeerArchivo

//MostrarArregloDesordenado
  printf("Este es el arreglo \"eArreglo\" desordenado:\n\n");

  for (eCont1 = 0; eCont1 < 20; eCont1 ++) {
    printf("\tElemento [%d]: %d\n", eCont1 + 1, eArreglo[eCont1]);
  }
//Fin MostrarArregloDesordenado

//Ordenar
  for (eCont2 = 0; eCont2 < 20; eCont2 ++) {
    ePos = eCont2;
    eAux = eArreglo[eCont2];

    while ((ePos > 0) && (eAux < eArreglo[ePos - 1])) {
      eArreglo[ePos] = eArreglo[ePos - 1];
      ePos --;
    }

    eArreglo[ePos] = eAux;
  }
//Fin Ordenar

//MostrarArregloOrdenado
    printf("\n\nEste es el arreglo \"eArreglo\" ordenado:\n\n");

    for (eCont1 = 0; eCont1 < 20; eCont1 ++) {
      printf("\tElemento [%d]: %d\n", eCont1 + 1, eArreglo[eCont1]);
    }
//Fin MostrarArregloOrdenado

  printf("Presiona [ENTER] para salir...");
  getchar();
  return 0;
}
