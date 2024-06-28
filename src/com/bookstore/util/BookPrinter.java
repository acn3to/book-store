package com.bookstore.util;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;

import java.util.List;

public class BookPrinter {
    private final BookService bookService;

    public BookPrinter(BookService bookService) {
        this.bookService = bookService;
    }

    public void printAllBooks() {
        List<Book> books = this.bookService.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
