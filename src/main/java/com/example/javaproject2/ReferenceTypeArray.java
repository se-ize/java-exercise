package com.example.javaproject2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김서현";
        students[0].age = 23;
        students[0].phonenumber = "010-0000-0730";
        students[1] = new Student();
        students[1].name = "정세운";
        students[1].age = 25;
        students[1].phonenumber = "010-0531-0831";

        students[0].print();
        students[1].print();

    }
}
