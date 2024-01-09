package com.study.ch11;

public class FactoryMain {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");

        int autoCount = 0;

        Phone phone1 = new Phone(++autoCount, company);
        Phone phone2 = new Phone(++autoCount, company);
        Phone phone3 = new Phone(++autoCount, company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

    }

}
