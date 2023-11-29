 package com.company;

 import java.util.Objects;

 public class Author {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "имя " + name + "; фамилия " + surname;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Author)) return false;
         Author author = (Author) o;
         return getName().equals(author.getName()) &&
                 getSurname().equals(author.getSurname());
     }

     @Override
     public int hashCode() {
         return Objects.hash(getName(), getSurname());
     }
 }
