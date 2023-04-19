package com.example.javaproject2;

import java.util.Scanner;

public class ScannerEx {
    public void plusTwoNumbers(int val1, int val2) {

    }
    public void readTwoNumbersandPlus() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        for (int i=1; i<3; i++){
            answer += sc.nextInt();
        }
        System.out.println(answer);
    }
}
