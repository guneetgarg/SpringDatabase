package com.db;

public class Book {
    private int id;
    private String title;
    private String author;
    private float price;

    protected Book(String title, String author, float price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public Book() {
    }


    @Override
    public String toString() {
        return "Book [" + getTitle() + ", " + getAuthor() + ", $" + getPrice() + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
