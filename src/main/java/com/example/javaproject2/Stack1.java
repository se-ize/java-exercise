package com.example.javaproject2;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {

    private int[] arr_stack = new int[10000];
    private int pointer = 0;
    
    public Stack1() {
    }

    public void push(int value) {
        this.arr_stack[pointer++] = value;
        System.out.println(Arrays.toString(arr_stack));
        System.out.println("pointer = " + pointer);
    }

    public int pop() {
        if(!isEmpty()) {
            return arr_stack[--pointer];
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr_stack[pointer-1];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop());
        st.push(20);
        System.out.println(st.peek());
    }
}
