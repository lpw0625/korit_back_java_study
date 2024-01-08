package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

    @Override // @로 시작하면 어노테이션 부모로부터 오버라이드를 하여 재정의를 한 것을 구분하기 위함. 하나의 기능을 함축적으로 쓸 수 있는 기능.
    void showDeviceState() {
        super.showDeviceState(); // ctrl+o 오버라이드 단축키.
    }
}
