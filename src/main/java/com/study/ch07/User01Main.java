package com.study.ch07;

public class User01Main {
    public static void main(String[] args) {

        User01 user1 = new User01("abc", "1234");
        User01 user2 = new User01("edf", "5678", "홍길동", "dlvuddnjsss@gmail.com");

        user1.showInfo();
        System.out.println("================================");

        user2.showInfo();
        System.out.println("================================");

        user1.setName("이평원");
        user1.setEmail("lpw0625@gmail.com");

        user1.showInfo();
    }

}
