package com.example.javaproject2;

import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {

        Boolean win = false;

        do {
            Scanner sc = new Scanner(System.in);
            String[] data = sc.nextLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            rsp(a, b, win);
        } while (win = true);

        System.out.println("끝났습니다.");

    }

    public static void rsp(int a, int b, Boolean win) {
        if (a == 0 && b == 1) {
            win = true;
        } else if (a == 1 && b == 2) {
            win = true;
        } else if (a == 2 && b == 0) {
            win = true;
        }
    }
}
