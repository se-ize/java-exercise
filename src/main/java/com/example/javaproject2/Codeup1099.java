package com.example.javaproject2;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int x = 1;
        int y = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        arr[x][y] = 9;

        while(true) {
//           if(arr[x][y] == 2) {
//               arr[x][y] = 9;
//               break;
//           }
           if(arr[x][y+1]==1) {
               if(arr[x+1][y]==1) break;
               else x++;
           } else  y++;

           if(arr[x][y]==2) {
               arr[x][y] = 9;
               break;
           }

           arr[x][y] = 9;
        }


            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }