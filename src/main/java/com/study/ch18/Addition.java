package com.study.ch18;


@FunctionalInterface // 함수형 인터페이스. 메서드를 추가를 하는 순간 추가를 하면 안된다고 빨간줄이 뜬다.
public interface Addition {
    public int add(int x, int y);

}
