package com.bookstore.model;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product{name='" + this.getName() + "', price=" + this.getPrice() + "}";
    }
}
