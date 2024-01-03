package com.study.ch03;

public class Function02 {

    public static void fx01() {
        // void  >> 비어있는, 공허한
        System.out.println("fx01 함수 실행.");
        System.out.println();
    }

    public static  void fx02(int age2, String name2) {
        System.out.println("fx02 함수 실행.");
        System.out.println("나이. " + age2);
        System.out.println("이름. " + name2);
        System.out.println();

    }

    public static  void fx02(String b, int a) {
        System.out.println("fx02 함수 실행.");
        System.out.println("나이. " + a);
        System.out.println("이름. " + b);
        System.out.println();
    }

    public static  int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;

        // 함수는 돌려줄때 같은 자료형으로 적어야 한다.
    }

    public static String fx04(String name, int age) {
        return name + ", " + age;
    }

        public static void main(String[] args) {
        fx01();
        fx02(30, "이평원");
        fx02("이평투", 31);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("이평원", 30);
        System.out.println(result);


        // 값은 변수 순서대로 적어야 한다. 자료의 형만 가지고 판단.
        // 똑같은 변수명이지만 매개 변수가 다르기에 변수명은 똑같아도 상관이 없다.

        // 산수의 오버로딩

        // 함수명이 같더라도 매개변수와 자료형이 다르면 함수정의가 가능하다.
        // C언어에서는 함수명이 고유하게 존재해야 한다. 즉 하나의 함수가 하나의 기능만을 구현해야 한다는 것이다. 하지만
        // 자바에서는 하나의 메소드 이름으로 여러 기능을 구현하기 때문에 '과적하다.'라는 뜻의 이름을 붙여준 것으로 보인다.
        // 함수는 이름만 가지고 판단하지 않고 그 안에 있는 매개 변수까지 확인한다.
        // 자료형만 따져야 한다.
        // return 자로형은 함수명과 매개변수로만 적용이 된다.
        // 즉, 매개변수가 같으면 오버로딩이 안된다. 달라야 한다.
    }
}

