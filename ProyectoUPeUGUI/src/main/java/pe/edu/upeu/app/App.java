package pe.edu.upeu.app;

import pe.edu.upeu.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Systema de Menu de opciones******" );    
        try {
            LeerTeclado teclado=new LeerTeclado();            
            char opcion='S'; //S=SI, N=NO
            int numAlgoritm=1;
            do{            
                numAlgoritm=teclado.leer(0,
                "Ingrese el numero de Algoritmo que desea probar: \n"+
                "01=Entorno Grafico\n"+
                "02=xxxx \n"+
                "03=xxx");                
                switch(numAlgoritm){
                    case 1: 
                    new MainGUI();         
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
