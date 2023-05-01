package com.example.javaproject2;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sixteen = Integer.parseInt(s, 16);

        for(int i=1; i<=15; i++){
            int result = sixteen * i;
            String hexResult = Integer.toHexString(result).toUpperCase();
            System.out.printf("%S*%X=%S\n", s, i, hexResult);
        }
    }
}
