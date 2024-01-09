package com.study.ch13;

public class Company {
    /**
     * Company 클래스를 싱글톤을 적용하여 구현하시오
     */
    private  static  Company instance; // 자기 자신을 인스턴스 객체화
    private String name;


    private Company() {}//생성자는 private
        public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        } // 스태틱이 아님에도 주소 호출이 가능. 주소값이 있기 때문.싱클톤"

        return instance; // 마지막은 리턴 인스턴스

    }
}
