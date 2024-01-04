package com.study.ch07.carimformation;

import java.util.Scanner;

public class CarimforMain {

    public static void main(String[] args) {


        CarService carService = new CarService();

        Scanner scanner = new Scanner(System.in);

        String carName = null;
        String carSystem = null;

        long carPrice = 0;
        int carHorsepower = 0;
        System.out.println("차량 등록 프로그램");

        System.out.print("차량 모델명 : ");
        carName = scanner.nextLine();
        if(carService.isEmptyString(carName)){

            System.out.println("모델 명을 다시 입력하세요.");

            return;
        }

        System.out.println("차량 시스템(4륜구동): ");
        carSystem = scanner.nextLine();
        if(carService.isEmptyString(carSystem)) {
            System.out.println("해당 결과는 없습니다. 다시 입력하세요.");

            return;
        }

        System.out.println("가격 >>>  원.");
        carPrice = scanner.nextLong();

        System.out.println("해당 차력의 마력 수는 >>> ");

        Carimfor carimfor = new Carimfor(carName,carSystem,carPrice,carHorsepower);

        carService.carimformationCarService(carimfor);

    }



}
