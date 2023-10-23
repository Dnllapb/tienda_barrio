package org.example.Compra;

import java.util.Date;

public class Compra {

    final String idCompra;
    String nombreProveedor;
    Date fechaCompra;
    private Double valorUnitario;
    private Double valorTotal;

    private Integer nitProveedor;
    private Double valorUniCompra;
    private Double valorTotalCompra;

    public Compra(String idCompra, String nombreProveedor, Date fechaCompra, Double valorUnitario, Double valorTotal, Integer nitProveedor, Double valorUniCompra, Double valorTotalCompra) {
        this.idCompra = idCompra;
        this.nombreProveedor = nombreProveedor;
        this.fechaCompra = fechaCompra;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.nitProveedor = nitProveedor;
        this.valorUniCompra = valorUniCompra;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
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

    public Integer getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(Integer nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public Double getValorUniCompra() {
        return valorUniCompra;
    }

    public void setValorUniCompra(Double valorUniCompra) {
        this.valorUniCompra = valorUniCompra;
    }

    public Double getValorTotslCompra() {
        return valorTotslCompra;
    }

    public void setValorTotslCompra(Double valorTotslCompra) {
        this.valorTotslCompra = valorTotslCompra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra='" + idCompra + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", nitProveedor=" + nitProveedor +
                ", valorUniCompra=" + valorUniCompra +
                ", valorTotslCompra=" + valorTotslCompra +
                '}';
    }
}
