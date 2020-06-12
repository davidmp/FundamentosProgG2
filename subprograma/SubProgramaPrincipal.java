

import upeu.edu.pe.util.EntradaTeclado;
public class SubProgramaPrincipal {
    //Comandos para ejecutar
    //javac -d build/ upeu\EntradaTeclado.java SubProgramaPrincipal.java
    //javac -d build/ upeu\*.java *.java
    //cd build   /cd ..
    //java -cp . SubProgramaPrincipal
    
    public static void main(String[] args) {
        System.out.println("Saludos!!");
        EntradaTeclado teclado=new EntradaTeclado();

        int a=teclado.leer(0, "Ingrese el Primer valor:");
    }
}