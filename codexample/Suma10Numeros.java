package codexample;
import java.util.Scanner;

class Suma10Numeros{
	static Scanner teclado = new Scanner(System.in);
	//javac -d . Suma10Numeros.java
	//java -cp . Suma10Numeros
	
	static void suma10NumerosPara(){
		double valor_num, suma_numeros=0;
		for(int contador=1; contador<=10;contador++){
			System.out.println("Ingrese el Numero de la posicion "+contador+":");
			valor_num=teclado.nextInt();
			suma_numeros=suma_numeros+valor_num;			
		}
		System.out.println("La suma de los 10 números es: "+suma_numeros);
	}
	
	
	public static void main(String[] arg){
		
		int contador=1;
		double valor_num, suma_numeros=0;
		//Datos de entrada y Proceso
		do{
			System.out.println("Ingrese el Numero de la posicion "+contador+":");
			valor_num=teclado.nextInt();
			suma_numeros=suma_numeros+valor_num;
			contador=contador+1;
		}while(contador<=10);
		//Datos de Salida
		System.out.println("La suma de los 10 números es: "+suma_numeros);
		
		suma10NumerosPara();
	}
}