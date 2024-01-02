package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        // 변수
        int date = 20231229;

        // date라는 값은 별명 혹은 변수라고 한다.
        // date라는 값은 20231229라는 주소를 선언했다.

        // double date2 = date;

        double date2 = (double) date;
        // double : 실수
        // 실수는 정수를 포함한다.

        // int date3 = date2;
        // 정수는 실수의 소수점에 포함이 안되기에 선언이 안된다.
        // 업캐스팅 = int >> double
        // 업캐스팅 때는 ()안에 자료형을 삽입하지 않아도 된다.
        // double >> int = 다운 캐스팅.
        // 다운캐스팅의 문제점은 정수만 가져오기에 소수점을 다 버려야한다.
        // 문법상 허용하되 그렇게 쓰지마라라고 빨간줄이 든다.

        int date3 = (int) date2;
        // 요구하는건 int인데 double을 제공했기에 괄호 안에 int를 삽입.
        // 다운캐스팅을 할땐 명확하게 대입할것 .
        // 컴파일링 과정에서 해석이 안된다.
        // (int)라고 명시하면 개발자의 의도대로 해석을 할 수 있다.


        // 형 변환 : 문자 >> 정수 >> 실수

        char a = '1';
        // 이렇게 하면 숫자 1이 아닌 문자 1이다.

        int b = a;
        // 문자에서 정수로 업캐스팅.

        double c = b;
        // 정수에서 실수로 업캐스팅.






       // int라는 4byte까지 담긴 공간의 이름을 date라고 해라.
       System.out.println(date + 1); // date에 +1 을 대입한다.
       System.out.println(date + 2);
       System.out.println(date + 3);
       System.out.println(date + 4);
       System.out.println(date + 5);
       System.out.println(date + 6);
       System.out.println(date + 7);
       System.out.println(date + 8);
       System.out.println(date + 9);


    }
}
