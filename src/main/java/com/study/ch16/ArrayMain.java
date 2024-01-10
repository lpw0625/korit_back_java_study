package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("이평원");
        arrayService.add("이평투");
        arrayService.add("이평쓰리");
        arrayService.add("이평포");
        arrayService.add("이평파이브");

        System.out.println(arrayService.toString());
        System.out.println(arrayService.indexof("이평원")); // 저 문자열에는 어느 배열에 있는가?

    }
}
