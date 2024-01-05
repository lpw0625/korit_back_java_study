package com.study.ch08.member;

import java.util.Scanner;

public class Membermain { //menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        Member[] members = new Member[3];

        String selectedMenu = null; // selectedMenu 의 주소값을 담고 있다.

        while (true) { // 무조건 시작
            System.out.println("[[ 회원 관리 프로그램 ]]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회하기");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();


            if ("1".equals(selectedMenu)) { //
                int emptyCount = 0; // 횟수에 따라
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null) { // 공간이 비어있냐 체크
                        emptyCount++;
                        System.out.println("null맞다" +emptyCount);// 플러스 되기 전의 값은 0
                    }
                }
                if (emptyCount == 0) {
                    System.out.println("등록할 수 없습니다.");
                    continue; // true일때 반복한다.
                                // false 일때 넘어간다 실행이 안되므로
                }

                boolean responseData = memberService.addMember(members); // true or false 값만 나올 수 밖에 옶다.
                                                                        // 메서드도 똑같이 적어야 한다.,
                if (responseData) {
                    System.out.println("<< 등록 완료 >>"); // 정상적으로 true가 뜨면 등록 완료

                } else {
                    System.out.println(" << 등록 취소 >>"); // false이면 취소,
                }


            } else if ("2".equals(selectedMenu)) {
                System.out.println("회원전체 조회");
                for (int i = 0; i < members.length; i++) {
                    if (members[i] == null) {
                        System.out.println("Null");
                        continue;
                    }
                    System.out.println(members[i].toString());

                }

            } else if ("q".equals(selectedMenu) || "Q".equals(selectedMenu)) { // 대문자와 소문자들을 각각 구분해야한다.
                break; //

            } else {

                System.out.println("다시 선택하세요");


                System.out.println();
            }

            System.out.println();
            System.out.println("<<<<<< 프로그램 종료 >>>>>>> ");
        }
    }

}

