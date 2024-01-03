package com.study.ch05;

import java.util.Scanner; // Scanner를 입력하면 import가 뜬다.

public class Input {
    public static void main(String[] args) {
        // Scanner (입력문 / 자료형이다.)
        // 자료형을 입력 하고 스페이스 하고 난뒤 ctrl + space를 입력하면
        // 자료형의 첫글자가 소문자로 변하며 자동으로 변수를 적어준다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("타이틀 : ");
        String title = scanner.nextLine();


        System.out.print("a ");
        int a =scanner.nextInt(); // 이 한줄이 실행되면 String으로 가져온다. 숫자가 문자로 가져온다.
        System.out.print("b ");                             // nextInt 입력한 값을 int로 가져온다.
        int b = scanner.nextInt();
        System.out.print("c ");
        int c = scanner.nextInt();
        // next는 띄어쓰기가 있으면 입력의 끝으로 인식한다.
        // nextLine을 하면 띄어쓰기로도 압력이 가능.
        // 입력도 버퍼를 쓰고 있고 있기 때문
        // 입력이 되는 순간 출력이 되기 때문
        // 버퍼의 끝을나누는건 엔터로 나눌것이다.
        // 스페이스(띄어쓰기) 는 중간 지점으로 둔다.
        // nextLine도 중간지점으로 여겨진다. 엔터의 입력까지.
        // nextLine은 엔터를먹는다.

        System.out.println(title + ": " + (a + b + c));




    }
}
