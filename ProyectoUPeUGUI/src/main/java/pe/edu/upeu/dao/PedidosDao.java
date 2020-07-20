package pe.edu.upeu.dao;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.modelo.Pedidos;
import pe.edu.upeu.modelo.Productos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class PedidosDao extends AppCrud{
    LeerArchivo leerArc;
    UtilsX util=new UtilsX();
    Pedidos pedTO;
    LeerTeclado teclado=new LeerTeclado();
    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public String generadorId(LeerArchivo leerArcX, int numColum, String prefijo){
        int idX=1;
        Object[][] data=listarContenido(leerArcX);
        if(data!=null){
            idX=Integer.parseInt(data[data.length-1][numColum].toString().substring(1))+1;
        }
        return prefijo+""+idX;
    }

    public Object[][] agregarProducto(){
        leerArc=new LeerArchivo("Productos.txt");     
        Productos proTO=new Productos();
        proTO=new Productos();
        proTO.setProductoId(teclado.leer("", "Ingrese el Codigo Producto:"));
        proTO.setNombre(teclado.leer("", "Ingrese el nombre producto:"));
        proTO.setPrecioUnit(teclado.leer(0.0, "Ingrese el Precio Unitario:"));           
        return agregarContenido(leerArc, proTO);
    }

    public void imprimirRegistro(Object modelo){
        util.clearConsole();
        System.out.println("*************Registro Reciente***********");
        try {
            Field[] fields = (modelo).getClass().getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName()+"="+field.get(modelo));                
            }          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void registrarPedido(){  
        System.out.println("****************Registrar Nuevo Pedido*************");                  
        leerArc=new LeerArchivo("Productos.txt");         
        Object[][] listaProd=listarContenido(leerArc);
        if(listaProd!=null){
            for(int i=0;i<listaProd.length;i++){
                System.out.print(listaProd[i][0]+"="+listaProd[i][1]+" ("+listaProd[i][2]+"), ");
            }        
        System.out.println("");
        pedTO=new Pedidos();
        leerArc=new LeerArchivo("Pedidos.txt");  
        pedTO.setPedidoId(generadorId(leerArc, 0, "P"));        
        pedTO.setProductoId(teclado.leer("", "Ingrese el Codigo del Producto:"));
        pedTO.setDescripPedido(teclado.leer("", "Ingrese una breve descripcion:"));
        pedTO.setCantidad(teclado.leer(0.0, "Ingrese la cantidad:"));
        leerArc=new LeerArchivo("Productos.txt");   
        listaProd=buscarContenido(leerArc, 0, pedTO.getProductoId());        
        pedTO.setPrecioUnit(Double.parseDouble(listaProd[0][2].toString()));
        pedTO.setFechaPed(formateador.format(new Date()));
        pedTO.setPrecioTotal(pedTO.getCantidad()*pedTO.getPrecioUnit());        
        leerArc=new LeerArchivo("Pedidos.txt");
        imprimirRegistro(pedTO);
        String confirmar=teclado.leer("S", " Desea confirmar el Pedido? S=Si, N=NO");
        if(confirmar.toUpperCase().charAt(0)=='S'){
            agregarContenido(leerArc, pedTO);
            util.clearConsole();
            System.out.println("El Pedido se registro correctamente!!");
        }else{
            confirmar=teclado.leer("S", "Desea nuevamente realizar el Pedio? S=Si, N=NO");
            if(confirmar.toUpperCase().charAt(0)=='S'){
                util.clearConsole();                
                registrarPedido();
            }
        }
        }else{ 
            agregarProducto(); 
            util.clearConsole();
            registrarPedido();
        }        
    }

    public void reportarPedidos(){
        leerArc=new LeerArchivo("Pedidos.txt");
        System.out.println("***************Reporte General de Pedidos*********");
        imprimirLista(listarContenido(leerArc)); 
    }

    public void reportePedidosdelDia(String fecha){
        leerArc=new LeerArchivo("Pedidos.txt");
        System.out.println("***************Reporte-Pedidos del Dia*********");        
        Object [][] data=listarContenido(leerArc);
        int cantidadFilasFI=0;
        for(int fila=0;fila<data.length;fila++){
            String[] vectorFecha=data[fila][1].toString().split(" ");
            if(vectorFecha[0].equals(fecha)){
                cantidadFilasFI++;
            }
        }
        Object [][] dataDia=new Object[cantidadFilasFI][data[0].length];
        int filaX=0, columnaX=0;
        for(int fila=0;fila<data.length;fila++){
            String[] vectorFecha=data[fila][1].toString().split(" ");
            if(vectorFecha[0].equals(fecha)){
            for(int columna=0;columna<data[0].length;columna++){
                dataDia[filaX][columnaX]=data[fila][columna];
                columnaX++;
                }
            }
            filaX++; columnaX=0;
        }
        imprimirLista(dataDia);        
    }
    
}