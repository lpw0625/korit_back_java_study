package com.study.exam;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int a = 10;
        int b = 20;

        int c = 200;
        int d = 100;


        int add1 = calculator.add(a,b);

        int sub1 = calculator.sub(c,d);


        System.out.println("두 수의 합은 " + (add1));
        System.out.println("두 수의 차는" + (sub1));
    }
}
