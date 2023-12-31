package org.example.Producto;

import java.util.*;

public  class Producto  {
    private String codigoProducto ;
    private String nombreProducto;
    private String marcaProducto;
    private String tipoEmpaque;
    private Double medidaProducto;
    private  String tipoMedidaProducto;
    private String etiquetaProducto;
    private String categoriaProducto;
    private int cantidadProducto;
    private  static int contadorID =  0;
    private  double valorUnitario;

    private List<Producto> productoList = new ArrayList<>();

    public  Producto ()
    {

    }


    public Producto(String nombreProducto, String marcaProducto, String tipoEmpaque, Double medidaProducto, String tipoMedidaProducto, String etiquetaProducto, String categoriaProducto, int cantidadProducto) {
        //Metodo principal para crear el producto
        this.codigoProducto = String.valueOf(++contadorID);
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.tipoEmpaque = tipoEmpaque;
        this.medidaProducto = medidaProducto;
        this.tipoMedidaProducto = tipoMedidaProducto;
        this.etiquetaProducto = etiquetaProducto;
        this.categoriaProducto = categoriaProducto;
        this.cantidadProducto = cantidadProducto;


    }
    public  Producto(String codigoProducto,String nombreProducto,int cantidadProducto,Double valorUnitario)
    {   //Metodo constructor para llamar a producto desde compra
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto)
    {this.codigoProducto = codigoProducto;}
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getTipoEmpaque() {
        return tipoEmpaque;
    }

    public void setTipoEmpaque(String tipoEmpaque) {
        this.tipoEmpaque = tipoEmpaque;
    }

    public Double getMedidaProducto() {
        return medidaProducto;
    }

    public void setMedidaProducto(Double medidaProducto) {
        this.medidaProducto = medidaProducto;
    }

    public String getTipoMedidaProducto() {
        return tipoMedidaProducto;
    }

    public void setTipoMedidaProducto(String tipoMedidaProducto) {
        this.tipoMedidaProducto = tipoMedidaProducto;
    }

    public String getEtiquetaProducto() {
        return etiquetaProducto;
    }

    public void setEtiquetaProducto(String etiquetaProducto) {
        this.etiquetaProducto = etiquetaProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int  cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString () {
        return "Producto:" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", marcaProducto='" + marcaProducto + '\'' +
                ", tipoEmpaque='" + tipoEmpaque + '\'' +
                ", medidaProducto=" + medidaProducto +
                ", tipoMedidaProducto='" + tipoMedidaProducto + '\'' +
                ", etiquetaProducto='" + etiquetaProducto + '\'' +
                ", categoriaProducto='" + categoriaProducto + '\'' +
                ", cantidadProducto=" + cantidadProducto +
                ", productoList=" + productoList +
                '}';
    }


}
