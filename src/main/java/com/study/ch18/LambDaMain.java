package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambDaMain {
    public static void main(String[] args) {

        Runnable start = () -> {

            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다.");
            int a = 20;
            int b = 30;
            System.out.println("a + b = " + (a + b));


        };

        start.run();

        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in); // 스캐너 객체
        // scannerInstance.get().nextLine();

        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);

        };

        setName.accept("이평원");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = System.out::println;
        action.accept("이평원");
        strList.forEach(System.out::println);


        strList.forEach(System.out::println);

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andthen에 넣은 함수 " + num);
            return " 문자열 " + num;
        }).apply(10); // "." : 받은 객체 주소 값.

        System.out.println(result2);
        //Predicate<T> : 조건식일때 사용.

        Predicate<Integer> filterFx = num -> num % 2 == 0; // fiiter(fx)

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);

        }
        System.out.println(numList);

        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        // 참이면 꺼내서 다른 공간(이것도)에 다시 넣는다. 거짓이면 버린다. 리스트를 카피공간에 넣고, 다시 다른 스트림 공간에 넣는다.
        // Collerctors를 List형으로 바꾼후 스트림을 리스트
        // filter의 자료형은 fredicate이다.


        List<Integer> newList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2); //  스트림에 있는걸 리스트로 변경 후 담는다.

        // 위의 리스트를 다시 스트림으로 카피한다?. stream은 반복을 위해서 쓴다. 자료형이 function이 들어간다. 매개변수에 리턴까지 있는게 function인데
        //첫번째 num이 들어와서 2를 곱하면 4인데 새로운 스트림에 넣는다. 다시 4*2 8이 넣는다. 기존 값에다가 2를 곱해서 새로운 것에 넣는다.
        //연산처리를 해준다. 스트림에 있는 것을 리스트로 바꾼후에 새로운 리스트에 넣는다.
        //



    }


}
