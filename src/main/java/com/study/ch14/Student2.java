package com.study.ch14;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor; // no argu 는 쓸 수 없지만 all argu는 쓸 수 있다.


@AllArgsConstructor
@RequiredArgsConstructor // 필수 아규먼트 생성.
@Data
public class Student2 {
    private  String name;
    private  String address;
    @NonNull
    private   String phone;
}


//not NUll : null 만 아니면 된다 다른 값으로 섹터를 변경 가능하다.

//final : 상수이기 때문에 변경이 불가능하다,.