package com.study.ch08.book;

public class BookService {

    BookeRepository bookeRepository;

    BookService (BookeRepository bookeRepository) {
        this.bookeRepository = bookeRepository;
    }

    boolean isFull() {
        return bookeRepository.getEmptyIndex() == -1;
    }


void append(Book book) {
        bookeRepository.insert(book);
}

void PrintbookList() {
        Book[] books = bookeRepository.getBookDatas();
        if(books.length == 0) {
            System.out.println("등록된 서재가 없습니다.");
            return;
        }
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
}

}