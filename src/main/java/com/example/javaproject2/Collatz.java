package com.example.javaproject2;
import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = solution(num);
        System.out.println(result);
    }
    public static int solution(int num) {
        long n = num;
        int count = 0;
        while(n != 1) {
            if(n % 2 == 0){
                n /= 2;
                count++;
            } else {
                n = n*3 + 1;
                count++;
            }
            if (count >= 500){
                return -1;
            }
        }
        return count;
    }
}
