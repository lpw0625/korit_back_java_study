package com.study.exam2;

import java.util.List;

public class SubjectService {
    private List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;

    }

    public void showSubjects() {
        int length = 3;

        for (int i = 0; i < length; i++) {
            try {

            } catch (ArrayIndexOutOfBoundsException s) {
                System.out.println("예외가 발생하였습니다!");
            }

            System.out.println(subjects.get(i));

        }


    }

}
