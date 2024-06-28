package com.bookstore.service;

import com.bookstore.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return this.books;
    }
}
