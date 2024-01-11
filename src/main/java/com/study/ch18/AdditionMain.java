package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {
        // 익명 클래스
        Addition addition1 = new Addition() {

            @Override // 재정의
            public int add(int x, int y) {
                return x + y;
            }
        }; // 객체값이기에 세미클론을 찍는다.

        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10,20));
        System.out.println(addition2.add(30,40));

        //
        Addition addition3 = (int x, int y) -> { // '->'(add 함수명) // if문이랑 형식 똑같다.
            System.out.println("람다식으로 구현한 add 메소드."); // 생성과 재정의를 동시에 함.
            return x + y;
        };
        System.out.println(addition3.add(50,60));
        // 인터페이스 안에 딱 하나의 추상 메소드만 있어야 한다 >> 람다식 조건의 필수 조건. >> 이게 제일 중요

        // 단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.


        // 1. 람다식 매개변수 자료형은 생략할 수있다.

        Addition addition4 = (a,b) -> { // if문이랑 형식 똑같다.

            return  a + b;

        };

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 중괄호를 생략할 수 있다.
        // 단, return은 줄괄호를 생략할 시에 같이 생략한다.

        Addition addition5 = (x, y) -> x + y;
        Viewer viewer = (viewData) ->  {

            System.out.println("화면출력");
        };

        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        // 3. 매개변수가 1개면 메게변수의 괄호를 생략할 수 있다.
        Viewer viewer3 = viewData -> System.out.println("화면출력");



    }
}
