package com.bookstore;

import com.bookstore.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Book", 120.0);

        System.out.println(product);
    }
}
