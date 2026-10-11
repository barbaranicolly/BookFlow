package com.bookflow.bookflowspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;

    public Book(){

    }
    public Book(Long id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Long getId(){
        return id;
}
public void setId(Long id){
        this.id= id;
}
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public boolean hasTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    public void setPrice(double price) {
        this.price = price;
    }
}