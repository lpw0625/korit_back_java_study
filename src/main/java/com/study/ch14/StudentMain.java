package com.study.ch14;

public class StudentMain {
    public static void main(String[] args) {
        Studnet studnet = new Studnet("이평원", "01029091213","양산시",31);
        System.out.println(studnet);

        Student2 student2 = new Student2("이평원", "01029091213","양산시");

    }
}

// tostring 호출

// 생명 주기 : 모든 프로그램에선 라이프 사이클의 존재가 중요하다 변수가 생성되고 메모리에서 사라지는 시점.
