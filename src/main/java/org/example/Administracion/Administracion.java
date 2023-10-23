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

    public Optional<Producto> modificarProducto(String codigoProducto, String opcion, String nuevoValor) {
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findFirst()
                .map(productoEncontrado -> {
                    switch (opcion) {
                        case "1":
                            productoEncontrado.setNombreProducto(nuevoValor);
                            break;
                        case "2":
                            productoEncontrado.setMarcaProducto(nuevoValor);
                            break;
                        case "3":
                            productoEncontrado.setTipoEmpaque(nuevoValor);
                            break;
                        case "4":
                            productoEncontrado.setMedidaProducto(Double.valueOf(nuevoValor));
                            break;
                        case "5":
                            productoEncontrado.setTipoMedidaProducto(nuevoValor);
                            break;
                        case "6":
                            productoEncontrado.setEtiquetaProducto(nuevoValor);
                            break;
                        case "7":
                            productoEncontrado.setCategoriaProducto(nuevoValor);
                            break;
                        case "8":
                            productoEncontrado.setCantidadProducto(Double.valueOf(nuevoValor));
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(productoEncontrado);
                })
                .orElse(Optional.empty());
    }




}
