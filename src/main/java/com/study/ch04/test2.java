package com.study.ch04;

public class test2 {
    public static void main(String[] args) {
        /*

        조건연산자(삼황연산자)

        a > 0 ? "양수"  : a == 0? "0" : "음수"

        연산자는 무조건 결과값이 있다

         */

        int iResult = 10 > 2 ? 1111 : 2222;
        Integer iResult2 = 10 > 2 ? 1111 : 2222;

        // String sResult = 10 > 2 ? "1111"  : "2222";

        // boolean bResult = 10 > 2 ? true : false;
        // 틀린말은 아니다 하지만....

        boolean bResult = 10 > 2;

        //단순하게 생각하면 이렇게 하는것도 맞기에 코드는 단순하게 생각해야 한다.

        String name = null; // '문자열'이 비워진것.
        // null : 주소가 없다.
        // 메모리 주소의 0번 즉, 아예 없는 공간.
        // null 체크는 정말 중요하다.
        // 진짜 비워져 있는 존재는 null 이다.


        System.out.println(name == null); // 문자열이 없는것 맞지만 이 안에 값이 없는 것은 아니다.

     // 앞쪽의 조건이 참이면은 1111 만약에, 거짓이면 2222이라는 값을 줄것이다.
     // 결과 값들의 자료형이 일치 되어야 한다.
     // 또한 명령문을 쓸 수 없고 값이 와야한다.
        // 값이 없다 의미.
        // 숫자에서는 0이라는뜻.
        // 문자에서는 공백으로 본다.


    }
}
