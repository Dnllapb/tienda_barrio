package org.example.Interfaces;

import org.example.Compra.Compra;
import org.example.Producto.Producto;

import java.util.Optional;

public interface AdministracionI {

    void agregarProducto(Producto producto);
    Optional<Producto> buscarProducto(String codigoProducto);
    Optional<Producto> modificarProducto(String codigoProducto, String opcion, String nuevoValor);
    void agregarCompra(Compra compra);
    Optional<Compra> buscarCompra(String codigoCompra);
    Optional<Compra> modificarCompra(String codigoCompra,int  opcion, String nuevoValor);

}
