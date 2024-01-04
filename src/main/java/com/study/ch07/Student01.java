package com.study.ch07;

public class Student01 {
  String name;
    int age;
// String address;
    final String address;


    // 생성자 constructor
    // args(arguments) 매개변수 값


    //NoArgsConstructor

    Student01() {
        address = "";




    }

    Student01(String nane, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;

    // 아무런 생성자에 대한 정보가 없더면

    }

    //RequiredArgsConstructor
    Student01(String address) {
        this.address = address;

    }
}
