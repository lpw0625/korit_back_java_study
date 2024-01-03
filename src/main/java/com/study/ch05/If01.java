package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문
        int i = 2;
        if (i > 3) {
            System.out.println("i가 3보다 큽니다.");
        // System.out.println("if문 종료");
            // if라는 조건을 안달았기에 참이든 거짓이든 둘다 뜬다.
      System.out.println("if문 종료");
        // if문을 일일이 달 필요 없이 if 옆과 끝에 중괄호를 둔다.
        // if 문 안에 중괄호를 잘 써야 한다.
            // if문은 중첩이 가능하다.
    } else if(i == 3) { // if문 조건에 거짓일때 else가  실행이 된다.
    System.out.println("i가 3입니다.");

            // else if문 나오는 이유는 중괄호가 제거가 가능했기 때문.
            //
            } else {
                System.out.println("i가 3보다 작습니다.");
            }
        }
        // if 괄호 i값에 true false값이 들어가 있어야 한다.
        // if 문은 연산이 아니다.
        // if 문을 쓰면 밑의 코드를 안써도 된다.

        // String tempStr = i > 3 ? print("i가 3보다 큽니다.") : "";
        // str 값을 돌려줌으로 결과값은 문자열이다.

        // 삼항연산자와 무엇이 다른가를 생각해야한다.
        // 위는 연산이 아닌 출력값이기에 안된다.


    }

   /* public static String print(String str) {
        System.out.println(str);
        return  str;
        //  String tempStr = i > 3 ? print("i가 3보다 큽니다.") : "";
        //  값을 System.out.println(str); 전해준다.
        // return  str; 값을 돌려준다.
        // println은 return에 쓸 수가 없다. 값이 아니기에
    }
    */

