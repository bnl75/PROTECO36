/*
Bernal Sánchez Diego Arturo
Prebe 12
Programa que realiza una búsqueda binaria en un arreglo ordenado de forma iterativa.
*/

#include <stdio.h>

#define MAX 10

int main() {

  int eTotal = MAX;
  int eMenor, eMayor, eMedio, eElemento, ePos;
  int eArreglo[MAX] = {2,4,6,8,10,12,14,18,20,50};

  eElemento = 50;

  if (eTotal > 0) {

    eMenor = 1;
    eMayor = eTotal;
    eMedio = eTotal / 2;

    while (eArreglo[eMedio] != eElemento && eMenor <= eMayor) {

      eMedio = (eMenor + eMayor) / 2;

      if (eElemento < eArreglo[eMedio]) {

        eMayor = eMedio - 1;
      }

      else {

        if (eElemento > eArreglo[eMedio]) {

          eMenor = eMedio + 1;

        }

      }

    }



    if (eElemento != eArreglo[eMedio]) {

      printf("El elemnto %d no esta en el arreglo\n", eElemento);

    } else {

      ePos = eMedio;
      printf("El elemnto %d esta en la posicion [%d]\n", eElemento, ePos + 1);

    }

  } else {

    printf("El arreglo esta vacio\n");

  }

return 0;

}
