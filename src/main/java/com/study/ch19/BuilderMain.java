package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {

            Car.CarBuilder carBuilder = Car.builder();
            Car car2 = carBuilder.build();

            Car car = Car.builder().model("아반떼").color("블랙").build();

            System.out.println(car);

        //Member member = Member.builder()
               // .phone("01029091213");
                 //   .name("이평원");
     //   .build();

            // 빌드업 패턴을 쓸려면 올아규컨스트럭트를 써야하기에 같이 딸려오기 때문





        }

    }

