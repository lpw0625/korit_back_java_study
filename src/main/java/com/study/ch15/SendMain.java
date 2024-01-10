package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "이평원");
        //send(sendData1);

        // 알맞은 자료형을 꺽새 괄호 안에 넣으면 된다.
        // 앞에서 데이터 정리를 하고 있기 때문에 뒤는 생성될떄 생략 해도 된다.
        // 단, 양쪽 다 빼면 어느 타입인지 정의가 안되기 때문에 앞쪽엔 넣어야 한다.
        // 이것이 제네릭의 기초.
        // 꺽새 괄호가 있다는건 string으로 찍어낼수 있는 틀과 member로 찍어낼 수 잇는 틀이기 때문에
        // 두개의 자료형은 실질적으로 다르다.

        SendData<?> sendData2 = new SendData<>(200, new Member("이평원 ", "01029091213"));
      // send(sendData2);
      SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("이평원", "010290912132"));
      send(sendData3);
    }

    public static void send(SendData<?  super VipMember> sendData) {

        // extends member : 맴버 클래스에게서 상속받은 녀석들만 넣어라.
        // super vipmember : vip맴버와 vip맴버의 부모들까지만 넣어라.
        // 넣고자 하는 변수가 다를 경우 어떤 타입이 들어올지 모르겠다
        // 라고 나온개 ? ?는 와일드카드라는 의미를 가지고 있다.
        // 리턴 자료형에 리턴 데이터가 어떤 자료형으로 리턴이 될지 모를떄 쓴다,
        // 와일드 카드에 제약을 넣을 수 있다.
        // 와일드 카드는 매개 변수 전달용으로 쓰인다.
        // 클래스의 변수들이 변할 수 있다.
        // 제네릭을 먼저 이해하는게 중요
        // 제네릭은 타입을 여러 개로 받아올 수 있다.
        // 제네릭 타입으로 일반 자료형은 쓸수가 없다.

        sendData.send();
    }
}


// 업캐스팅으로 오브젝트로 들어온 상태에서 다운 캐스팅으로 해야 그 안에 들어있는 객체를 쓸 수 있다.

// 매번 우리가 다운 캐스팅을 해줘야 하는 상황이 온다.

//이때 제네릭 타입을 쓰게 된다.