package com.study.ch11;

public class Phone {

    int serialNumber;
    Company company;

    public Phone(int serialNumber, Company company) {
        this.serialNumber = serialNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}

