package com.example.javaproject2;

import java.util.Scanner;

public class codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        rsp(a, b);
    }
    public static void rsp(int a, int b) {
        if (a == 0 && b == 1) {
            System.out.println("win");
        } else if (a == 1 && b == 2) {
            System.out.println("win");
        } else if (a == 2 && b == 0) {
            System.out.println("win");
        } else if (a == b) {
            System.out.println("tie");
        } else {
            System.out.println("lose");
        }
    }
}
