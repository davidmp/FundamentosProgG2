#include <iostream>


class EjerciciosCiclicos{
  public:
  void calcularFactorialNum(){
    int numero, contador=1, resultado=1;
    //Datos de entrada
     printf("Ingrese el numero para calcular el Factorial:\n");
     scanf("%i",&numero);
     //proceso
     if(numero>0){
       while(contador<numero){
         contador=contador+1;//contador++
         resultado=resultado*contador;
       }
     }
     //Salida
     printf("El Factorial de %i Es: %i\n", numero,resultado);
  }

  void calcularFactorialNumOpc2(){
    int numero;
    long resultado=1;
    //Datos de entrada
     printf("Ingrese el numero para calcular el Factorial:\n");
     scanf("%i",&numero); 
       while(numero>0){         
         resultado=resultado*(numero);
         numero--;
       }
     //Salida
     printf("El Factorial Es: %ld\n",resultado); 
  }

};
//g++ DemoC.cpp -o PruebaC
//./PruebaC 
int main() {
  EjerciciosCiclicos obj;
  //obj.calcularFactorialNum();
  obj.calcularFactorialNumOpc2();
return 0; 
}
