package com.study.ch18;

public class AdditionImpl  implements Addition{
    @Override
    public int add(int a, int b) { // 오버라이딩이나 오버로딩 에도 변수는 바꿔도 상관없다. 자료형만 안바꾸면 된다.
        System.out.println("AdditonImpl에서 호출한 add 메소드");
        return a + b;
    }
}
