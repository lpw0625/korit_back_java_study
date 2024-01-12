package com.study.ch19;


import com.study.ch13.C;
import lombok.Builder;
import lombok.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@Builder
@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @NotNull
    @Contract(" -> new")
    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String model;
        private String color;

        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this; // 객체 참조
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }
    }

}
