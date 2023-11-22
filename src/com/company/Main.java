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
        System.out.println("author1.name = " + author1.name);
        System.out.println("author1.surname = " + author1.surname);

        Author author2 = creatAuthor("Lucy", "Montgomery");
        System.out.println("author2.name = " + author2.name);
        System.out.println("author2.surname = " + author2.surname);

        Book book1 = creatBook("At the bottom", author1, 1902);
        System.out.println("book1.title = " + book1.title);
        System.out.println("book1.author = " + book1.author);
        System.out.println("book1.age = " + book1.age);

        Book book2 = creatBook("Ann of Green Gables", author2, 1908);
        System.out.println("book2.title = " + book2.title);
        System.out.println("book2.author = " + book2.author);
        System.out.println("book2.age = " + book2.age);

        book1.setAge(2000);
}}
