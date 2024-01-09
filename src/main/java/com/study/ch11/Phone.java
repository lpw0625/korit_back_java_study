package com.study.ch11;

public class Phone {
    static int autoCount = 1;
    int serialNumber;
    Company company;


    public Phone( Company company) {
        autoCount++;
        this.serialNumber = 2040000;
        this.serialNumber += autoCount;
        this.company = company;

        // 객체를 생성할때마다 자동으로 생성.
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
