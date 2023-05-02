package com.example.javaproject2;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int h = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int c = Integer.parseInt(data[2]);
        int s = Integer.parseInt(data[3]);

        long fileSize = (long) h * b * c * s;

        double mb = (double) fileSize / Math.pow(2, 23);

        System.out.printf("%.1f MB", mb);

    }
}
