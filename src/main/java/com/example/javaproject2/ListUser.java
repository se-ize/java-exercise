package com.example.javaproject2;

import java.util.*;

public class ListUser {
    public static void main(String[] args) {
       List<User> users = new ArrayList<>();

       User user1 = new User("김미미", "010-1234-1234", 37);
       users.add(user1);

       User user2 = new User("김나나", "010-1234-1235", 14);
       users.add(user2);

       for(User user : users) {
           System.out.printf("%sㄴ미의 전화번호는 %s입니다\n", user.getName(), user.getPhoneNumber());
       }
    }
}
