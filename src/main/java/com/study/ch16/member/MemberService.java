package com.study.ch16.member;

import java.util.Scanner;

public class MemberService {

    String inPutValue(String label) {
        Scanner scanner = new Scanner(System.in);

        String value = "null";
        while (true) {
            System.out.print(label + "입력취소: exit) >>> ");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }
            System.out.println("다시 입력하세요");
        }
        return value;
    }
boolean addMember () {

    String name = "null";
    String address = "null";

    System.out.println("[회원 등록하기]");

    name = inPutValue("이름");
    if ("1".equalsIgnoreCase(name)) {
        return false;

    }
    address = inPutValue("주소");
    if ("2".equalsIgnoreCase(address)) {

        return false;
    }

    Member member = new Member(name, address);


}
