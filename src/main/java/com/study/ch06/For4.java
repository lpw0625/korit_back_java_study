package com.study.ch06;

public class For4 {
    public static void main(String[] args) {

        /*

         *
         **
         ***

         ***
         **
         *

         *
         **
         ***

         ***
         **
         *

         *
         ***
         *****
         */

        //1번째 별
        for (int i = 0; i < 3; i++) { //행
            for (int j = 0; j < i + 1; j++) { // 열
                System.out.print("*");

                // i가 0일 때 j가 1(1행일 때 * 1개)
                // i가 1일 때 j사 2 (2행일 때 * 2개)
                // 지역 안에 또다른 함수를 넣었음으로 2번째 줄에선 j로 변수 선언
            }
            System.out.println(); // 한 줄 출력 후 바꿈
        }

        System.out.println(); // 첫번째 별과 두번째 별 사이의 공백


        //두번째 별
        for (int i = 0; i < 3; i++) { // 행

            for (int j = 3; j > i; j--) { // 열

                // i가 0일 때 j가 3 (1행일 때 * 3개)
                // i가 1일 때 j가 2 (2행일 때 * 2개)
                System.out.print("*");
            }
            System.out.println(); // 한 줄 출력 후 바꿈

        }

        System.out.println(); // 2번쨰 별과 3번째 별 사이의 공백.


        // 3번째 별

        for (int i = 0; i < 3; i++) {
            for (int n = 2; n > i; n--) { // 2번째 별의 행과 같다.
                System.out.print(" ");
            } // 내부 공백을 출력하는 for 문과 별을 출력하기 위한 for문으로 구성.

            for (int j = 0; j < i + 1; j++) { // 별을 출력 하기 위한 for문
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println();


        // 4번째 별

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < i; n++) { // 첫번째 별의 행과 같음
                System.out.print(" ");

            }

            for (int j = 3; j > i; j--) { // 2번째 별의 열과 같다.
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println();


        // 5번째 별

        int num = 1;

        for (int i = 0; i < 3; i++) {
            for (int n = 2; n > i; n--) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) { // 별이 1,3,5,7,9번이 출력되어야 하므로 변수를 하나 생성
                System.out.print("*");
            }
            num = num + 2; // 1,3,5,7,9번이 출력되도록 +2를 더해주어 계속해서 홀수로 만들어준다.
            System.out.println();

        }
    }
}


