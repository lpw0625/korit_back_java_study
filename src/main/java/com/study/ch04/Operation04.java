package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
        << 연산자 >>

        산술 연산자,비교 연산자, 논리연산자,조건연산자,복합대입연산자


         /*
         논리 연산자

         &&(곱) - AND 모든 조건이 충족되어야 한다.
         || - or
         !(부정) - NOT
         true(1)

         false(0)

         true && false >> false
         true && true >> true // 모든 조건이 true 충족되어야 한다.
         true || false >> true // 모든 조건에서 하나라도 충족되면은 true
         false || false >> false
         0이 아니면 무조건 true
        !false >> true
         */




        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0) ;
        System.out.println(505 % 5 == 0 || 505 % 50 == 0) ;
        System.out.println(!(505 % 5 == 0 || 505 % 50 == 0));
        int age = 30;
        // System.out.println(40 > age && age > 20); // 잘못된 표기법. 비교대상이 앞으로 간다.
        System.out.println(age < 40 && age > 20 && age != 30);


    }
}
