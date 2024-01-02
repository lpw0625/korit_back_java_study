package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {

        Person p = new Person(); // Person이라는 새로운 데이터를 만들어라.
        // p라는 변수를 만들었고 자료형이 Person이다
        // Person이라는 자료는 우리가 만든 자료형이기에 우리가 자료형을 만들어 줘야한다.
        // p에 Person이라는 주소값이 들어가 있는 상태
        //Person에 이름과 나이가 들어있는 형태를 들어가 있는것
        // 메모리 공간이 있다는건 메모리 주소가 있다는것.
        // p.이라고 치면 해당 메모리 공간에 들어가는 것.
        p.name = "이평원";
        p.age = 29;


        Person p2 = new Person();
        p2.name = "이평이";
        p2.age = 30;
        // 주소 참조.
        int a = 10;


        /*
        StudentType이라는 이름, 학년 주소를 저장할 수 있는 클래스를 만드시오.
         */


    }
}
