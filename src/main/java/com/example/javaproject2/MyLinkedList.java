package com.example.javaproject2;

public class MyLinkedList {

    private static class Node {
        private int data;
        private Node link;
        private Node start;
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }

        //제일 뒤에 data 추가
        public void add(int data) {
            //1. start == null (LinkedList가 비어있을 때)
            if (start == null)
                start = new Node(data);
            else {
                //2. link가 null인 노드가 나올때까지
                Node head = start;
                while (head.link != null) {
                    head = head.link;
                }
                //while문이 끝났을 때, head.link = null (마지막 노드이다)
        head.link = new Node(data);
    }
}

    //idx번째 데이터 회수 및 노드 제거
    public int remove(int idx) {
            int i = 0;
            Node prev = start;
            Node head = start;
            while (i < idx) {
                prev = head;
                head = head.link;
                i++;
            }
            prev.link = head.link;
            return head.data;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("[");
            Node head = start;
            while (head != null) {
                builder.append(head.data);
                //link가 Null이 아니라는건 뒤에 원소가 더 있다
                if (head.link != null) {
                    builder.append(", ");
                }
                head = head.link;
            }
            builder.append("]");
            return builder.toString();
        }

        public static void main(String[] args) {
            MyLinkedList linkedList = new MyLinkedList();
        }
    }
}
