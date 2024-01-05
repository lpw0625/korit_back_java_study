package com.study.ch08.member;

public class MemberRepository {

    int insert(Member[] members, Member member){
        for(int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }
        // 6번째 줄 코드는 add 클래스에서 10,20 값을 Member 공간에 넣는데
        // 3개의 공간이 담긴 메모리 중 첫번째만 쓰고 나머지 두개의 공간은 버리는 구조이다
        // 이걸 ㄱ
        // 같은 배열의 주소를 써서 유지해야 하므로 위의 코드는 잘못 되었다.
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1; // 한 건 등록 되었다.
    }
}
