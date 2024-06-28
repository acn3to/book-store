package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Book", 120.0);
        Book book = new Book("Dune", 159.90, "Frank Herbert", 535);

        System.out.println(product);
        System.out.println(book);
    }
}
