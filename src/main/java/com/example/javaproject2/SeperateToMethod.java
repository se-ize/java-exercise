package com.example.javaproject2;

import java.util.Arrays;

public class SeperateToMethod {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 89}
        };

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        arr[0][0] = 0;
        arr[1][1] = 0;
        arr[1][2] = 0;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}