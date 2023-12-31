package org.example.Compra;

import org.example.Producto.Producto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class Compra {

    private String idCompra;
    private static int contadorId;
    private int nitProveedor;
    private String nombreProveedor;
    private  LocalDateTime fechaCompra ;//Cambio de string por LocalDateTime
    private Double valorUnitario;
    private Double valorTotal;
    private Producto productoComprado;// producto comprar me guarda la clase Producto
    private int cantidadProducto; //atributo de la clase producto

    private Optional<Producto> productoOptional; //Contiene el objeto producto

    private List<Producto> productosCompra;
    public Compra(String nombreProveedor, Double valorUnitario, Double valorTotal, int nitProveedor, int cantidadProducto,Optional<Producto> productoOptional) {
        this.idCompra = String.valueOf(++contadorId);
        this.nombreProveedor = nombreProveedor;
        this.fechaCompra = LocalDateTime.now();//Cambio de string por LocalDateTime
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.nitProveedor = nitProveedor;
        this.productoOptional = productoOptional;
        this.cantidadProducto = cantidadProducto;
    }

    public Compra() {
    }

    public Compra(String nombreProveedor, double valorTotalCompra, int nitProveedor, List<Producto> productosComprados) {
   //constructor para poder agregar mas productos
    }

    public String getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }
    public Integer getNitProveedor() {
        return nitProveedor;
    }
    public void setNitProveedor(Integer nitProveedor) {
        this.nitProveedor = nitProveedor;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public Double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<Producto> getProductosCompra() {
        return productosCompra;
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


   /* public void setProductosCompra(List<Producto> productosCompra) {
        this.productosCompra = productosCompra;
    }

    ////----METODOS DE LA CLASE PRODUCTO--------//////
    public Compra(Producto productoComprado,String nombreProducto, String codigoProducto)
    {//Constructor para poder llamar a la clase producto
        this.productoComprado = productoComprado;

        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;

    }
    public Producto getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(Producto productoComprado) {
        this.productoComprado = productoComprado;
    }



    public void setCantidadProducto(Double cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
*/
    public Optional<Producto> getProductoOptional() {
        return productoOptional;
    }

    public void setProductoOptional(Optional<Producto> productoOptional) {
        this.productoOptional = productoOptional;
    }


    @Override
    public String toString() {

       String informacionProducto = productoOptional.isPresent()   ?
               "Id producto =\n" + this.productoOptional.get().getCodigoProducto() +
                       "Nombre producto = \n" + this.productoOptional.get().getNombreProducto() :
               "Producto no asociado" ;

       return "Compra registrada \n" +
               "Codigo compra =\n'" + idCompra + '\'' +
               ", Nit proveedor= \n" + nitProveedor +
               ", Nombre proveedor=\n'" + nombreProveedor + '\'' +
               ", Fecha compra=\n" + fechaCompra + '\'' +
               informacionProducto +
               "Cantidad productos \n " + cantidadProducto +
               ", valorUnitario= \n" + valorUnitario +
               ", valorTotal=\n" + valorTotal
               ;
   }

/*   @Override
    public String toString() {
        return "Compra{" +
                "idCompra='" + idCompra + '\'' +
                ", nitProveedor=" + nitProveedor +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", productoComprado=" + productoComprado +
                ", cantidadProducto=" + cantidadProducto +
                ", productoOptional=" + productoOptional +
                ", productosCompra=" + productosCompra +
                '}';
    }*/
}
