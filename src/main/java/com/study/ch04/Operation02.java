package com.study.ch04;

public class Operation02 {
    public static void main(String[] args) {
        /*
        << 연산자 >>

        산술 연산자,비교 연산자, 논리연산자,조건연산자,복합대입연산자


         */
        System.out.println(true);
        System.out.println(false); // true,false 자체가 값이라서 ""를 안씀.

        boolean flag = 10 > 2;

        System.out.println("비교연산자");
        System.out.println(">" + flag);
        System.out.println("<" + (10 > 2));
        System.out.println(">=" + (10 >= 10)); // 시작점이 1부터 시작할때
        System.out.println("<=" + (10 <= 2));
        System.out.println("==" + (10 == 2));
        System.out.println("!=" + (10 != 2));
        System.out.println();

       // i < 5 // 횟수로 쓰인다.(0,1,2,3,4)
        // 프로그램에선 값이 같다고 표현을 할때는 '=='라고 쓰인다.
        // '!=' 는 다르면 참이라는 뜻.

    }
}
