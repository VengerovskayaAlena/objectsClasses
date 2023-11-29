package com.company;

import java.util.Objects;

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

    public String toString() {
        return "название " + title + "; год публикации " + age + "; автор " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getAge() == book.getAge() &&
                getTitle().equals(book.getTitle()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getAge());
    }
}
