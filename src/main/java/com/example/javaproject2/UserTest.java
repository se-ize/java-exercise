package com.example.javaproject2;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("김서현", "010-0000-0730", 23);
        user1.name = "김서현";
        user1.phoneNumber = "010-0000-0730";
        user1.age = 23;
        System.out.printf("%s님은 성인입니까? %s\n", user1.name, user1.isAdult());

        User user2 = new User("정세운","010-0000-0531", 25);
        user2.name = "정세운";
        user2.phoneNumber = "010-0000-0531";
        user2.age = 25;
        System.out.printf("%s님은 성인입니까? %s\n", user2.name, user2.isAdult());

        User user3 = new User("이혜인","010-0000-0000", 14);
        user3.name = "이혜인";
        user3.phoneNumber = "010-0000-0000";
        user3.age = 14;
        System.out.printf("%s님은 성인입니까? %s\n", user3.name, user3.isAdult());
    }
}
