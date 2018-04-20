/*
   Programa que calcula el número pi.
   Alumno: Bernal Sánchez Diego Arturo
   Prebe 12
   17/02/18
*/
#include <stdio.h>

int main() {

  int eContador1, eContador2 = 0;
  float pi = 0;

  for (eContador1 = 1; eContador1 <= 1000005; eContador1 += 2) {

    if (eContador1 == 1 || eContador2 == 4) {

      pi = pi + (4/(float)eContador1);

      eContador2 = 2;

    }

    else {

      pi = pi - (4/(float)eContador1);

      eContador2 += 2;

    }

  }

  printf("El valor de pi es: %f\n", pi);
  getchar();
  return 0;

}
