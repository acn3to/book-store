package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        Book book1 = new Book("Dune", 159.90, "Frank Herbert", 535);
        Book book2 = new Book("Berserk Deluxe Volume 1 ", 343.50, "Kentato Miura", 535);

        bookService.addBook(book1);
        bookService.addBook(book2);

        for (Book book : bookService.getAllBooks()) {
            System.out.println(book.toString());
        }
    }
}
