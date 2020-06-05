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
  //4.2
  public static void calcularCostoHamburgesa(){
    int nHamburgesas;
    double precioHamburgesa=0;
    double preSumaPago=0;
    String pagoTarjeta="NO";
    for(int tipoHam=1;tipoHam<=3;tipoHam++){
        switch (tipoHam) {
          case 1:System.out.println("Ingrese la Cantidad de Hamburguesas en Simple:"); precioHamburgesa=20; break;  
          case 2:System.out.println("Ingrese la Cantidad de Hamburguesas en Doble:"); precioHamburgesa=25; break;  
          case 3:System.out.println("Ingrese la Cantidad de Hamburguesas en Triple:"); precioHamburgesa=28; break;        
          default: System.out.println("El tipo de Hamburgesas no existe");
            break;
        }
        nHamburgesas=teclado.nextInt();
        preSumaPago+=precioHamburgesa*nHamburgesas;      
    }
    System.out.println("Desea Pagar con Tarjeta?");
    pagoTarjeta=teclado.next();
    if(pagoTarjeta.toUpperCase().equals("SI")){
      preSumaPago=preSumaPago+(preSumaPago*0.05);
    }
    System.out.println("El Costo Total a pagar por las Hamburguesas es:"+preSumaPago);

  }




  public static void main(String[] ars){

    char opcion='S'; //S=SI, N=NO
    String numAlgoritm="01";

    do{
        System.out.println("Ingrese el numero de Algoritmo que desea probar: \n 01=Tipo Vacuna\n02=Saludos");
        numAlgoritm=teclado.next();

        switch(numAlgoritm){
            case "01": calcularFactorialNum(); break;
            case "02": calcularFuncionExponencial(); break;
            case "03": calcularCostoHamburgesa(); break;
            default: System.out.println("La opcion No existe!!");
        }

        System.out.println("Desea Probar mas Algoritmos? S=SI, N=NO");
        opcion=teclado.next().toUpperCase().charAt(0);
    }while(opcion=='S');



  }

}