#include <stdio.h>
#include <stdlib.h>

int main() {

  int eArreglo[100];
  int eCont1, eCont2, ePos, eTotal,eMenor,ePivote;

  eTotal = 100;

  FILE *archivo;
  archivo = fopen("numeros","r");
  for (eCont1 = 0; eCont1 < eTotal; eCont1 ++) {

    fscanf(archivo, "%d ,", &eArreglo[eCont1]);
  }

  ePos = 0;
  ePivote = eArreglo[0];

  for (eCont1 = 0; eCont1 < eTotal; eCont1 ++) {

    if ()

    while (eArreglo[ePivote] < eArreglo[ePos + 1]) {

        ePos ++
    }

  }


  for (eCont1 = 0; eCont1 < eTotal; eCont1 ++) {

    printf("Arreglo[%d]: %d\n", eCont1, eArreglo[eCont1]);
  }

}
