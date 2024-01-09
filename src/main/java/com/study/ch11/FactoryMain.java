package com.study.ch11;

public class FactoryMain {
    public static void main(String[] args) {


        Company company = new Company();

        company.setName("삼성");
        company.showCompanyInfo();

        int autoCount = 0;

        Phone phone1 = new Phone(++autoCount, company);
        Phone phone2 = new Phone(++autoCount, company);
        Phone phone3 = new Phone(++autoCount, company);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

     //해당 클래스 안에 스테틱을 붙이는 순간  SamsungCompany. 클래스에 정의가 된다. 즉, 생성을 할 필요가 업ㅅㅂ다.

    }

}
