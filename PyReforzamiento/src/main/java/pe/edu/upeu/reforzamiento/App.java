package pe.edu.upeu.reforzamiento;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
import javax.swing.*;
import java.awt.*;
public class App {
    static JFrame freme;

    static Scanner leerT=new Scanner(System.in);


    public static void main( String[] args ) throws IOException {
       /* System.out.println( "Hello World!" );

        freme=new JFrame("Sistema-Ciclo1-GA");
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        freme.setSize(new Dimension(screenSize.width,screenSize.height));

        freme.setVisible(true);*/
       
        //Vectores
        JButton[] buttonX=new JButton[6];

        String[] nombreVector;        
        nombreVector=new String[19];
        nombreVector[0]="Alejo Castillo Cristhian Brandonlyn";
        nombreVector[18]="Yepez Heredia Diego Leyter";
        System.out.println("Nombre:"+nombreVector[18]);
        System.out.println("Tamanho v1:"+nombreVector.length);

        String vectorX[]={"Alejo Castillo Cristhian Brandonlyn", "Yepez Heredia Diego Leyter", "Ccoto Cruz Jose Israel"};
        vectorX[1]="Ccori Ccoarite Guver Leon";

        System.out.println("Tamanho v2:"+vectorX.length);
        for(int indice=0;indice<vectorX.length;indice++){
            System.out.println("vectorX["+indice+"]:="+vectorX[indice]);
        }
        
        //Matrices
        String[][] data={
            {"Burgos Pari Diego Armando", ""},
            {"Callata Amones Michael Jordan", ""},
            {"Carlos Yucra Wily Abrahan", ""},
            };

        System.out.println("Tamanho Fila:"+data.length);
        System.out.println("Tamanho Columna:"+data[0].length);

        System.out.println("Llamar Lista");

        for(int indice=0;indice<data.length;indice++){
            System.out.println("Llamando lista a "+data[indice][0]);
            data[indice][1]=leerT.next();
        }

    }
}
