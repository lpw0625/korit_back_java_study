package com.study.ch19;


import lombok.Data;

@Data
public class Student {
    private String name;
    private String address;
    private  int age;


    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    public static StudentBuilder studentInfo() { // 2번

        return  new StudentBuilder();
    }

    public static class StudentBuilder { // 1번

        private String name;
        private String address;
        private int age; // 4번 스튜던트 객체 생성

        public Student build() {

            return new Student(name,address,age); }

        public StudentBuilder name(String name) { // 섹터 생성 100.name("a)v 3번
            this.name = name; // a
            return  this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {

            this.age = age;
            return  this;


        }

    }


}
