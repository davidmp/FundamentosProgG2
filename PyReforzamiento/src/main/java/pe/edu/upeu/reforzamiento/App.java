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
        System.out.println( "Hello World!" );

        freme=new JFrame("Sistema-Ciclo1-GA");
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        freme.setSize(new Dimension(screenSize.width,screenSize.height));

        freme.setVisible(true);
    }
}
