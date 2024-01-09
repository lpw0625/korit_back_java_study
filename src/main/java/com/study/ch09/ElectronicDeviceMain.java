package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];


        // 업 캐스팅 : 자식에게서 가지고 있던 메소드나 변수는 사용할 수 없지만 부모와 교집합으로 가지고 있는 것들은 가능하다.
        // 반복문을 통해서 처리 가능.

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        for (int i = 0; i < electronicDevices.length; i++) {
            if (electronicDevices[i] instanceof Computer) {//  컴퓨터의 인스턴스라고 묻는 것. 다운캐스팅
                Computer computer = (Computer) electronicDevices[i]; // >> 스마트폰 = 컴퓨터로 다운캐스팅이 안된다.
                computer.playGame(); // 다운 캐스팅을 할때는 부모 상속과 동일하게 처리를 해야한다.

            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
    }
    // 상속은 우리가 할 일은 대부분 없다.
    // 라이브러리를 쓰면 미리 만들어진게 있다.
    // 미리 만들어진 것을 상속을 받아 우리가 필요한 것을 재정의 시킨다.
    // 원래의 형태를 분석을 할 줄 알아야 하기에 기본 문법을 배우고 있는 것이다.
}

