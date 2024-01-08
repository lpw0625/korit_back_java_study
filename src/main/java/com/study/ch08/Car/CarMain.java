package com.study.ch08.Car;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = "null";
        boolean loopflag = true; // 선언

        // 자동차 정보를 저장하기 위해 루프 밖으로 저장을 하게끔 변수 선언 .  // car 정보에 대한 주소값이 저장되어 있을 것이다.
        Car[] cars = new Car[3]; // 1번째 생성

        // 각각 기능을 분리를 해야 한다.
        CarRepository carRepository = new CarRepository(cars); // 2번째 생성
        CarService carService = new CarService(carRepository); // 3번째 생성
        // 외부에서 주입.


        while (loopflag) { // true 이기에 무한루프 작동.
            System.out.println("자동차 관리 프로그램.");
            System.out.println("1. 자동차 등록 ");
            System.out.println("2. 자동차 조회 ");
            System.out.println("q. 프로그램 종료");
            System.out.print("<<< 메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료중....");
                loopflag = false;
            } else if ("1".equals(selectedMenu)) { // 1번을 선택 할시.
                System.out.println("<<< 자동차 등록 페이지 >>> ");


                String model = null;
                String color = null;

                // 레파시토리 영역 : 저장 공간의 공백의 유무 확인. 저장 배열을 가져오는 영역.


                if (carService.isFull()) { // Carㄴㄷ
                    System.out.println("더이상 등록을 할 수 없습니다,.");
                    continue; // 다른 함수로 못뺀다 따라서 이 조건문은 여기에 계속 있어야 한다.

                }

                System.out.println("모델명 >>> ");
                model = scanner.nextLine();
                System.out.println("색상 >>>> ");
                color = scanner.nextLine(); // 차량의 정보를 입력 하는 것으로 이때 Car class가 필요

                // Cars 배열의 빈 값을 찾아내기 위함.


                Car car = new Car(model, color);
                carService.append(car);// 코드를 간결화 하기 위해 클래스를 만든 시점에 생성자를 주입시키자.
                //entity 클래스 : 정보를 담는 크랠스
                // 무한 루프를 돌면 생성하고 대입해서 저장은 하지 못한다.

                    /// emptyIndex = i; // 빈자리를 찾겠다.
                    ///  break; // 자리가 채워져 있으면 브레이크를 건다.
                 // 자리가 채워져 있는 배열 자리에서 다시 비워져 있는 배열 자리로 찾기 위해 돌아간다.

            } else if ("2".equals(selectedMenu)) { // 2번을 선택 할시 .
                System.out.println("<<< 자동차 조회 페이지 >>> ");
                carService.printCarList();

            } else {
                    System.out.println("다시 입력하세요.");
            }


            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}

// 기능별로 클래스와 메서드를 분리를 시킬 수 있어야 한다.
// 분리를 하는 기준이 있다.
// 비즈니스 로직, 서비스, 레파시토리(저장소)
// 저장소 : 데이터 관리.
// 클린코드 : 남이 봤을때 가독성이 좋은 코드. 이해하기 좋은 코드. 실무에서 인수인계가 쉬운 코드.