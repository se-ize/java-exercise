package com.example.javaproject2;

import java.util.Scanner;

public class RemainderSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int answer = 0;
//        while(num > 0) {
//            answer += num % 10;
//            num /= 10;
//        }
//        System.out.println(answer);

        int answer = 0;
        int[] arr = {2, 1, 7, 9};

        for(int i = 0; i < 3; i++) {
            answer = answer + arr[i];
        }
        System.out.printf("answer:%d", answer);
    }
}
