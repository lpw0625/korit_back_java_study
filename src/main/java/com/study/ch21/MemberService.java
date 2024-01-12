package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {
    public void printMemberService(ArrayList<Member> members) throws Exception; // 이 메소드는 무조건 예외처리를 해야한다 강제성.
}
