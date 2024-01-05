package com.study.ch07.member;

import java.util.Scanner;

public class Membermain { //menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null; // selectedMenu 의 주소값을 담고 있다.

        while (true) {
            System.out.println("[[ 회원 관리 프로그램 ]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            MemberService memberService = new MemberService();

            if ("1".equals(selectedMenu)) { // 문자열 값자체가 객체이므로 '.'을 찍을 수 있다.
                boolean responseData = memberService.addMember();
                if(responseData) {
                    System.out.println("<< 등록 완료 >>"); // 정상적으로 true가 뜨면 등록 완료

                } else {
                    System.out.println(" << 등록 취소 >>"); // false이면 취소,
                }


            } else if ("q".equals(selectedMenu) || "Q".equals(selectedMenu)) { // 대문자와 소문자들을 각각 구분해야한다.
                break;

            } else {

                System.out.println("다시 선택하세요");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("<<<<<< 프로그램 종료 >>>>>>> ");
    }
}



