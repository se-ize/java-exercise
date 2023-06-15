package com.example.javaproject2;

public class AlphaToInteger {
    public int atoi(String value) {
        int result = 0;
//        char data = 48;
//        System.out.println(data);
//        System.out.println('1' - '0');
        boolean negative = false;
        int i = 0;
        if (value.charAt(i) == '-') {
            negative = true;
            i++;
        }
//        negative = value.charAt(i) == '-';
        //문자열을 한글자(한자리씩) 확인
        for (; i < value.length(); i++) {
            //자릿수 변환
            result *= 10;
            //글자를 숫자로 변환
            result += value.charAt(i) - 48;
//           result += value.charAt(i) - '0';
        }

        if (negative) result *= 1;
        return result;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println(atoi.atoi("12345"));
        System.out.println(atoi.atoi("-4291"));
    }
}
