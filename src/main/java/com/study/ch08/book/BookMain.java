package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selcetedMenu = "null";
        boolean loopflag = true;

        // 책의 정보를 입력 하기 위한 출력문


        Book[] books = new Book[3];
        BookeRepository bookRepository = new BookeRepository(books);
        BookService bookService = new BookService(bookRepository);


        while (loopflag) {
            System.out.println("[[서재 관리 프로그램]] ");
            System.out.println("1. 서재 등록 ");
            System.out.println("2. 서재 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println(" <<< 메뉴 선택 >>> ");
            selcetedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selcetedMenu)) {
                System.out.println("프로그램  종료중,....");
                loopflag = false;
            } else if ("1".equals(selcetedMenu)) {
                System.out.println("<<< 서재 등록 페이지 >>>");

                String name = null;
                String category = null;
                String writer = null;
                String code = null;

                if (bookService.isFull()) {
                    System.out.println(" 더이상 등록을 할 수 없습니다.");
                    continue;
                }

                System.out.println("서재 이름 : ");
                name = scanner.nextLine();
                System.out.println("카테고리 : ");
                category = scanner.nextLine();
                System.out.println("저자 : ");
                writer = scanner.nextLine();
                System.out.println("코드번호 : ");
                code = scanner.nextLine();

                Book book = new Book(name, category, writer, code);

                bookService.append(book);


            } else if ("2".equals(selcetedMenu)) {
                System.out.println("<<<< 서재 조회 페이지 >>>> ");
                bookService.PrintbookList();


            } else {
                System.out.println("다시 입력해 주세요");
            }




        System.out.println("프로그램이 종료되었습니다,");

    }


    }
}
