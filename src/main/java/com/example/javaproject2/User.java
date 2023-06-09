package com.example.javaproject2;

public class User {
    String name;
    String phoneNumber;
    int age;
    Boolean isBalanceSufficient = true;
    Boolean isPaymentSuccess = false;

    boolean isAdult() {
        return age >= 18;
    } //oop적인 코딩

    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
