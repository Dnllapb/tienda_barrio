package org.example;
import org.example.Administracion.Administracion;
import org.example.Compra.Compra;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Administracion administracion = new Administracion();
        int opciones = ejecutarMenu();
        while (opciones != 7){
            switch (opciones) {
                case 1 :
                    crearProducto(administracion);
                    break;
                case 2 :
                    modificarProducto(administracion);
                    break;
                case 3 :
                    consultarProducto(administracion);
                    break;
                case 4 :
                    agregarCompra(administracion);
                    break;
                case 5 :
                    modificarCompra(administracion);
                    break;
                case 6 :
                    buscarCompra(administracion);
                    break;
                case 7 :
                    agregarVenta(administracion);
                case 8 :
                    modificarCompra(administracion);
                    break;
                case 9 :
                    buscarVenta(administracion);
                    break;
                case 10 :
                    System.out.println("Saliendo de menú ");
                    break;
            }
            opciones = ejecutarMenu();
        }
    }
    public static void crearProducto(Administracion administracion)
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

        System.out.println("INGRESA LA CANTIDAD DEL PRODUCTO: ");
        Double cantidadProducto = scanner.nextDouble();
        scanner.nextLine();
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());

    }

    public static void modificarProducto(Administracion administracion)
    {
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto= scanner.next();
        scanner.nextLine();

        int codigoencontrado = codigoProducto.indexOf(codigoProducto);
        int opcionesProducto =0;
        System.out.println("Por favor selecciona que item del producto quieres modificar");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Modificar Producto   |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Nombre producto                       |");
        System.out.println("2. Marca producto                        |");
        System.out.println("3. Tipo de empaque Producto              |");
        System.out.println("4. Medida Producto                       |");
        System.out.println("5. Tipo Medida Producto                  |");
        System.out.println("6. Etiqueta Producto                     |");
        System.out.println("7. Categoria Producto                    |");
        System.out.println("8. Cantidad Producto                     |");
        System.out.println("9. Regresar menú principal               |");

            switch (opcionesProducto)
            {
                case 1:
                    System.out.println("Por favor ingresa el nuevo nombre del  producto");





            }


    }
   /* public static void eliminarProducto( Administracion administracion)
    {
        System.out.println("Para eliminar el producto debe ingresar el codigo ");
        int code = impresion.nextInt();
        posicion = codigo.indexOf(code);
        System.out.println("Se elimino el siguiente producto ");
        System.out.println("codigo    Producto     Unidades    Precio ");
        System.out.println(codigo.get(posicion) + product.get(posicion) +"    "+ cantidad.get(posicion)+"   " + price.get(posicion));
        codigo.remove(posicion);
        product.remove(posicion);
        cantidad.remove(posicion);
        price.remove(posicion);

    }*/
    public static void  consultarProducto(Administracion administracion)
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
    }

    public static void agregarCompra(Administracion administracion){
        //REGISTRAR NUEVA COMPRA DE PRODUCTO
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA  LA FECHA DE LA COMPRA: ");
        String marcaProducto =  scanner.nextLine();
        System.out.println("INGRESA EL CODIGO DE LA COMPRA : ");
        String codigoProducto = scanner.nextLine();
        System.out.println("INGRESA EL NIT DEL PROVEEDOR : ");
        String nitProveedor = scanner.nextLine();

        System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR: ");
        String nombreProducto = scanner.nextLine();
        
        System.out.println("INGRESA EL VALOR UNITARIO DE LA COMPRA: ");
        String tipoEmpaque = scanner.nextLine();

        scanner.nextLine();
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());

    }
    public static void modificarCompra(Administracion administracion){

    }
    public static void buscarCompra(Administracion administracion){

    }
    public static void agregarVenta(Administracion administracion){

    }
    public static void modificarVenta(Administracion administracion){

    }
    public static void buscarVenta(Administracion administracion){

    }
    public static int ejecutarMenu()
    {
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Modificar producto                    |");
        System.out.println("3. Buscar productos                      |");
        System.out.println("4. Agregar Compra                        |");
        System.out.println("5. Modificar Compra                      |");
        System.out.println("6. Buscar Compra                         |");
        System.out.println("7. Agregar venta                         |");
        System.out.println("8. Buscar venta                          |");
        System.out.println("9. Modificar venta                       |");
        System.out.println("10.Salir menú                            |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 10)  ");

        Scanner scanner = new Scanner(System.in);
        int opciones =10;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 10 )
            {
                System.out.println("La opcion seleccionada no es válida");
                ejecutarMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opcion seleccionada no es válida");
            ejecutarMenu();
        }
        return opciones;
    }
}