package pe.edu.upeu.dao;

import pe.edu.upeu.modelo.Pedidos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

public class PedidosDao extends AppCrud{
    LeerArchivo leerArc;
    Pedidos pedTO;
    LeerTeclado teclado=new LeerTeclado();

    public Object[][] registrarPedido(){                    
        leerArc=new LeerArchivo("Productos.txt");         
        Object[][] listaProd=listarContenido(leerArc);
        for(int i=0;i<listaProd.length;i++){
            System.out.print(listaProd[i][0]+"="+listaProd[i][1]+" ("+listaProd[i][2]+"), ");
        }
        System.out.println("");
        pedTO=new Pedidos();
        pedTO.setProductoId(teclado.leer("", "Ingrese el Codigo del Producto:"));
        pedTO.setDescripPedido(teclado.leer("", "Ingrese una breve descripcion:"));
        pedTO.setCantidad(teclado.leer(0.0, "Ingrese la cantidad:"));
        listaProd=buscarContenido(leerArc, 0, pedTO.getProductoId());
        pedTO.setPrecioUnit(Double.parseDouble(listaProd[0][2].toString()));
        pedTO.setPrecioTotal(pedTO.getCantidad()*pedTO.getPrecioUnit());        
        leerArc=new LeerArchivo("Pedidos.txt");    
        return agregarContenido(leerArc, pedTO);
    }

    public void reportarPedidos(){
        leerArc=new LeerArchivo("Pedidos.txt");
        imprimirLista(listarContenido(leerArc)); 
    }

    
}