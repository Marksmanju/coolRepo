package org.example;

public class Product {
    private int id;
    private String name;
    private String label;
    private double price;

    public Product(int id, String name, double price) {
        this.price  = price;
        this.id     = id;
        this.name   = name;
        this.label  = null;
    }

    public Product(int id, String name, String label, double price) {
        this.price  = price;
        this.id     = id;
        this.name   = name;
        this.label  = label;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
