package com.example.javaproject2;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacherName = "정세운";
        classInSchool.students = new Student[1];
        classInSchool.students[0] = new Student();
        classInSchool.students[0].name = "김서현";
        classInSchool.students[0].phonenumber = "010-0000-0731";
        classInSchool.students[0].age = 23;
        classInSchool.students[0].print();

    }
}
