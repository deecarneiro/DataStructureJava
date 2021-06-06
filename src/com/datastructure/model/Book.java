/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.model;

/**
 *
 * @author deecarneiro
 */
public class Book {

    private String name;
    private String ISBN;
    private String year;
    private String author;

    public Book() {
    }

    public Book(String name, String ISBN, String year, String author) {
        this.name = name;
        this.ISBN = ISBN;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", ISBN=" + ISBN + ", year=" + year + ", author=" + author + '}';
    }
    
    
}
