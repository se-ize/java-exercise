package com.example.javaproject2;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
//        int asciiCode1 = is.read();
//        int asciiCode2 = is.read();

        for(int i=0; i<2; i++){
            System.out.println(is.read());
        }
    }
}
