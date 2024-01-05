package com.study.ch08.member;

public class PhoneArrayMain {
    public static void main(String[] args) {
        // Phone을 담을 수 있는 배열

        Phone[] phones = new Phone[3]; // 이 Phone라는 배열을 선언 하여 담을 수 있는 공간을 3개로 만든것
        phones[0] = new Phone("삼성", "갤럭시 S23 ultra");
        phones[1] = new Phone("애플", "아이폰pro15");
        phones[2] = new Phone("샤오미", "miPhone");
        Phone p1 = new Phone("삼성", "갤럭시");

        for(int i = 0; i < phones.length; i++){
            System.out.println(phones[i].toString());
        }


    }
}
