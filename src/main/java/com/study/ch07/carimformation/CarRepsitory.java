package com.study.ch07.carimformation;

public class CarRepsitory {

    void saveCarimfor (Carimfor carimfor) {
        CarDB carDB = new CarDB();

        carDB.insertCarDB(carimfor);
    }
}
