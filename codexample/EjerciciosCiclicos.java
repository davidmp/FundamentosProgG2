import java.util.Scanner;
import java.math.BigInteger;

public class EjerciciosCiclicos{
  static Scanner teclado=new Scanner(System.in);

  public static void calcularFactorialNum(){
    int numero, contador=1;
    BigInteger resultado=BigInteger.valueOf(1);
    //Datos de entrada
    System.out.println("Ingrese el numero para calcular el Factorial:");
    numero=teclado.nextInt();
   //proceso
    if(numero>0){
    while(contador<numero){
              contador++;
              System.out.println("VER:"+resultado);
              resultado=resultado.multiply(BigInteger.valueOf(contador));           
            }
    }
    //Salida
    System.out.println("El Factorial de "+numero+" Es:"+resultado);
  }

  //Ejercicio 4.11
  public static long numFactorial(int numero){//4
      int contador=1;
      long resultado=1;
      if(numero>0){
      while(contador<numero){
                contador++;    //4          
                resultado=resultado*contador; //24          
              }
      }    
      return resultado;
  }

  public static void calcularFuncionExponencial(){
    int numeroX;
    double resultadoFE=1;
    //Datos de Entrada
    System.out.println("Ingrese el Numero X de FE:");
    numeroX=teclado.nextInt();
    for(int contador=1;contador<=numeroX;contador++){
      resultadoFE+=Math.pow(numeroX, contador)/numFactorial(contador);
    }
    System.out.println("La funcion exponencial del numero "+numeroX+" es:"+resultadoFE);
  }



  public static void main(String[] ars){
    System.out.println("Holas");
    //calcularFactorialNum();
    calcularFuncionExponencial();

  }

}