

import upeu.edu.pe.EjerciciosSubprograma;
import upeu.edu.pe.util.EntradaTeclado;
public class SubProgramaPrincipal {
    //Comandos para ejecutar
    //javac -d build/ upeu\EntradaTeclado.java SubProgramaPrincipal.java
    //javac -d build/ upeu\*.java *.java
    //javac -d build/ upeu\edu\pe\util\*.java upeu\edu\pe\*.java *.java
    //cd build   /cd ..
    //java -cp . SubProgramaPrincipal
    
    public static void main(String[] args) {
        System.out.println("Saludos!!");
        EntradaTeclado teclado=new EntradaTeclado();    
        EjerciciosSubprograma obj=new EjerciciosSubprograma();
        int numInit=teclado.leer(0, "Ingrese el valor Inicial:");
        int numFinal=teclado.leer(0, "Ingrese el valor Final:");
        obj.factorialRango2Numeros(numInit, numFinal);
    }
}