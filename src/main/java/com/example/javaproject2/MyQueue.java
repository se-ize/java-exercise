package com.example.javaproject2;

public class MyQueue {
    private final int[] arr = new int[4];
    private int front = -1;
    private int rear = -1;

    public MyQueue() {
    }

    //데이터 추가
    public void enQueue(int x) {
        //rear + 1가 배열의 크기만큼 되면
        if (rear == arr.length - 1) {
            throw new RuntimeException("queue is full");
        }
        //rear를 하나 증가시킴
        rear++;
        //arr[rear]에 data 할당
        arr[rear] = x;
    }

    //데이터 회수
    public int deQueue() {
        //front == rear일 때 큐가 비어있음
        if (front == rear) {
            throw new RuntimeException("queue is empty");
        }
        //front를 하나 증가시킴
        front++;
        //arr[front]의 값을 반환
        return arr[front];
    }

    //큐가 비어있는지 확인
    public boolean isEmpty() {
        return front == rear;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front + 1];
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
//        queue.enQueue(4);
        System.out.println(queue.deQueue());
        queue.enQueue(5);
        System.out.println(queue.deQueue());
    }
}
