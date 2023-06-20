package com.example.javaproject2;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //offer, add : enQueue 메소드
        queue.offer(1);
        queue.add(2);

        //remove, poll : deQueue 메소드
        //Queue가 비어있다면
        //remove - 예외 발생, poll - null 반환
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        //element, peek : peek 메소드
        //Queue가 비어있다면
        //element - 예외 발생, peek - null 반환
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
