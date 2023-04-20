package com.example.javaproject2;

import java.util.Scanner;

public class ScannerWithGuide {
    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요.");
        System.out.print("첫 번째 숫자: ");
        System.out.println("첫 번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
        System.out.print("두 번째 숫자: ");
        System.out.println("두 번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
    }
}
