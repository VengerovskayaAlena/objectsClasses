package com.company;

public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Maxim", "Gorky");
        Book book1 = new Book("At the bottom", author1, 1902);
        System.out.println("Книга 1: " + title + author1 + age);


        Author author2 = new Author("Lucy", "Montgomery");
        Book book2 = new Book("Ann of Green Gables", author2, 1908);
        System.out.println("Книга 2: " + title + author2 + age);


        book1.setAge(2000);


}}
