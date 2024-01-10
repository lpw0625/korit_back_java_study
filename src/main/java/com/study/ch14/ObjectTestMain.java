package com.study.ch14;

public class ObjectTestMain {
    public static void main(String[] args) {
        Study study = new Study("아평원", "양산시");

        System.out.println(study.toString());
        System.out.println(study);

        Study study1 = new Study("아평원", "양산시");

        System.out.println(study.equals(study1)); // 인스턴스 기준으로 봐야한다 주소값이 다르기 때문
        System.out.println(study == study1); // equals도 입맛대로 재정의가 가능하다.

        System.out.println(study.getClass());
        System.out.println(study1.getClass());
        System.out.println(Study.class);// 스태틱으로 접근하면 .class instance of 대신에 쓸 예정.

        System.out.println(study.hashCode());
        System.out.println(study1.hashCode()); // 출력을 하면 숫자가 나오는데 실제 메모리 주소값이다.hashcode : 십진수
                                                // 해쉬코드는 주소값.
                                                // 해쉬코드는 값만 비교를 하기 때문에 찍어나오는 틀이 달라도 동등하게 취급한다.

    }
}
