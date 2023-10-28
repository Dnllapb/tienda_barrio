package org.example;
import org.example.Administracion.Administracion;
import org.example.Compra.Compra;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.Date;
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
                    administracion.crearProducto(administracion);
                    break;
                case 2 :
                   administracion.modificarProducto(administracion);
                    break;
                case 3 :
                    administracion.consultarProducto(administracion);
                    break;
                case 4 :
                    administracion.agregarCompra(administracion);
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



    public static void modificarCompra(Administracion administracion){
        System.out.println("INGRESA EL CODIGO DE LA COMPRA A MODIFICAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoCompra = scanner.next();
        scanner.nextLine();

        Optional<Compra> compraEncontrada = administracion.buscarCompra(codigoCompra);

        if (compraEncontrada.isPresent()) {
            System.out.println("Seleccione el campo de la compra  que deseas modificar: ");

            System.out.println("1. Nombre del Proveedor");
            System.out.println("2. Nit del Proveedor");
            System.out.println("3. Producto,cantidad, y valor unitario");
            int opcion = scanner.nextInt();
            String nuevoValor = scanner.next();

            Optional<Compra> compraEcontrada = administracion.modificarCompra(codigoCompra ,opcion, nuevoValor);
            if (compraEcontrada.isPresent()) {
                System.out.println("Producto modificado exitosamente.");
                System.out.println(compraEncontrada.get());
            } else {
                System.out.println("No se pudo modificar el producto.");

            }
        } else {
            System.out.println("Producto no encontrado.");
            System.out.println(" ");
        }
/*        Compra compra = new Compra(codigoCompra,opcion,nuevoValor);
        administracion.modificarCompra(compra);
        System.out.println(compra.toString());*/



    }
    public static void buscarCompra(Administracion administracion){

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