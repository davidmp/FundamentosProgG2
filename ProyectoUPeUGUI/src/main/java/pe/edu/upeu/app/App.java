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
                "1=Entorno Grafico\n"+
                "2= Practica de Vectores \n"+
                "3=xxx");                
                switch(numAlgoritm){
                    case 1: 
                    new MainGUI();         
                    break;  
                    case 2:{
                        int[] vectorV;
                        int[] vectorX=new int[3];
                        vectorX[0]=5;
                        vectorX[1]=6;
                        vectorX[2]=8;
                        System.out.println(" vectorX[2]="+vectorX[2]);
                        int[] vectorY={5,6,8,6,7};
                        for(int indice=0;indice<vectorY.length;indice++){
                            System.out.println(" vectorY["+indice+"]="+vectorY[indice]);
                        }
                        System.out.println("Tamanho Vector:"+vectorY.length);
                    }break;
                    default: System.out.println("La opcion No existe!!"); break;
                }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }

    }

}
