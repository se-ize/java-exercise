package com.example.javaproject2;

import java.util.Scanner;

public class StringSub {
    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(1, 3));
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String line = sc.nextLine();
            String front = line.substring(0, 6);
            String back = line.substring(7, 14);
            System.out.printf("%s%s", front, back);
        }
    }
}
