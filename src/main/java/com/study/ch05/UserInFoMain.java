package com.study.ch05;

import java.util.Scanner;

public class UserInFoMain {
    public static void main(String[] args) {
        /*
        이름 : 이평원
        나이 : 31
        연락처 01029091213 // 0은 숫자로 안나오기에 문자열로 받을 수 있다.
        학년 : 4
        주소 : 경남 양산시

         */

        // 변수 선언은 위로

       /* Scanner scanner = new Scanner(System.in);

        System.out.print(" 자기소개 ");
        String title = scanner.nextLine();

        System.out.print("이름을 입력하세요 :");
        String name = scanner.next();

        System.out.print("연락처 입력하세요 : ");
        String phonenumber = scanner.next();

        System.out.print("학년 입력하세요 : ");
        int grade = scanner.nextInt();

        System.out.print("주소 입력하세요 :  ");
        String address = scanner.next();

        System.out.println(" : "  + name);
        System.out.println(" : "  + phonenumber);
        System.out.println(" : "  + grade);
        System.out.println(" : "  + address);

        */

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = scanner.next();
        System.out.print("나이: ");
        age = scanner.nextInt();
        System.out.print("연락처: ");
        phone = scanner.next();
        System.out.print("학년: ");
        grade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("학년: " + grade);
        System.out.println("주소: " + address);


    }
}
