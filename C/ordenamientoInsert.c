#include <stdio.h>
#include <stdlib.h>

int main() {

  int eArreglo[20];
  int eCont1, eCont2, eCont3, eCont4, eCont5, ePos, eTotal;

  eTotal = 20;
//LeerArchivo
  FILE *archivo;
  archivo = fopen("numeros","r");

  for (eCont1 = 0; eCont1 < eTotal; eCont1 ++) {
    fscanf(archivo, "%d ,", &eArreglo[eCont1]);
  }
//Fin LeerArchivo

//MostrarArregloDesordenado
  printf("Este es el arreglo \"eArreglo\" desordenado:\n\n");

  for (eCont2 = 0; eCont2 < 20; eCont2 ++) {
    printf("\tElemento [%d]: %d\n", eCont2, eArreglo[eCont2]);
  }


//Fin MostrarArregloDesordenado

  for (eCont3 = 0; eCont3 < eTotal; eCont3 ++) {
    ePos = eArreglo[eCont3];
    eCont4 = eCont3;

    while (eCont4 > 0 && ePos < eArreglo[eCont4 - 1]) {
      eArreglo[eCont4] = eArreglo[eCont4 - 1];
    }
    eArreglo[eCont4] = ePos;
  }


//MostrarArregloOrdenado
    printf("Este es el arreglo \"eArreglo\" ordenado:\n\n");

    for (eCont5 = 0; eCont5 < 20; eCont5 ++) {
      printf("\tElemento [%d]: %d\n", eCont5, eArreglo[eCont5]);
    }
//Fin MostrarArregloOrdenado

  return 0;
}
