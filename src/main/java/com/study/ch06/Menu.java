package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;




        while(flag) { // while 문 : 조건 중심. // 무한 루프  // true 여지만 반복 멈품
            System.out.print("입력");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                boolean flag2 = true;
                while(flag2) {
                    System.out.print("1번에서 입력");
                     inputValue = scanner.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        flag2 = false;
                        break; // 현재 반복만 break를 건다.


                    } else if(inputValue == -1) {
                        System.out.println("뒤로가기.");
                        break;

                    } else if(inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어왔습니다.");

                    } else if(inputValue == 2) {
                        System.out.println("1번에서 2번으로 들어왔습니다.");

                    } else {
                        System.out.println("다시 입력하세여");
                    }
                    System.out.println();


                }

            } else if(inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");

            } else {
                System.out.println("다시 입력하세여");
            }
            System.out.println();


        }
    }
}


// false: 끝까지 실헹하고 조건이 안맞을때 멈춘다.
// break : 그 즉시 멈춘다.