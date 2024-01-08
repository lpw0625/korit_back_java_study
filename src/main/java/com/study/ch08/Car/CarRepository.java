package com.study.ch08.Car;

public class CarRepository {

    // 레파시토리 : 데이터 저장소 // 레파시토리 영역 : 저장 공간의 공백의 유무 확인. 저장 배열을 가져오는 영역.
    final Car[] cars;  // 필수적인 매개 변수 // 찍어내기 위한 틀만 만듬. 틀은 외부에서 가져가면 초기화 되지만 매소드는 초기화가 x

    CarRepository(Car[] cars) { // 외부에서 불러와서
        this.cars = cars; // 현재 자기 값의 주소에 주입 시키는 것.
    }

    int getEmetyCount() {
        int emetyCount = 0;
        for (int i = 0; i <cars.length; i++){
            if (cars[i] == null) {
                emetyCount++;
            }
        }
        return emetyCount;
    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i; // 해당 인덱스가 확인하고 함수 자체가 빠져나감
            }
        }
        return -1; // 빈공간을 찾지 못했다? -1을 줌, 비어있는 공간이 없다.
    }
    void insert(Car car) {
        cars[getEmptyIndex()] = car;


    }

   Car[] getCarDatas() {
       int carCount = 0;
       for (int i = 0; i < cars.length; i++) {
           carCount++;
           {
           }
       }

       Car[] newCars = new Car[carCount];
       int j = 0;
       for (int i = 0; i < cars.length; i++) {
           if (cars[i] != null) {
               newCars[j] = cars[i];
               j++;
           }
       }

       return newCars;
   }
}