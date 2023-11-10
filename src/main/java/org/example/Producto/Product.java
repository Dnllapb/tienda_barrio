package org.example.Producto;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String description;
    private String category;
    private String label;
    private double price;
    private String url;

    private Integer code;

    private List<Product> productoList = new ArrayList<>();

    public List<Product> getProductList() {
        return productoList;
    }

    public Product()
    {}


    public Product(Integer code, String name, String description, String category, String label, double price, String url) {
        this.code = code++;
        this.name = name;
        this.description = description;
        this.category = category;
        this.label = label;
        this.price = price;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    //Anulando el to string original y dandole formato a los datos que salgan por consola
    public String toString() {
        return String.format("%-10s|%-60s | %-25s | %-20s | %-20s | %-10.2f | %s", getCode(), getName(), getDescription(), getCategory(), getLabel(), getPrice(), getUrl());
    }
}
