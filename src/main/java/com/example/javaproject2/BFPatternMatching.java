package com.example.javaproject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BFPatternMatching {
    public void sollution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine();
        String pattern = reader.readLine();

        int tarIdx = 0;
        int patIdx = 0;

        while(tarIdx < target.length() && patIdx < pattern.length()) {
            // target[tarIdx]가 pattern[patIdx]와 다를 경우
            if (target.charAt(tarIdx) != pattern.charAt(patIdx)) {
                //tarIdx를 patIdx가 여태까지 이동한만큼 되돌린다.
                tarIdx -= patIdx;
                patIdx = -1;
            }
            //다음칸으로 이동한다
            tarIdx += 1;
            patIdx += 1;
        }
        if (patIdx == pattern.length()) {
            //어디에서 찾았는지 출력
            System.out.println(tarIdx - patIdx);
        } else {
            System.out.println("404 Not Found");
        }
    }

    public static void main(String[] args) {

        System.out.println();
    }
}
