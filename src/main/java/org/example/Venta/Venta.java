package org.example.Venta;

public class Venta {

    final String idVenta;
    private Double valorUnitario;
    private Double ivaVenta;
    private Double valorTotal;

    public Venta(String idVenta, Double valorUnitario, Double ivaVenta, Double valorTotal) {
        this.idVenta = idVenta;
        this.valorUnitario = valorUnitario;
        this.ivaVenta = ivaVenta;
        this.valorTotal = valorTotal;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(Double ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta='" + idVenta + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", ivaVenta=" + ivaVenta +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
