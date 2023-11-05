package org.example.Interfaces;

import org.example.Compra.Compra;

import java.util.Optional;

public interface IAdministracionCompra {
    void agregarCompra(Compra compra);
    Optional<Compra> buscarCompra(String codigoCompra);
    Optional<Compra> modificarCompra(String codigoCompra,int  opcion, String nuevoValor);


}
