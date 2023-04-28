package com.example.javaproject2;
import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = solution(num);
        System.out.println(result);
    }
    public static int solution(long num) {
        int count = 0;
        while(num != 1) {
            if(num % 2 == 0){
                num /= 2;
                count++;
            } else {
                num = num * 3 + 1;
                count++;
            }
            if (count >= 500){
                return -1;
            }
        }
        return count;
    }
}
