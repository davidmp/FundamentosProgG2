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

  public static void main(String[] ars){
    System.out.println("Holas");
    calcularFactorialNum();
  }

}