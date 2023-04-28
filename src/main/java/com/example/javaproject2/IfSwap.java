package com.example.javaproject2;
import java.util.*;
public class IfSwap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};
        if(arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
