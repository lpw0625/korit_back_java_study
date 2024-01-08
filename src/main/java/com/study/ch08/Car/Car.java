package com.study.ch08.Car;

public class Car {
    String model;
    String color;


    // NoArgsConstructor

    Car() {


    }


    // AllArgsConstructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' + //        \ : 쓸때 ''를 써줘야함.

                ", color='" + color + '\'' +
                '}';
    }
}


