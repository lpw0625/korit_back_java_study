package com.study.ch13;

import java.util.Scanner;

public class FactoryService2 {

    private Scanner scanner;


    public FactoryService2(Scanner scanner) {
        this.scanner = scanner;
    }


    public void create() {
        System.out.println("2공장에서 차량을 생산");
        System.out.println("모델명 입력 >> ");
        String modelName =  scanner.nextLine();

        Factory factory = Factory.getInstance(); // 1번에 만든 팩토리 주소를 그대로 가죠오는것
        factory.setFactoryName("자동차 생산 공장");
        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }


}
