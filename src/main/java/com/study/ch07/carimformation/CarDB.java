package com.study.ch07.carimformation;

public class CarDB {

    void insertCarDB(Carimfor carimfor){
        System.out.println("Db에 insert 완료.");
        System.out.println(" insert 내용.");
        System.out.println("name : " + carimfor.name);
        System.out.println("system : " + carimfor.system);
        System.out.println(" Price : " + carimfor.price);
        System.out.println(" HorsePower : " + carimfor.horsepower);
        System.out.println();
    }
}
