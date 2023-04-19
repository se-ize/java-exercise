package com.example.javaproject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        for(int i=1; i<3; i++) {
            System.out.println("line " + i + " = " + br.readLine());
        }
    }

    public void plusTwoNums() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int i = Integer.parseInt(br.readLine());

        System.out.println(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()));
    }
}
