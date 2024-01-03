package com.study.ch06;

public class For1 {
    public static void main(String[] args) {

        // for문 (횟수 중심.)
        for(int i = 0; i < 10; i++) { // ;앞부분이 초기화문; / 조건문; / 후처리문(증감문);
            // i++ = // i = 0 증가되기 전에 들어왔기 때문.
            // 지역 변수 선언 가능.
            System.out.println("i: " + i);
        }

        int i = 0; // while문의 필수는 아님.

        // while문 if문처럼 조건만 들어간다.
        while(i < 10) { // 조건이 실행이 될려면 변수는 while문 밖에 먼저 선언이 되어 있어야 한다.
            System.out.println("i " + i);
            i++; // 후처리
        }


    }
}


// for 문 반복횟수를 일정하게 증가시키면서 횟수가 정해져 있다. 일정한 간격으로 증가시켜야할때.
// for는 조건이 중심이 아니라 반복횟수가 중심이다.
// 일정하게 숫자가 증가하면서 반복횟수가 필요하면 for문

// wheil문은 반복횟수가 아닌 조건이 중심문이다.
// 어떠한 조건이 필요하고 반복횟수가 중요하지 않다면 while문.