package com.example.q8big.maksab.DB1;

/**
 * Created by Admin on 4/2/2018.
 */

public class Book {


    private int id;
    private String title;
    private String author;


    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id"+id+ ",title ="+title  + ",author"+author + "]";
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }





}