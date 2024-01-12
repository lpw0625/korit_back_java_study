package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class ClassMain {
   /* public static void main(String[] args) throws Exception {


            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("이평원").build());
            members.add(Member.builder().name("이진원").build());
            members.add(Member.builder().name("이주원").build());
            members.add(Member.builder().name("이중원").build());

            MemberService memberService = new MemberServiceImpl();
            try {
                memberService.printMemberList(members);
                memberService.printMemberList(members); // << 기능 //expection으로 하여 빨간줄이 뜨면 무조건 예외처리이다.

            } catch ( Exception e) {
        //  System.out.println("프로그램 종료 ");

    }
}
