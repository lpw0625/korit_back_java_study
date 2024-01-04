package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for(int i= 0; i < 10; i++) {
            System.out.println("i: " + i);
            if(i % 2 != 0) {
                continue; // 지금까지는 실행하고 밑에 있는건 그만두고 다음 반복으로 넘어가 계속 해라.
                            // continue밑에 있는 코드는 실행이 안되고 반복으로 넘어간다 .
            }
            System.out.println("for문 마지막.");
        }

    }
}
