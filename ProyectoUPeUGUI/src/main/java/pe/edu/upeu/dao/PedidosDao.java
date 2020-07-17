package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.modelo.Pedidos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

public class PedidosDao extends AppCrud{
    LeerArchivo leerArc;
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

    public Object[][] registrarPedido(){  
        System.out.println("****************Registrar Nuevo Pedido*************");                  
        leerArc=new LeerArchivo("Productos.txt");         
        Object[][] listaProd=listarContenido(leerArc);
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
        return agregarContenido(leerArc, pedTO);
    }

    public void reportarPedidos(){
        leerArc=new LeerArchivo("Pedidos.txt");
        imprimirLista(listarContenido(leerArc)); 
    }

    
}