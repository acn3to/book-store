package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import com.bookstore.util.BookPrinter;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        BookPrinter bookPrinter = new BookPrinter(bookService);

        Book book1 = new Book("Dune", 159.90, "Frank Herbert", 535);
        Book book2 = new Book("Berserk Deluxe Volume 1", 343.50, "Kentato Miura", 535);
        Book book3 = new Book("The Lord of the Rings Deluxe Edition", 201.90, "J. R. R. Tolkien", 1216);
        Book book4 = new Book("Harry Potter and the Prisoner of Azkaban", 199.90, "J.K. Rowling", 475);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);

        bookPrinter.printAllBooks();
    }
}
