package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(); // ArrayList 이미 우리가 다 만든 상태.
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1)); // 배열 1번 값에 위치한 문자열을 가지고 와라.
        System.out.println(strList.indexOf("c")); // 문자열 c의 배열 값을 출력하라.
        strList.remove(1);
        System.out.println(strList);

    }
}
