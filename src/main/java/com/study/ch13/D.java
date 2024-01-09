package com.study.ch13;

public class D {
    public void d (Company company) {
        System.out.println(" << C2 클래스 >>");
        System.out.println(company);
        System.out.println("<<C2클래스 싱글론 결과 >>");
        System.out.println(Company.getInstance());

    }
}

// 싱클론 : 하나만 만들어야 할떄 쓰여야됨
//