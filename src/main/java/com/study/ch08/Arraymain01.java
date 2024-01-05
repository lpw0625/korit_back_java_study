package com.study.ch08;

import java.util.Scanner;

public class Arraymain01 {

    public static void main(String[] args) {

      // 배열(Array)
        int num1 = 10; // 프로그램 실행 중에 변수명은 변경 불가.
        int num2 = 20;

        int[] numArray; // 선언 .

        numArray = new int[3]; // : int 공간에 3개 엮어서 생성 값은 없는 상태. // 값(주소) 대입.

        System.out.println(numArray);

        numArray[0] = 10; // 첫번째 공간인 0에 10이라는 값을 넣겠다.

        System.out.println(numArray[0]);

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);


        //ArrayIndexOutofboundsException : 배열의 범위에서 벗어났다.





    }
}
