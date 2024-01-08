package com.study.ch08.book;

public class BookeRepository {

    final Book[] books;

    BookeRepository(Book[] books) {

        this.books = books;

    }

    int getEmptyCount() {
        int emptyCount = 0;
        for (int i = 0; i <books.length; i++) {
            if(books[i] == null) {
                emptyCount++;
            }
    }
        return emptyCount;
    }


int getEmptyIndex() {
     for(int i = 0; i < books.length; i++) {
         if(books[i] == null) {
             return i;
         }
   }
    return  -1;
}
void insert(Book book) {
        books[getEmptyIndex()] = book;

}

Book[] getBookDatas() {
        int bookCount = 0;
        for (int i = 0; i < books.length; i++) {
            bookCount++;
            {
        }
    }

        Book[] newBooks = new Book[bookCount];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                newBooks[j] = books[j];
                j++;
            }


        }

        return newBooks;

        }
}