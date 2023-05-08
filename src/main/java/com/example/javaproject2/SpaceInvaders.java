package com.example.javaproject2;

import java.util.Scanner;

public class SpaceInvaders {
    int location; // 멤버 변수 선언
    public void moveLeft() { //왼쪽으로 이동하는 메소드
        location = location - 1; // 기존 값 - 1
    }
    public void moveRight() { //오른쪽으로 이동하는 메소드
        location = location + 1; // 기존 값 + 1
    }
}

//public class SpaceInvadersTest {
//    public static void main(String[] args) {
//        SpaceInvaders si = new SpaceInvaders();
//        si.moveLeft();
//        si.moveRight();
//        System.out.println(si.location);
//    }
//}
//
//public class Greet {
//    public void printHello() {
//        System.out.println("Hello");
//    }
//}
//
//public class GreetTest {
//    public static void main(String[] args) {
//        Greet greet = new Greet();
//        greet.printHello();
//    }
//}
//
//public class ScannerTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(input);
//    }
//}
//
//public class User {
//    String name;
//    String phoneNumber;
//    int age;
//
//    boolean isAdult() {
//        return age >= 18;
//    }
//}
//
//public class UserTest {
//    public static void main(String[] args) {
//        User user1 = new User();
//        user1.name = "김미미";
//        user1.age = 14;
//
//        User user2 = new User();
//        user2.name = "김나나";
//        user2.age = 37;
//
//        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
//        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
//    }
//}