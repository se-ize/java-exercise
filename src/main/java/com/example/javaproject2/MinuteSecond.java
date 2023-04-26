package com.example.javaproject2;
import java.util.Scanner;

public class MinuteSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int minute = seconds / 60;
        int remainSeconds = seconds % 60;
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}
