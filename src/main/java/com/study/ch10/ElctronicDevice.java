package com.study.ch10;

/*
[ 추상화 ] : 공통점을 뽑아낸 것 설계 도면과도 같은것.
1. 추상 클래스 abstract class : 클래스들의 공통점을 뽑아낸 클래스를 만든 것
2. 인터페이스 interface

 */

public abstract class ElctronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }
    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드 -> 추상 클래스와 인터페이스에서만 정의 할 수 있다.
    abstract void showDeviceState();    // 강제성을 주고 싶을 때. 중괄호와 실행문 없음.
    // 상속 받은 이후로 무조건 하겠다.
}