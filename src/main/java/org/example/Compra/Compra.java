package org.example.Compra;

import org.example.Producto.Producto;

import java.util.Date;
import java.util.List;

public class Compra {

    private String idCompra;
    private int nitProveedor;
    String nombreProveedor;
    String fechaCompra;
    private Double valorUnitario;
    private Double valorTotal;
    private List<Producto> productosCompra;
    public Compra(String idCompra, String nombreProveedor, String fechaCompra, Double valorUnitario, Double valorTotal, Integer nitProveedor) {
        this.idCompra = idCompra;
        this.nombreProveedor = nombreProveedor;
        this.fechaCompra = fechaCompra;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.nitProveedor = nitProveedor;

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

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public void setProductosCompra(List<Producto> productosCompra) {
        this.productosCompra = productosCompra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra='" + idCompra + '\'' +
                ", nitProveedor=" + nitProveedor +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", productosCompra=" + productosCompra +
                '}';
    }
}
