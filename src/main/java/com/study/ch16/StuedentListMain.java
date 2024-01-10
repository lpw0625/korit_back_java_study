package com.study.ch16;

import java.util.ArrayList;

public class StuedentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); //ArrayList
        students.add(new Student("이평원 =", 12));
        students.add(new Student("이평원 =", 13));
        students.add(new Student("이평원 =", 14));
        students.add(new Student("이평원 =", 15));

        System.out.println(students);

        // 중요하다!!!!!!!!!!!!!!!!!!!!!!!!
        // 데이터가 어떻게 흘러가는지 넘어가는지를 알기 위해.


    for(int i = 0; i <students.size(); i++) {

    Student student = students.get(i); // get(i) : 스튜던트 객체
     student.setAge(student.getAge() + 1);
         // 학생들의 묶음에서 그 주소를 타고 가면 섹터가 있다 원래 나이(age)를 가져와서 나이를 하나씩 더라.
            //
            // 스튜던트 객체를 가져와 나이를 지정하겠다. 나이를 하나씩 늘어가는걸로
        }

        // 항상된 for
        for(Student student : students) {
            // 인덱스가 없는 상태  리스트의 변(Stu stu) : 배열의 변수 (stu)
            // 무조건 처음부터 1개씩 더하는 개념 많이 쓰이는 for문 코드. 뒤에가면 람다식으로 바뀜.
            student.setAge(student.getAge() + 1);

            Student[] studentArray = new Student[4];
            for(int i = 0; i < studentArray.length; i++) {
                studentArray[i] = new Student("김준일",31);

            }
            int i = 0;
            for(Student student : studentArray) { // 배열의 주소가 아닌 배열을 담기 위한 임시 값.
               studentArray[i] = new Student("김준일", 31);
               i++;
            }

            for(Student student : studentArray) {
                System.out.println(student);
            }


        }

        for(Student student : studentArray) {
            System.out.println(student);
        }
        students.set(0,  new Student("김준일",31)); // 값에다가 값을 대입하는 형식으로 이런식으로 넣을 수는 없다.

                                                    // 주소에다가 값을 집어넣는 행위가 아니다.
    }
}
