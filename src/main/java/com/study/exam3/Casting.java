package com.study.exam3;

public class Casting {
    public static void main(String[] args) {
        Program[] programs = new Program[4];
        programs[0] = new Java();
        programs[1] = new Java.C();
        programs[2] = new Java.GarbageCollection();
        programs[3] = new Java.C.DefineStructure();

        System.out.println();
        for (int i = 0; i < programs.length; i++) {
            programs[i].develop();
        }
    }
}
