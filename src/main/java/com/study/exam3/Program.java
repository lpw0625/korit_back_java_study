package com.study.exam3;

public abstract class Program {

    public abstract void develop();

}

class Java extends Program {
    @Override
    public void develop() {

        System.out.println("자바 프로그램을 개발합니다.");
    }

    static class GarbageCollection extends Program {

        @Override
        public void develop() {


            System.out.println("메모리를 정리 합니다.");
        }

    }


    static class C extends Program {
        @Override
        public void develop() {
            System.out.println("C프로그램을 개발합니다.");

        }

        static class DefineStructure extends Program {

            @Override
            public void develop() {

                System.out.println("구조체를 정의합니다.");
            }


        }


    }
}



