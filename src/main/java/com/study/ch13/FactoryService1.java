package com.study.ch13;

import java.util.Scanner;

public class FactoryService1 {

       private Scanner scanner;


public FactoryService1(Scanner scanner, Factory factory ) {
    this.scanner = scanner;

}

       public void create() {
            System.out.println("1공장에서 차량을 생산");
            System.out.println("모델명 입력 >> ");
            String modelName =  scanner.nextLine();
            Factory factory = Factory.getInstance(); // 팩토리 클래스 안에서 스테틱 클래스를 넣고 가져오는것
           factory.setFactoryName("자동차 생산 공장");
            Car car = factory.produce(modelName);
           System.out.println(car.toString());
        }


    }

