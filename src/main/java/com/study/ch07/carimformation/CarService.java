package com.study.ch07.carimformation;

public class CarService {

    boolean isEmptyString(String str) {


        if (str == null) {
            return true;

        }
        return !str.isBlank();

    }

    void carimformationCarService(Carimfor carimfor) {
        CarRepsitory carRepsitory = new CarRepsitory();

        System.out.println("서비스 데이터 까지 전달함.");

       // carRepsitory.saveCarimfor(carimfor);


    }


}
