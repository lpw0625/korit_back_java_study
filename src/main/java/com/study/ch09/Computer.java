package com.study.ch09;

public class Computer extends ElectronicDevice { //컴퓨터라는 클래스가 일렉트로디바이스 클래스를 상속받겠다.
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }


    // 재정의 - 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의 할 수 있다.

    void showDeviceState() { // 매개변수와 똑같지만 안에 있는 실행문만 달라진다.
        System.out.println("컴퓨터");
         super.showDeviceState(); // 부모의 주소 창조
    }
}

// w자식 클래스와 부모 클래스가 동시에 출력된다.