package com.study.ch06;

public class For2 {
    public static void main(String[] args) {
        /*
        0,1,2,3,4

        0,1,2,3,4
        5,6,7,8,9,
         */

        /*for (int i = 0; i < 5; i++) {
        System.out.print(i);
            if(i % 5 != 4) {
        System.out.print(", ");

            }
                    }
                    System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
        System.out.print(i);
            if(i % 5 !=4) { // 조건 비교 0일때 나머지는
        System.out.print(", ");
            }
                    if(i % 5 == 4) { // 나머지가 4일때 출력 0이면 출력이 안된다.
        System.out.println();
            }
                    }



                    }
                    }
                   */
        int n = 5;
        for (int i = 0; i < n; i++) {
            int rv_i = n - 1 - i; // 중요 n번 반복
            System.out.print(rv_i);
            if (rv_i % 5 != 0) { // 5로 나누었을때 나머지가 0이므로
                System.out.print(", ");

            }

            if (rv_i % 5 == 0) { // 5로 나누었을때 나머지가 0이므로
                System.out.println();

            }


        }
    }
}


