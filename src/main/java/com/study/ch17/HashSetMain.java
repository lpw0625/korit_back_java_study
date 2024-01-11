package com.study.ch17;

import java.util.*;

public class HashSetMain { //

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("이평원");
        nameList.add("이평이");
        nameList.add("이평삼");
        nameList.add("이평사");
        System.out.println(nameList);

        System.out.println(names);

        String findName = null;


        for (String name : names) { // Set을 하는 순간 값을 하나하나 순서대로 가지고 와야한다.
            if(name.equals("이평사")) {

                ArrayList<String> newNameList = new ArrayList<>();
                newNameList.addAll(names);
                newNameList.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Objects.hash(o1) - Objects.hash(o2);

                        }

                });

                System.out.println(newNameList.get(1));

        }
    }

    System.out.println(findName);
}

}


