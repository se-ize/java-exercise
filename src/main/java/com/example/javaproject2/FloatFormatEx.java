package com.example.javaproject2;

import java.util.Arrays;
import java.util.Scanner;

public class FloatFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = n; j < i * j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



//        String[] data = sc.next().split(" ");
//
//
//        System.out.printf("%d + %d = %d\n", a, b, a+b);
//        System.out.printf("%d - %d = %d\n", a, b, a-b);
//        System.out.printf("%d * %d = %d\n", a, b, a*b);
//        System.out.printf("%d / %d = %d\n", a, b, a/b);
//        System.out.printf("%d %% %d = %d", a, b, a%b);


//        int c = Integer.parseInt(data[2]);
//        String s = sc.next();
//        char c = s.charAt(0);
//        String[] data = sc.nextLine().split(" ");


        //        System.out.printf("%.1f", 0.5);
    }
}
