package com.bookstore.model;

public class Book extends Product {
    private String author;
    private int pages;

    public Book(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", author='" + this.getAuthor() + '\'' +
                ", pages=" + this.getPages() +
                '}';
    }
}
