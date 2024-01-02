package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType p1 = new StudentType();
        // 참조 자료형 / 변수 지정 / 자료 형태를 새로 선언.
        // StudentType클래스에 들어있는 자료형을 넣을 수 있다.
        p1.name = "이평원";
        p1.address = "경상남도 양산시.";
        p1.grade = 1;
        p1.age = 29;

        Person p = p1;
        // Person클래스 안에
        // StudentType 클래스를 포함시켜 업캐스팅을 하는것.
        StudentType p2 = (StudentType)p;
        // 다운캐스팅은 내가 어떤 타입으로 바꿀건지 명시해야한다.

//        Person 전주환 = new Person(); // new : 메모리를 할당하기 위해 만들어짐.
//        StudentType 전주환학생 = (StudentType) 전주환;
//        // Person이라는 타입은 StudentType의 타입이 아니다.
        // 애초에 상위타입의 형태는 하위형태로 다운 캐스팅이 불가능하다.

       StudentType 전주환학생 = new StudentType();
       Person 전주환사람 = 전주환학생;
       StudentType 전주환학생2 = (StudentType) 전주환사람;
// 추상적인 것이 상위 개념.


        System.out.println("저의 이름은 : " + p1.name);
        System.out.println("제가 살고 있는 주소는 :  " + p1.address);
        System.out.println("제 학년은 : " + p1.grade + "학년 입니다.");
        System.out.println("저의 나이는 : " + p1.age);
    }
}
