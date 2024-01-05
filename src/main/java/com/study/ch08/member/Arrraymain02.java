package com.study.ch08.member;

public class Arrraymain02 {
    public static void main(String[] args) {


        String[] names = new String[6];

        names[0] = "이평원";
        names[1] = "이평이";
        names[2] = "이평삼";
        names[3] = "이평사";
        names[4] = "이평오";
        names[5] = "이평육";


        // 반복되기 때문에 배열을 쓰기에 반복문을 써야한다.
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }




     //

    }

}
