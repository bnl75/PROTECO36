#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {

srand(time(NULL));
int aleatorio = rand();
FILE *archivo;
archivo = fopen ("numeros","w");
for (int i = 0; i < 1000; i++) {

  fprintf(archivo, "%d ,",rand()%1000 );

}
  fclose(archivo);
  return 0;
}
