package ejemplojavapython;
import java.util.Scanner;
public class RepasoExamen2{

   static Scanner teclado=new Scanner(System.in);

    public static void calcularBonoDMP(){
        int puntos;
        double salariominimo, montobono;
        //datos de entrada
        System.out.println("Ingrese el Salario Minimo:");
        salariominimo=teclado.nextDouble();
        System.out.println("Ingrese el Puntaje que ha obtenido el Profesor:");
        puntos=teclado.nextInt();       
        //Proceso
        if(puntos>=0 && puntos<=100){
            montobono=1*salariominimo;
        }else if(puntos>=101 && puntos<=150){
            montobono=2*salariominimo;
        }else{
            montobono=3*salariominimo;
        }
        //Datos de salida
        System.out.println("El monto de bono es:"+montobono);

    }

    public static void main(String [] arg){
        System.out.println("Holas");
        calcularBonoDMP();
    }


}