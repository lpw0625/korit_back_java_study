package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray; // 제네릭을 통해서 배열 자료형을 변환

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 기존에 있던 배열보다 하나 더 많아야 한다.
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;// 데이터 다 옮긴 배열의 주소로 옮긴다.

        // newarray에 기존에 있던 strArray가 대입이 되었기에 strarray는 낙동강 오리알 신세가 되어 버려짐
        strArray[strArray.length - 1] = str; // 새로운 배열의 크기.            // 0에다가 이 값을 넣겠다. 무조건 배열의 끝에 넣겠다.
        // 배열은 변하지 않기에 새로 만들어야 한다.// 기존의 데이터를 새로운 배열에 옮겨줘야 한다
    }


    // 기존거보다 하나 적은 배열을 만듬.
    // 매개변수로 받은 인덱스의 값을 기준으로 작은 index들은 그대로 옮기고 큰 인덱스들을 -1하여 옭민가.
    //strArray의 배열을 새로운 배열로 바꾼다.
    public void remove(int index) {
    String[] newArray = new String[strArray.length - 1];
    for (int i = 0; i <newArray.length; i++) {
        newArray[i] = strArray[i < index ? i : i + 1];

    }
    strArray = newArray;

}

public String get(int index) {
        return strArray[index];
}
    public int indexof(String str) {
        if(str == null) {
            return -1;
        }
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if (i < strArray.length - 1) {
                result += " , ";
            }
        }

        result += " 1 ";

        return result;
    }
}

