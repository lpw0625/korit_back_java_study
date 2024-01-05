package com.study.ch07.member;

import java.util.Scanner;

public class MemberService {

  // 맴버를 추가하는 기능.

        String inPutValue(String label) {
            Scanner scanner = new Scanner(System.in);

            String value = "null";
            while (true) {
                System.out.print(label + "(입력취소: exit) >>>> ");
                value = scanner.nextLine(); // 빈값이 아니기 전까지 새로운 값을 주입시켜야함.
                if (!value.isBlank()) { // 비어있지 않으면 break. 비었으면 다시 회원코드를 작성.(입력)
                    break;

                }
                System.out.println("다시 입력하세요");
            }
            return value;
        }


        boolean addMember () {

            String code = "null";
            String name = "null";
            String age = "null";
            String address = "null";

            System.out.println(" 회원 등록 >>>> ");

            code = inPutValue("회원코드");
            if ("1".equalsIgnoreCase(code)) {
                return false;
            }
            name = inPutValue("이름");
            if ("exit".equalsIgnoreCase(name)) {
                return false;
            }
            age = inPutValue("나이");
            if ("exit".equalsIgnoreCase(age)) {
                return false;
            }
            address = inPutValue("주소");
            if ("exit".equalsIgnoreCase(address)) {

                return false;
            }

                Member member = new Member(code, name, Integer.parseInt(age), address);

                MemberRepository memberRepository = new MemberRepository();
                return memberRepository.insert(member) > 0; // 등록이 성공됬으면 1. return에 값을 1을 준다.
            }
        }



            // return이 있어야하지만 addMember에서 빠져 나올 수 잇다.




