package pe.edu.upeu.reforzamiento;

import java.io.IOException;

/**
 * Hello world!
 *
 */
import javax.swing.*;
import java.awt.*;
public class App {
    static JFrame freme;




    public static void main( String[] args ) throws IOException {
       /* System.out.println( "Hello World!" );

        freme=new JFrame("Sistema-Ciclo1-GA");
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        freme.setSize(new Dimension(screenSize.width,screenSize.height));

        freme.setVisible(true);*/
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

    }
}
