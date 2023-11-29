package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Maxim", "Gorky");
        Book book1 = new Book("At the bottom", author1, 1902);
        System.out.println("Книга 1:" + book1);


        Author author2 = new Author("Lucy", "Montgomery");
        Book book2 = new Book("Ann of Green Gables", author2, 1908);
        System.out.println("Книга 2:" + book2);



        Author author3 = new Author("Lucy", "Montgomery");
        Book book3 = new Book("Ann of Green Gables", author2, 1908);
        System.out.println("Книга 3:" + book3);


        book1.setAge(2000);

        if (book3.equals(book2)){
                System.out.println("Книги одинаковые");
        } else{
                System.out.println("Книги разные");
        }

        if(book2.hashCode() == book1.hashCode()){
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

}
}