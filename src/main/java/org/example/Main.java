package org.example;
import org.example.Administracion.Administracion;
import org.example.Compra.Compra;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Administracion administracion = new Administracion();
        Compra compra = new Compra();
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
                    administracion.buscarCompra(administracion);
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
    }

    public static void agregarVenta(Administracion administracion){

    }
    public static void modificarVenta(Administracion administracion){

    }
    public static void buscarVenta(Administracion administracion){

    }
    public static int ejecutarMenuPrincipal()
    {
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Modulo Compra                         |");
        System.out.println("2. Modulo Inventario                     |");
        System.out.println("3. Modulo Ventas                         |");
        System.out.println("4. Salir menú                            |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 4)  ");
        Scanner scanner = new Scanner(System.in);
        int opciones =4;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 4 )
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
    public static int ejecutarMenuInventario()
    {
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("±----------------------------------------±");
        System.out.println("|  Inventario                            |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Modificar producto                    |");
        System.out.println("3. Buscar productos                      |");
        System.out.println("4. Regresar al menú principal            |");
        System.out.print("   Ingresa tu opción:    (1 - 3)  ");
        Scanner scanner = new Scanner(System.in);
        int opciones =4;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 4)
            {
                System.out.println("La opcion seleccionada no es válida");
                ejecutarMenuPrincipal();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opcion seleccionada no es válida");
            ejecutarMenuPrincipal();
        }
        return opciones;
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


    public static int ejecutarMenuCompra()
    {
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("±----------------------------------------±");
        System.out.println("|  Compra                           |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar compra                      |");
        System.out.println("2. Modificar compra                    |");
        System.out.println("3. Buscar compra                      |");
        System.out.println("4. Regresar al menú principal            |");
        System.out.print("   Ingresa tu opción:    (1 - 3)  ");
        Scanner scanner = new Scanner(System.in);
        int opciones =4;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 4)
            {
                System.out.println("La opcion seleccionada no es válida");
                ejecutarMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opcion seleccionada no es válida");
            ejecutarMenuPrincipal();
        }
        return opciones;
    }

}