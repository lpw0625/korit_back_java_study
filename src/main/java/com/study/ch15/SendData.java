package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendData<T> { // <> 아무단어나 써도 된다. 단 t는 타입이기에 쓰게 된다.
    private int code;
    private T data; // T: 자료형을 바꿀 수 있는 변수 .클래스 옆에 들어오는 자료형에 따라 바뀌게 된다,

    public void send () { //
        System.out.println("데이터 전송");
        System.out.println("code: " + code);
        System.out.println("data: " + data);

    }
}
