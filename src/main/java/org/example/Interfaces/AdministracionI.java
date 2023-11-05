package org.example.Interfaces;

import org.example.Compra.Compra;
import org.example.Producto.Producto;

import java.util.Optional;

public interface AdministracionI {

    void agregarProducto(Producto producto);
    Optional<Producto> buscarProducto(String codigoProducto);
    Optional<Producto> modificarProducto(String codigoProducto, String opcion, String nuevoValor);


}
