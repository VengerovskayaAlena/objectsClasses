package com.company;

public class Book {
    private String title;
    private Author author;
    private int age;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book(String title, Author author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }
}
