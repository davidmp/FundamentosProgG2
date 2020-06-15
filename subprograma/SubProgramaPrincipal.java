

import java.io.IOException;

import upeu.edu.pe.EjerciciosSubprograma;
import upeu.edu.pe.util.EntradaTeclado;
/*
    //Comandos para ejecutar
    //javac -d build/ upeu\EntradaTeclado.java SubProgramaPrincipal.java
    //javac -d build/ upeu\*.java *.java
    //javac -d build/ upeu\edu\pe\util\*.java upeu\edu\pe\*.java *.java
    //cd build   /cd ..
    //java -cp . SubProgramaPrincipal
    //Empaquetado
    jar cvfm SubPrograma.jar manifest.mf upeu/edu/pe/util/*.class upeu/edu/pe/*.class *.class
    java -jar SubPrograma.jar
*/


public class SubProgramaPrincipal {

    
    public static void main(String[] args) throws IOException {
        try {
            EntradaTeclado teclado=new EntradaTeclado();    
            EjerciciosSubprograma obj=new EjerciciosSubprograma();

            char opcion='S'; //S=SI, N=NO
            String numAlgoritm="01";

            do{            
                numAlgoritm=teclado.leer("",
                "Ingrese el numero de Algoritmo que desea probar: \n01=Calcular Factorial Entre Rango de nuemros\n02=Saludos");

                switch(numAlgoritm){
                    case "01": 
                    int numInit=teclado.leer(0, "Ingrese el valor Inicial:");
                    int numFinal=teclado.leer(0, "Ingrese el valor Final:");
                    obj.factorialRango2Numeros(numInit, numFinal);                
                    break;
                    case "02": 
                    
                    break;
                    default: System.out.println("La opcion No existe!!"); break;
                }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
     

    }
}