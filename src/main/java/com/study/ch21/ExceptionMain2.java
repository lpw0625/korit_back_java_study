package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("이평원");
        nameList.add("이평이");
        nameList.add(null); // null에는 equals라는 메소드가 없다.
        nameList.add("이평사");

        try {

            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                try {
                    if (name.equals("이평사")) {
                        System.out.println("이평사를 첮음!!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException 발생");


                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) { // 제일 마지막에는 예상지도 못한 예외가 터질 수 있기에
            e.printStackTrace(); // 결국엔 Exception을 상속 받기에 최종병기로 하는것 .
        } finally {
            System.out.println("이거는 무조건 실행됨");
            // try 부분에 예외가 안터져도 실행
            // catch 부분에 예외가 터져도 실행.
            // 임시저장 개념.
        }

        System.out.println("프로그램 정상 종료");


    }
}


// 자바에서 일어나는 예외처리는 throwable로 처리를 해주면 된다.
// 프로그램이 실행되고 문법 오류가 있으면 안된다.
// 문법적인 오류 : 그냥 오류
// 아예 컴파일도 되기전에 오류가 있는 상태.
// 실행된 이후에 오류가 있는것.
// 어떠한 파일을 불러와야되지만 실행이 되는 경우,인터넷에 연결이 되어야 하는 경우
// IoInception: 입력장치와 출력장치가 없으면 에외
// 런타임인셉션 : 실행은 되지만 코드가 잘못짜서 오류가 나는것