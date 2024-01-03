package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = "null";

        System.out.print("번호 선택: ");
        num = scanner.next();

        switch (num) { // 어떠한 값이 들어오느냐에 따라서 case값에 따라간다.

            // 해당 케이스로 찾아가 그 케이스로 찾아간다.
            // 내가 입력한 케이스로 따로 찾아가고 싶다면 break를 걸어야한다.
            // switch문은 case가 중요하다.
            // 변수의 자료형에 따라 case도 바꿔줘야한다.
            // swtich문은 내가 입력한 값에 따라 해당 값이 들어가는 케이스로 찾아가는 프로그램으로 쓰인다.
            // 수식이 들어가고 참과 거짓에 대한 조건이 들어가면 if문을 써야한다.

            case "0":
                System.out.println("0선택");
                break;
            case "1":
                System.out.println("1선택");
                break;
            case "2":
                System.out.println("2선택");
                break;
            default: // default전에는 break를 줘야한다.
                System.out.println("오류");
        }

        if("0".equals(num)) {
            System.out.println("0선택");

        }else if("1".equals(num)) {
            System.out.println("1선택");
        }else if("2".equals(num)) {
            System.out.println("2선택");
        } else {
            System.out.println("오류");
        }
    }
}
