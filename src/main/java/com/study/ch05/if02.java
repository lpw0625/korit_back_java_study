package com.study.ch05;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("x와 y를 입력해주세요(띄어쓰기 구분): ");
        x = scanner.nextInt();
        y = scanner.nextInt();


        if(x == 0 || y == 0) {

            System.out.println("오류 입니다.");
        } else if(x > 0 && y > 0) {
            System.out.println("제 1사분면");

            } else if ( x < 0 && y > 0 ) {
            System.out.println("제 2사분면입니다.");


            } else if(x < 0 && y < 0) {
            System.out.println("제 3사분면입니다.");
            

        } else {
            System.out.println("제 4사분면 입니다.");

        }


    }
}

//println : 표준 출력
//print : 표준 입력