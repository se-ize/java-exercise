package com.example.javaproject2;

import java.util.*;

public class TwoDimArrFillRow {

    public static void fillRow(int[][] arr, int rowNum) {
        for(int i = 0; i < 5; i++){
            arr[rowNum][i] = 1;
        }
        printTwoDimArr(arr);
    }
    public static void printTwoDimArr(int[][] arr) {
        for(int i = 0; i < 5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillRow(arr, 1);

        int[] arr2 = {2, 1, 4, 8, 7, 6};
        int temp = arr2[0];
        arr2[0] = arr2[1];
        arr2[1] = temp;

        System.out.println(Arrays.toString(arr2));
    }
}
