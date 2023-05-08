package com.example.javaproject2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<r; i++){
            for(int j=0; j<g; j++){
                StringBuilder line = new StringBuilder();
                for(int k=0; k<b; k++){
                    line.append(i).append(" ").append(j).append(" ").append(k).append("\n");
                    count++;
                }
                bw.write(line.toString());
                bw.flush();
            }
        }

        System.out.printf("%d", count);

    }
}
