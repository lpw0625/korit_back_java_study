package com.study.ch14;

import lombok.*; // 어느정도 갯수가 늘려지면 입력한 롬복 전체로 인식된다.
// Lombok 하는 방법


    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    //@Setter
   //@Getter
    //@EqualsAndHashCode
    // @ToString
    // : 어노테이셙 데이터 한개 이다.
    public class Studnet {

    private String name;
    private  String phone;
    private  String address;
    private  int age;
}
