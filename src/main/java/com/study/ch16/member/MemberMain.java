package com.study.ch16.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;

        while (true) {

            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");

            System.out.println("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {


            } else if ("1".equals(selectedMenu)) {

                   /*
                   [회원 등록하기]
                   이름 >. 김준일
                   주소 >> 부산 동래구
                   * << 등록이 완료 되었습니다. >>>
                    */

                String name = null;
                String address = null;
                System.out.println("{회원 등록하기}");
                System.out.println("이름 >> ");
                name = scanner.nextLine();
                System.out.println("주소 >>");
                address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member);
                System.out.println(" <<< 등록이 완료 되었습니다. >>> ");

            } else if ("2".equals(selectedMenu)) {

                    /*
                    [회원 이름 수정하기]
                    수정 할 회원의 이름을 입력하세요 >> 김준일
                    이름 >> 이평원
                    << 수정이 완료되었습니다 >>
                    */

                System.out.println("[회원 이름 수정 하기]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세여");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                }
                System.out.print("이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정이 완료되었습니다. >> ");

            } else if ("3".equals(selectedMenu)) {
                     /*
                    [회원 주소 수정하기]
                    수정 할 회원의 주소를  입력하세요 >> 김준일
                    해당 이름의 회원이 존재하지 않습니다.
                    주소  >>  부산 동래구 사직동
                    << 수정이 완료되었습니다 >>
                    */
                System.out.println("[회원 주소 수정 하기]");
                String searchName = inputSearchName("수정 할 회원의 주소를  입력하세여");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                }
                System.out.print("주소 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정이 완료되었습니다. >> ");

            } else if ("4.".equals(selectedMenu)) {
                 /*
                    [회원 이름으로 조회하기]
                    조회 할 회원의 이름을 입력하세요 >> 김준일
                    이름 >> 이평원
                    Member 객체 toString();
                    << 수정이 완료되었습니다 >>
                    */

                String searchName = null;
                System.out.println("[회원 이름으로 수정하기]");
                searchName = inputSearchName("조회할 회원의 이름을 입력하세요");

                //System.out.println("조회 할 회원의 이름을 입력하세요. >> ");
                //searchName = scanner.nextLine();

                Member findMember = findMemberByName(searchName);

                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println(" << 조회가 왼료되었습니다. >> ");


            } else if ("5".equals(selectedMenu)) {
                     /*
                    [회원 전체 조회하기]
                   MemberList 전체 반복 toString();
                   << 조회가 완료되었습니다 . >>
                    */

                System.out.println("[회원 전체 조회하기]");
                for (Member member : members) {
                    System.out.println(member);

                }


            } else if ("6".equals(selectedMenu)) {
                 /*
                    [회원 이름으로 삭제하기 ]
              삭제 할 회원의 이름을 입력하세요 >> 김준이
              * 이름 >> 이평원
              * << 수정이 완려되었습니다.
                    */

                String searchName = null;
                System.out.println("[회원 이름으로 삭제하기]");
                System.out.println("삭제 할 회원의 이름을 입력하세요. >> ");
                searchName = scanner.nextLine();

                Member findMember = null;
                for (Member member : members) {
                    if (member.getName().equals(searchName)) {
                        findMember = member;
                        break;
                    }
                }
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }

                members.remove(findMember);
                System.out.println(findMember);
                System.out.println(" << 삭제가 왼료되었습니다. >> ");

            } else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();

// 순서 1(등록) >> 5(전체조회) >> 4(부분조회) >> 6(삭제 조회) >> 2 >> 3

        }
    }
}
