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
}
