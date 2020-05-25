package ejemplojavapython;
import java.util.Scanner;

class RepasoExamen{
static Scanner teclado=new Scanner(System.in);

// El algoritmo Permite identificar el Tipo de vacuna que se debe aplicar a una persona
public static void tipoVacuna01DMP(){
    String sexo, tipoVacuna;
    int edad;
    //Datos de entrada
    System.out.print("Ingrese la Edad de Persona:");
    edad=teclado.nextInt();
    System.out.print("Ingrese el Sexo de la Persona:");
    sexo=teclado.next();
    //Proceso 
    if(edad<16){
        tipoVacuna="Aplicar Vacuna Tipo A";
    }else if(edad>=16 && edad<=69){
        if(sexo.equals("M")){
        tipoVacuna="Aplicar Vacuna Tipo B";
        }else{
        tipoVacuna="Aplicar Vacuna Tipo A";
        }
    }else{
        tipoVacuna="Aplicar Vacuna Tipo C";
    }
    //Datos de Salida
    System.out.println(tipoVacuna);
}


public static void pregunta02DMP(){
 System.out.println("Saludos");  
}


public static void main(String[] arg){
    System.out.println("Holas");
    //tipoVacunaDMP();
    //pregunta02DMP();
    char opcion='S'; //S=SI, N=NO
    String numAlgoritm="01";

    do{
        System.out.println("Ingrese el numero de Algoritmo que desea probar: \n 01=Tipo Vacuna\n02=Saludos");
        numAlgoritm=teclado.next();

        switch(numAlgoritm){
            case "01": tipoVacuna01DMP(); break;
            case "02": pregunta02DMP(); break;
            case "03": pregunta02DMP(); break;
            case "04": pregunta02DMP(); break;
            case "05": pregunta02DMP(); break;
            default: System.out.println("La opcion No existe!!");
        }

        System.out.println("Desea Probar mas Algoritmos? S=SI, N=NO");
        opcion=teclado.next().charAt(0);
    }while(opcion=='S');


}
    

}