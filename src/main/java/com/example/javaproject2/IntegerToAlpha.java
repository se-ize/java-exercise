package com.example.javaproject2;

public class IntegerToAlpha {
    public String itoa(int value) {
        StringBuilder answerBuilder = new StringBuilder();
        while(value > 0) {
           char digitChar = (char)(value % 10 + '0');
           answerBuilder.append(digitChar);
           value /= 10;
        }
        return answerBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha itoa = new IntegerToAlpha();
        System.out.println(itoa.itoa(1234) + itoa.itoa(56789));
    }
}
