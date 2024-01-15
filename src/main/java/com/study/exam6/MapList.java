package com.study.exam6;

import java.util.*;

public class MapList {

    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String,Object>>();

       Map<String,Object> map = new HashMap<String,Object>();
       map.put("name", "홍길동");
       map.put("rating","vip");
       map.put("age","30");
      customers.add(map);



    Map<String,Object> map2 = new HashMap<String,Object>();
    map2.put("name", "김기영");
    map2.put("rating","gold");
    map2.put("age", "35");
        customers.add(map2);


for (Map<String, Object> customer : customers) {

    System.out.println(customer.get("name") + "");
    System.out.println(customer.get("rating") + "");
    System.out.println(customer.get("age") + "");

}

    }


}
