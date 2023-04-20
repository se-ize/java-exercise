package com.example.javaproject2;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 2; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j ,i * j);
            }
        }
    }
}
