package com.example.javaproject2;

import java.util.*;

class Students {
    private String code;
    private String testId;
    private String name;

    public Students(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Codeup3108 {

    List<Students> studentsList = new ArrayList<>();

    public Students makeAStudent(String code, String testId, String name) {
        return new Students(code, testId, name);
    }

    private boolean isExist(Students pStudent) {
        for (Students student : studentsList) {
            if (pStudent.getTestId().equals(student.getCode()))
                return false;
        }
        return true;
    }

    public void addAStudent(Students student) {
        if (!isExist(student)) {
            studentsList.add(student);
        }
    }

    public void deleteStudent(Students pStudent) {
        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getCode() == pStudent.getCode()) studentsList.remove(i);
        }
    }

    public void process(Students pStudent) {
        switch (pStudent.getCode()) {
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    public void printStudents() {
        for (Students student : studentsList) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }


    public static void main(String[] args) {
        Codeup3108 codeup3108 = new Codeup3108();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            Students students = codeup3108.makeAStudent(data[0], data[1], data[2]);
            codeup3108.process(students);
        codeup3108.printStudents();
        }

    }
