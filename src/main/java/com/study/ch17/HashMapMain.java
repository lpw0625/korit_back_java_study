package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();


    map.put("username", "이평원");
    map.put("email", "dlvuddnjsss@gmail.com");
    map.put("address", "양산");
    map.put("Phone", "01029091213");


        System.out.println(map);
        System.out.println(map.get("email"));

        // map이 이렇게 데이터를 들어간다 키와 벨류로 들어간다
        // map 키와 벨류가 있다. 키값은 중복이 안되다.
        // 벨류는 중복이된다.


}

}
