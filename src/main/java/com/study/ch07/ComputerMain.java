package com.study.ch07;

public class ComputerMain { // 메인 메소드
    public static void main(String[] args) {
        Computer computer1 = new Computer(); // 자료형 Computer에 따라 new 인스턴스를 생성. (객체(인스턴스)를 생성한다) , 생성자 호출
                                             // 컨트롤 누르면 생성자의 위치를 파악하고 찾아간다.
                                            /// computer1 깡통으로 하나 만듬


        Computer computer2 = new Computer("노트북"); // 생성

        // 생성자는 주소값으로 리턴한다.

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = " amd ryzen";
        computer2.cpu = " i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8gb";
        computer2.ram = "16gb";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";

        // Heap 메모리 (빌리는 영역 /동적 메모리))
        // 프로그램 실행 중 정해진 영역(스택 메모리 /정적 메모리))
        // 위의 코드대로 출력하면 나오는 결과값:  com.study.ch07.Computer@1e643faf (하나의 자료형) // 인스턴스 주소값

    }
}
