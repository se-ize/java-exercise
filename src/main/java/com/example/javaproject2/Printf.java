package com.example.javaproject2;

public class Printf {
    void Print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
    }

    public static void main(String[] args){
        Printf printf = new Printf();
        printf.Print();
    }
}
