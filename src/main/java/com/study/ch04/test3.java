package com.study.ch04;

public class test3 {
    public static void main(String[] args) {
        /*
        << 문제 >>

       int x = 0;
       int y = 1;

       x와 y 중 하나라도 값이 0이면 결과는 "오류"
       사분면

       x가 양수 이면서 y도 양수 >> "1사분면
       x가 음수 이면서 y도 양수 >> "2사분면
       x가 음수 이면서 y도 음수 >> "3사분면
       x가 양수 이면서 y도 음수 >> "4사분면



         */

        int x = 0;
        int y = 0;

       /* boolean step1 = i == 0 || y == 0 ;
        boolean step2 = i > 0 && y > 0 ;
        boolean step3 = i < 0 && y > 0 ;
        boolean step4 = i < 0 && y < 0;
        boolean step5 = i > 0 && y < 0;
        boolean result1 = step1;

        System.out.println(result1);
        */
       String result = x == 0 || y == 0 ? "오류"
               : (x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                : (y > 0 ? "2사분면" : "3사분면"));
               // x가 양수일때 y가 양수인지 확인.

        String result2 = x == 0 || y == 0 ? "오류"
                : x > 0 && y > 0 ? "1사분면"
                : x < 0 && y > 0 ? "2사분면"
                : x < 0 && y < 0 ? "3사분면"
                : x > 0 && y < 0 ? "4사분면" : "오류";
        System.out.println(result2);
    }
}
