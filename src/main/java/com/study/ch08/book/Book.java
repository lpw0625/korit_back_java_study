package com.study.ch08.book;

public class Book {

    String name;
    String category;
    String writer;
    String code;

    Book() {


    }

    public Book(String name,String category,String writer,String code) {

        this.name = name;
        this.category = category;
        this.writer = writer;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", writer='" + writer + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}




