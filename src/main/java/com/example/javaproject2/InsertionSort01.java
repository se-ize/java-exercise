package com.example.javaproject2;

public class InsertionSort01 {
    public int[] sort(int[] arr, boolean isAscending){
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr,true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
            }
        }
    }
}
