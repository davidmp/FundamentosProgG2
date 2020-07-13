package pe.edu.upeu.modelo;

public class Pedidos {
    public String productoId;
    public String descripPedido;
    public double cantidad;
    public double precioUnit;
    public double precioTotal;

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public String getDescripPedido() {
        return descripPedido;
    }

    public void setDescripPedido(String descripPedido) {
        this.descripPedido = descripPedido;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

}