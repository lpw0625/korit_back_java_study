package com.study.ch10;

import com.study.ch09.ElectronicDevice;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        new RemoteController();





        // 익명 클래스
        ElctronicDevice elctronicDevice = new ElctronicDevice() {// ElectronicDevice를 즉시 생성(일회용)
            @Override
            void showDeviceState() {// 굳이 클래스 밖으로 빼서 쓰지 않고 일회용으로 쓸 경우
                System.out.println("첫번째 기기 상태확인");
            }
        };

        // 익명 클래스

        ElctronicDevice elctronicDevice2 = new ElctronicDevice() {// ElectronicDevice를 즉시 생성(일회용)
            @Override
            void showDeviceState() {// 굳이 클래스 밖으로 빼서 쓰지 않고 일회용으로 쓸 경우


                System.out.println("두번째 기기 상태확인");
            }
        };

        RemoteController remoteController = new RemoteController();

        ElctronicDevice[] elctronicDevices = new ElctronicDevice[3];
        elctronicDevices[0] = elctronicDevice;
        elctronicDevices[1] = elctronicDevice2;
        elctronicDevices[2] = remoteController;


      for(int i = 0; i < elctronicDevices.length; i++) {
          elctronicDevices[i].showDeviceState();
      }

    }
}