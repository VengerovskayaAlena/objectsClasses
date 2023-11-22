package com.company;

public class Main {

    public static Book creatBook(){
        Book book = new Book(title, author, age);
        book.title = title;
        book.author = author;
        book.age = age;
        return book;
    }

    public static Author creatAuthor(){
        Author author = new Author(name, surname);
        author.name = name;
        author.surname = surname;
        return author;
    }

    public static void main(String[] args) {
        Author author1 = creatAuthor("Maxim", "Gorky");

        Author author2 = creatAuthor("Lucy", "Montgomery");

        Book book1 = creatBook("At the bottom", author1, 1902);

        Book book2 = creatBook("Ann of Green Gables", author2, 1908);

        book1.setAge(2000);
}}
