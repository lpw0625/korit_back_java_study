package com.study.ch04;

public class Operation8 {
    public static void main(String[] args) {
        /*
        << 문제 >>

        복합대입연산(산술연산, 대입연산)

         */

        int num1 = 10;
        int num2 = 20;
        num1 = num1 + num2; // 나 자신의 값과 다른 값을 더할것이다.
        // 자기 자신한테 값을 대입하는 것.

        num1 += num2; // 자기 자신한테 num2까지 대입을 해라.
        num1 *= num2; // 자기 자신한테 num2까지 곱해서 대입을 해라.
    }
}
