package org.example.ProductoService;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.example.Interfaces.IProductService;
import org.example.Producto.Product;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private int code = 1;//autoincrementable

    public void cargarArchivoCSV() {


        //2.Obtener la lista de productos que se encuentra en el objeto product
        Product product = new Product();
        List <Product> productList =product.getProductList();

        try {
            //3.Instanciamos las clases de la libreria en la primera pasamaos la ruta donde tenemos el archivo csv
            FileReader fileReader = new FileReader("C:\\Users\\danie\\OneDrive\\Documents\\tienda_barrio\\resources\\inventory.csv");
            //C:\Users\danie\OneDrive\Documents\tienda_barrio\resources
            //4. La clase CSV Parser se utiliza para analizar un archivo CSV en filas y columnas de datos. Permite leer y procesar los datos del archivo CSV.
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);

            boolean primeraFila = true; // Flag para detectar la primera fila (encabezados)

            for (CSVRecord csvRecord : csvParser) {
                if (primeraFila ) {//NO PERMITE TOMAR LOS ENCABEZADOS DEL EXCEL
                    // Si es la primera fila, omitirla
                    primeraFila  = false;
                    continue;//se utiliza para saltar esa fila y avanzar a la siguiente fila de datos.
                }
                int codigo = Integer.parseInt(csvRecord.get(0));
                String nombre = csvRecord.get(1);
                String descripcion = csvRecord.get(2);
                String categoria = csvRecord.get(3);
                String etiqueta = csvRecord.get(4);
                double precio = Double.parseDouble(csvRecord.get(5));
                String url = csvRecord.get(6);
//                Integer stock = random.nextInt(100);

                Product productAdd = new Product(codigo, nombre, descripcion, categoria, etiqueta, precio, url);
                productList.add(productAdd);
                System.out.println(productAdd.toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}