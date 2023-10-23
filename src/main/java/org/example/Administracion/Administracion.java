package org.example.Administracion;

import org.example.Compra.Compra;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Administracion {

    private List <Producto> productoList = new ArrayList<>();
    private List <Compra> compraList = new ArrayList<>();
    private List <Venta> ventaList = new ArrayList<>();

    public void agregarProducto(Producto producto){
        if (!productoList.contains(producto)) {
            productoList.add(producto);
        }
    }

    public Optional<Producto> buscarProducto(String codigoProducto){
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findAny();
    }

    public Optional<Producto> modificarProducto(String codigoProducto,String nombreProducto, String marcaProducto,String tipoEmpaque,
                                                Double medidaProducto,String tipoMedidaProducto,String etiquetaProducto,String categoriaProducto,
                                                Double cantidadProducto){
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findFirst()
                .map(productoEncontrado -> {
                    productoEncontrado.setNombreProducto(nombreProducto);
                    productoEncontrado.setMarcaProducto(marcaProducto);
                    productoEncontrado.setTipoEmpaque(tipoEmpaque);
                    productoEncontrado.setMedidaProducto(medidaProducto);
                    productoEncontrado.setTipoMedidaProducto(tipoMedidaProducto);
                    productoEncontrado.setEtiquetaProducto(etiquetaProducto);
                    productoEncontrado.setCategoriaProducto(categoriaProducto);
                    productoEncontrado.setCantidadProducto(cantidadProducto);
                    return Optional.of(productoEncontrado);
                })
                .orElse(Optional.empty());
    }




}
