package com.study.ch11;

public class SamsungCompany {
   static String name = "삼성"; // static을 붙이는 순간 스텍 메모리로 들어간다.

    static void showCompanyInfo() {
        System.out.println("회사명 " + name);
    }
}
