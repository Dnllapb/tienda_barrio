package org.example.Administracion;

import org.example.Compra.Compra;
import org.example.Interfaces.AdministracionI;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Administracion implements AdministracionI {

    Scanner scanner = new Scanner(System.in);
    private List <Producto> productoList = new ArrayList<>();
    private List <Compra> compraList = new ArrayList<>();
    private List <Venta> ventaList = new ArrayList<>();


    public Producto crearProducto(Administracion administracion)
    {
        //REGISTRAR NUEVO PRODUCTO
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO : ");
        String codigoProducto = scanner.nextLine();


        System.out.println("INGRESA EL NOMBRE DEL PRODUCTO: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("INGRESA  LA MARCA DEL PRODUCTO: ");
        String marcaProducto =  scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE EMPAQUE DEL PRODUCTO: ");
        String tipoEmpaque = scanner.nextLine();

        System.out.println("INGRESA LA MEDIDA DEL PRODUCTO: ");
        Double medidaProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE MEDIDA DEL PRODUCTO: ");
        String tipoMedidaProducto = scanner.nextLine();

        System.out.println("INGRESA LA ETIQUETA DEL PRODUCTO: ");
        String etiquetaProducto=  scanner.nextLine();

        System.out.println("INGRESA  LA CATEGORIA DEL PRODUCTO : ");
        String  categoriaProducto =  scanner.nextLine();

        Double cantidadProducto = 0.0;
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());
        return producto;

    }
    public void agregarProducto(Producto producto){
        if (!productoList.contains(producto)) {
            productoList.add(producto);
        }
    }
    public Optional<Producto> buscarProducto(String codigoProducto){
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto()!= null && producto.getCodigoProducto().equals(codigoProducto))
                .findAny();
    }

    public Optional<Producto>  consultarProducto(Administracion administracion)
    {

        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto );
        if (productoOptional.isPresent()) {
            System.out.println(productoOptional.get());
        } else {
            System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }
        return productoOptional;
    }

    public Optional<Producto> modificarProducto(Administracion administracion)
    {
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoEncontrado = administracion.buscarProducto(codigoProducto);

        if (productoEncontrado.isPresent()) {
            System.out.println("Seleccione el campo del producto que desee modificar: ");
            System.out.println("1. Nombre del Producto");
            System.out.println("2. Marca del Producto");
            System.out.println("3. Tipo de Empaque");
            System.out.println("4. Medida");
            System.out.println("5. Tipo de medida");
            System.out.println("6. Etiqueta Producto");
            System.out.println("7. Categoria Producto");
            System.out.println("8. Cantidad");

            String opcion = scanner.nextLine();
            String nuevoValor = scanner.nextLine();
            Optional<Producto> productoModificado = administracion.modificarProducto(
                    codigoProducto,
                    opcion,
                    nuevoValor
            );
            if (productoModificado.isPresent()) {
                System.out.println("Producto modificado exitosamente.");
                System.out.println(" ");
            } else {
                System.out.println("No se pudo modificar el producto.");
                System.out.println(" ");
            }
        } else {
            System.out.println("Producto no encontrado.");
            System.out.println(" ");
        }

        return  productoEncontrado;
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


    public Compra agregarCompra(Administracion administracion) {
        //REGISTRAR NUEVA COMPRA DE PRODUCTO
        Compra compra = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("INGRESA EL NIT DEL PROVEEDOR : ");
            int nitProveedor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR: ");
            String nombreProveedor = scanner.next();
            scanner.nextLine();
            System.out.println("INGRESA EL CODIGO DEL PRODUCTO A COMPRAR: ");
            String codigoProducto = scanner.next();
            scanner.nextLine();

            Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto);
            if (productoOptional.isPresent()) {
                Producto productosCompra = productoOptional.get();
                System.out.println(productosCompra.getNombreProducto());
                System.out.println("INGRESA EL VALOR UNITARIO DEl PRODUCTO: ");
                Double valorUnitario = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("INGRESA LA CANTIDAD A COMPRAR : ");
                int cantidadProducto = scanner.nextInt();
                scanner.nextLine();
                productosCompra.setCantidadProducto(productosCompra.getCantidadProducto() + cantidadProducto);
                double valorTotal = valorUnitario * cantidadProducto;

                compra = new Compra(nombreProveedor, valorUnitario, valorTotal, cantidadProducto, nitProveedor, Optional.of(productosCompra));
                administracion.agregarCompra(compra);
                System.out.println(compra.toString());


            } else {
                System.out.println("Producto con eL ID: " + codigoProducto + " no encontrado");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return compra;

    }
    public void agregarCompra(Compra compra)
    {
        if (!compraList.contains(compra)) {
            compraList.add(compra);
        }
    }


    public Optional<Compra> buscarCompra(Administracion administracion){

        System.out.println("INGRESA EL CODIGO DE LA COMPRA A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoCompra = scanner.next();
        scanner.nextLine();

        Optional<Compra> compraOptional = administracion.buscarCompra(codigoCompra);
        if (compraOptional.isPresent()) {
            System.out.println(compraOptional.get());
        } else {
            System.out.println("Compra con eL ID: " + compraOptional  + " no encontrado");
        }
        return  compraOptional;
    }

    public Optional<Compra> buscarCompra(String codigoCompra){
        return compraList.stream()
                .filter(compra -> compra.getIdCompra().equals(codigoCompra))
                .findAny();
    }

    public Optional<Compra> modificarCompra(String codigoCompra,int  opcion, String nuevoValor) {

        return compraList.stream()
                .filter(compra -> compra.getIdCompra().equals(codigoCompra))
                .findFirst()
                .map(compraEncontrada -> {

                    switch (opcion) {
                        case 1:
                            System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR");
                            compraEncontrada.setNombreProveedor(nuevoValor);
                            break;
                        case 2:
                            compraEncontrada.setNitProveedor(Integer.parseInt(nuevoValor));
                            break;
                        case 3:
                            System.out.println("Eliminar el ID del producto actual.");
                            // Actualiza la cantidad del producto original
                            Producto producto = compraEncontrada.getProductoOptional().orElse(null);
                            if (producto != null) {
                                producto.setCantidadProducto(producto.getCantidadProducto() - compraEncontrada.getCantidadProducto());
                            }
                            compraEncontrada.setProductoOptional(null); // Establecer como null

                            System.out.println("Ingresa el codigo del producto: ");
                            String nuevoCodigoProducto  = scanner.nextLine();

                            Optional<Producto> productoNuevoOptional = buscarProducto(nuevoCodigoProducto );
                            if ( productoNuevoOptional.isPresent() ) {
                                //System.out.println( productoNuevoOptional.get().getNombreProducto());
                                Producto productoNuevo = productoNuevoOptional.get();
                                compraEncontrada.setProductoOptional(Optional.of(productoNuevo));
                                System.out.println(productoNuevo);


                                System.out.println("POR FAVOR INGRESA LA CANTIDAD ");
                                Double nuevaCantidad = scanner.nextDouble();
                                scanner.nextLine();
                                compraEncontrada.setCantidadProducto(nuevaCantidad);

                                System.out.println("POR FAVOR INGRESA EL PRECIO UNITARIO");
                                Double nuevoPrecio = scanner.nextDouble();
                                scanner.nextLine();
                                compraEncontrada.setValorUnitario(nuevoPrecio);
                                double valorTotal = nuevoPrecio * nuevaCantidad;
                                compraEncontrada.setValorTotal(valorTotal);
                            } else {
                                System.out.println("Producto con el ID: " + nuevoCodigoProducto + " no encontrado");
                            }
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(compraEncontrada);
                })
                .orElse(Optional.empty());
    }
}