package com.example.javaproject2;
import java.util.Scanner;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String time = "휴진";

        switch(day) {
            case "월", "화", "수", "목", "금": time = "09:30-20:00"; break;
            case "토", "일": time = "09:00-15:00"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
