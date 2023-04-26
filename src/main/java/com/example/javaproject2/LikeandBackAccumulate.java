package com.example.javaproject2;

public class LikeandBackAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount += 1;
        System.out.println(likeCount);

        likeCount += 1;
        System.out.println(likeCount);

        likeCount -= 1;
        System.out.println(likeCount);

        int myAccount = 1_000_000;
        myAccount -= 500_000;
        System.out.println(myAccount);

        myAccount += 4_000_000;
        System.out.println(myAccount);
    }
}
