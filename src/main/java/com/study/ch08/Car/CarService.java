package com.study.ch08.Car;

public class CarService {

 CarRepository carRepository; // 내부에 주입


  CarService (CarRepository carRepository) { // 외부에서 CarRepsitory를 불러오고
        this.carRepository = carRepository;
    }

    boolean isFull() {
      return carRepository.getEmptyIndex() == -1;
    }

    void append(Car car) { // 배열에다가 값을 추가하는 행위 >> 레파시토리 영역으로 넣음.
 carRepository.insert(car);
            }

            void printCarList() {
              Car[] cars = carRepository.getCarDatas();
              if(cars.length == 0) {
                  System.out.println("등록된 차량이 없습니다.,");
                  return;

                  // 레파시토리의 Car[]들을 출력시키는 역할.
              }
              for(int i = 0; i  < cars.length; i++) {
                  System.out.println(cars[i].toString());
              }
            }





        }

        // 자리가 채워져 있는 배열 자리에서 다시 비워져 있는 배열 자리로 찾기 위해 돌아간다.
         // 저장소에 공간이 비워져 있는지와 비워져 있는 공간의 위치를 찾는걸 생각.

