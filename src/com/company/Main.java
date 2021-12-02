package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;


class Books {
    Book[] books;

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}

class Book {
    String name;
    Integer pages;
    String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Main {
    static String JSON_TEXT = """
            {
            "books":[
            {
            "name":"Das Capital",
            "pages":1000,
            "author":"Karl Marx"
            },
            {
            "name":"The Financier",
            "pages":500,
            "author":"Theodore Dreiser"
            }
            ]
            }
            """;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        Books books = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(books);
    }
}

