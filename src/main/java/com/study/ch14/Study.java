package com.study.ch14;

import java.util.Objects;

    /*
    odject 클래스
     */

// 모든 클래스는 object를 상속 받는다. 예외 없다. 생략이 되어 있을 뿐.
// 다른 클래스는 다중 상속이 안되며 object 클래스만 가능하다.
public class Study {

   private String name;
     private String address;

    public Study(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Study{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Study)) return false;
        Study study = (Study) o;
        return Objects.equals(name, study.name) && Objects.equals(address, study.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}





// 기존에 클래스뒤에 s가 붙으면 도구의 역할을 한다.
// Objects : 오브젝트 클래스와 관련된 모든게 담겨진 클래스
// equals : 스태틱 클래스. 두개의 클래스가 같은지 비교한다. 서로 주소가 다른 상황
// 주소는 다르지만 그 안에 있는 값이 같으면 true로 보겠다.


// 서로 같으면 주소가 같다. 같은 객체라는 뜻 이 메소드가 검출 되었을때 true로 출력

// 주소가 다른데 한쪽이 null이거나 주소가 다른데 서로 다른 클래스로 만들어지면 false.
// 모든 클래스는 object로 업 캐스팅이 가능하다. 따라서 매개 변수가 들어간다.
