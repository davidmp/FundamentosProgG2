package pe.edu.upeu.app;

import pe.edu.upeu.arreglos.PracticasArreglos;
import pe.edu.upeu.dao.AppCrud;
import pe.edu.upeu.dao.PedidosDao;

import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;
import java.io.Console;
/**
 * Hello world!
 *
 */
public class App {

    static LeerTeclado teclado=new LeerTeclado();
    static LeerArchivo leerArc;
    static AppCrud doa=new AppCrud();
    static UtilsX utilx=new UtilsX();



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
        System.out.println( "----------Systema de Menu de opciones---------" ); 
        System.out.println( "*******Formulario de Ingreso a Sistema*******" );         
        Console con = System.console();    


        try {                    
            char opcion='S'; //S=SI, N=NO
            int numAlgoritm=1;  

            String usuario=teclado.leer("", "Ingrese Usuario:");      
            System.out.println("Ingrese su clave: ");   
            char[] password=con.readPassword();   
            if(usuario.equals("davidmp") &&  String.valueOf(password).equals("123456")){  

            do{
                              
                
                    numAlgoritm=teclado.leer(0,
                    "Ingrese el numero de Algoritmo que desea probar: \n"+
                    "1= Entorno Grafico\n"+
                    "2= Practica de Vectores \n"+
                    "3= Cuadrado de 100 primeros numeros positivos\n"+
                    "5= Suma Elementos Vector y Media Artimetica\n"+
                    "6= Matriz Identidad\n"+
                    "7= Agregar Producto\n"+
                    "8= Listar Producto\n"+
                    "9= Registrar Pedido\n"+
                    "10= Reportar Pedidos\n"+
                    "11= Reportar por Fecha\n"+
                    "12= Reportar Rango Fechas\n"+
                    "13= Modificar Producto\n"
                    );    
                
                PracticasArreglos obj=new PracticasArreglos();
                int tamanho;
                PedidosDao pedDao;
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
                    pedDao=new PedidosDao();
                    pedDao.imprimirLista(pedDao.agregarProducto());
                    break;
                    case 8:
                    utilx.clearConsole();
                    leerArc=new LeerArchivo("Productos.txt");
                    doa=new AppCrud();
                    doa.imprimirLista(doa.listarContenido(leerArc));
                    break;
                    case 9:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.registrarPedido();                    
                    break;
                    case 10:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.reportarPedidos();
                    break;
                    case 11:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.reportePedidosdelDia(teclado.leer("", "Ingrese la fecha: (dd-MM-yyyy):"));
                    break; 
                    case 12:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.reportePedidosRangoFecha(
                        teclado.leer("", "Ingrese Fecha Inicio: (dd-MM-yyyy):"),
                        teclado.leer("", "Ingrese Fecha Fin: (dd-MM-yyyy):")
                        );
                    break;
                    case 13:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.imprimirLista(pedDao.modificarRegProducto());
                    break;
                    default: System.out.println("La opcion No existe!!"); break;
                    }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
                
            }while(opcion=='S' || opcion=='s'); 
            }else{ System.out.println("Error al ingresar Usuario o Clave... Intente Nuevamente."); }  
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
     
    }

}
