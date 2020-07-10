package pe.edu.upeu.app;

import pe.edu.upeu.arreglos.PracticasArreglos;
import pe.edu.upeu.dao.AppCrud;
import pe.edu.upeu.modelo.Productos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {

    public static void practicaVectoresBasicos(){
        int[] vectorV;
        vectorV=new int[1];
        vectorV[0]=5;

        int[] vectorX=new int[3];
        vectorX[0]=5;
        vectorX[1]=6;
        vectorX[2]=8;
        System.out.println(" vectorX[2]="+vectorX[2]);
        int[] vectorY={5,6,8,6,7};
        double[] vectorYD={5,6,8.5,6,7};
        for(int indice=0;indice<vectorY.length;indice++){
            System.out.println(" vectorY["+indice+"]="+vectorY[indice]);
        }
        System.out.println("Tamanho Vector:"+vectorY.length);
    }

    public static void main( String[] args ){
        System.out.println( "Systema de Menu de opciones******" );    
        try {
            LeerTeclado teclado=new LeerTeclado();            
            char opcion='S'; //S=SI, N=NO
            int numAlgoritm=1;
            LeerArchivo leerArc=new LeerArchivo("Productos.txt");
            AppCrud doa=new AppCrud();
            Productos proTO=new Productos();
            do{            
                numAlgoritm=teclado.leer(0,
                "Ingrese el numero de Algoritmo que desea probar: \n"+
                "1= Entorno Grafico\n"+
                "2= Practica de Vectores \n"+
                "3= Cuadrado de 100 primeros numeros positivos\n"+
                "5= Suma Elementos Vector y Media Artimetica\n"+
                "6= Matriz Identidad\n"
                );    
                
                PracticasArreglos obj=new PracticasArreglos();
                int tamanho;
                switch(numAlgoritm){
                    case 1: 
                        new MainGUI();         
                    break;  
                    case 2:{
                        practicaVectoresBasicos();                                             
                    }break;
                    case 3:{
                        obj.imprimirVector(obj.cuadrado100PrimerosNum(), -1);
                    }break;
                    case 4:
                    System.out.printf("%n%d elevado a %d es igual a %.3f", 54, 5, 54.6);   
                    break;
                    case 5:
                        //obj.sumaElemMediaArit();
                        tamanho=teclado.leer(0, "Ingrese el Tamanho del Vector:");
                        int[] vector=obj.rellenarValoresVector(tamanho);
                        obj.sumaElemMediaAritD(vector);
                    break; 
                    case 6:
                        tamanho=teclado.leer(0, "Ingrese el Tamanho de la Matriz:");
                        obj.imprimirMatriz(obj.matrizIdentidad(4));
                    break; 

                    case 7:
                        proTO=new Productos();
                        proTO.setProductoId(teclado.leer("", "Ingrese el Codigo Producto:"));
                        proTO.setNombre(teclado.leer("", "Ingrese el nombre producto:"));
                        proTO.setPrecioUnit(teclado.leer(0.0, "Ingrese el Precio Unitario:"));
                        doa=new AppCrud();
                        doa.imprimirLista(doa.agregarContenido(leerArc, proTO));
                    break;
                    case 8:
                    doa=new AppCrud();
                    doa.imprimirLista(doa.listarContenido(leerArc));
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
