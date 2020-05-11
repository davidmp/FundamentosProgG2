#include <iostream>

void suma10Numeros(void){
  int contador=1;
  float valor_num, suma_numeros=0;
  while(contador<=10){
    printf("Ingrese valor numerico de la posicion %i :", contador);
    scanf("%f",&valor_num);
    suma_numeros=suma_numeros+valor_num;
    contador=contador+1;
  }
  printf("La suma de los 10 numeros es: %.2lf", suma_numeros);
}

int main()
{
    printf("Hola Mundo\n");
    suma10Numeros();

    return 0;
}