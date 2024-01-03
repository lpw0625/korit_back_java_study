package com.study.ch05;

import java.util.Scanner;

public class Switch02 {
    public static boolean select() {

        // 반환 자료형(return 자료형)
        Scanner scanner = new Scanner(System.in);
        System.out.print("여기서 멈출까요(y/n)? ");
        String value = scanner.next();
        return ("y".equals(value)) || "Y".equals(value);

        }

    public static void main(String[] args) {

        // case는 시작부터 끝까지 이어진다
        // 중괄호 개념이 없다.
        // 함수를 쓰는 이유. 중복 제거, 코드가 길어지면 정리하기 위해서.
        // 함수 정의는 무조건 클래스 안.
        // 함수 안에서 함수를 호출하는건 괜찮지만 함수 안에 함수를 정의하는건 안된다.
        // 중괄호가 갇히면 함수가 지역으로 나뉜다고 생각하면 된다.
        // 함수를 나누는 순간에 메모리 공간이 나눠지기 때문이다.
        // 같은 이름의 변수도 쓸 수 없다. 이는 함수명도 마찬가지다.
        // 따라서 클래스 단위로 나눠야 한다.
        // 중괄호 안은 지역. 중괄호 바깥은 전역이라고 생각하면 된다.
        // 상위 함수에 만약에 변수를 선언하면 그 하위 지역 함수들도 쓸수가 없다.
        // 지역에 있는 함수를 바깥으로 가져갈 수 없다. 메모리가 할당되기 때문에.
        // 중괄호가 닫히는 순간. 메모리가 사라져 쓸 수가 없다.

        int num = 1;
        System.out.println("게임 시작.");
        switch (num) {
            case 1:
                System.out.println("1단계 시작.");
                if(select()) {
                    break;
                }

            case 2:
                System.out.println("2단계 시작.");
                if(select()) {
                    break;
                }
            case 3:
                System.out.println("3단계 시작.");
                if(select()) {
                    break;
                }
            case 4:
                System.out.println("4단계 시작.");
                if(select()) {
                    break;
                }
            case 5:
                System.out.println("마지막 단계 시작.");

        }
    }
}
