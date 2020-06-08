

import upeu.EntradaTeclado;
public class SubProgramaPrincipal {
    //Comandos para ejecutar
    //javac -d build/ upeu\EntradaTeclado.java SubProgramaPrincipal.java
    //cd build
    //java -cp . SubProgramaPrincipal

    public static void main(String[] args) {
        System.out.println("Saludos!!");
        EntradaTeclado leer=new EntradaTeclado();

        int a=leer.leer(0, "Ingrese el Primer valor:");
    }
}