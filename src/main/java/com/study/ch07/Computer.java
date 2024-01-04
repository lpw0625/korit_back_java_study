package com.study.ch07;

public class Computer {

    String type;
    String cpu;
    String ram;
    String disk;

    // 생성자

    Computer() { // 메소드의 형태이며 대문자로 시작되고 클래스 이름과 동일하다. : 생성자.

        //생성자도 오버로딩이 가능하다. 매개변수가 다르면
        type = "컴퓨터";

    }

    Computer(String type) { // 메소드의 형태이며 대문자로 시작되고 클래스 이름과 동일하다. : 생성자.

        //생성자도 오버로딩이 가능하다. 매개변수가 다르면
        this.type = type; // String 옆에 있는 타입이 들어있는것
                     // ㅅ

    }




    void showInfo() { // showInfo 메소드 변수명과 메소드는 소문자로 시작.
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);

        // 클래스 안에 정리된 함수를 : 메소드(method)
        // 자바에는 함수라는 개념이 없고 메소드라고 불림.
        //
    }

}


/*
클래스는 정보의 문급.

정보를 담는 용도로 클래스가 쓰인다.

수많은 정보들을 하나의 묶음으로 쓰이는게 객체이다.

생성자를 왜 배운다?

객체를 생성할때 데이터를 가지고 그 데이터를 통해서 객체를 만들겠다.

클래스는 비슷한 동작(매서드)들의 묶음도 클래스이다 이는 비즈니스 클래스라고 한다.

우리가 헤야하는건 이해도 중요하지만 강사님께서 설명해드리신 문법 자체를 받아들여야 한다.


 */

