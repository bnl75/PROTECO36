/*
Bernal Sánchez Diego Arturo
Prebe 12
Programa que realiza una búsqueda binaria en un arreglo ordenado de forma recursiva.
*/

#include <stdio.h>

#define MAX 10

int busquedaBinaria(int[], int, int, int, int);

int main() {

  int eTotal = MAX;
  int eMenor = 0;
  int eMayor = 9;
  int ePos = -1;
  int eElemento = 50;

  int eArreglo[MAX] = {2,4,6,8,10,12,14,18,20,50};

  busquedaBinaria(eArreglo, eMenor, eMayor, eElemento, eTotal);

  return 0;

}

int busquedaBinaria(int eArreglo[], int eMenor, int eMayor, int eElemento, int eTotal) {

  if (eTotal > 0) {

    if (eMenor > eMayor) {

      printf("El elemnto no esta en el arreglo\n");

    } else {

      int ePos = (eMenor + eMayor) / 2;

      if (eElemento < eArreglo[ePos]) {

        return (busquedaBinaria(eArreglo, eMenor, ePos - 1, eElemento, eTotal));

      } else if (eElemento > eArreglo[ePos]) {

        return (busquedaBinaria(eArreglo, ePos + 1, eMayor, eElemento, eTotal));

      } else {

        return ePos;
      }

      printf("El elemento %d esta en la posicion [%d]\n", eElemento, busquedaBinaria(eArreglo, eMenor, eMayor, eElemento + 1, eTotal));

    }

  } else {

    printf("El arreglo esta vacio\n");

  }

}
