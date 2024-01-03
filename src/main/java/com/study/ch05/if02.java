package com.study.ch05;

public class if02 {
    public static void main(String[] args) {
        int x = -1;
        int y = -2;

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