package com.example.javaproject2;

import java.util.Optional;

public class OptionalStr {
    public static String nullableMethod() {
        return null;
    }
    public static void main(String[] args) {
//        String result = nullableMethod();
//        Optional<String> optionalValue = Optional.ofNullable(result);

        String value = "Hello, World!";
        // 데이터를 가지고 있는 Optional 객체
        Optional<String> optionalValue = Optional.of(value);

        // 데이터를 가지고 있는지 판단한 뒤
        if (optionalValue.isPresent()) {
            // 데이터가 있으면 실행하는 코드
            System.out.println("Value is present: " + optionalValue.get());
        } else {
            // 데이터가 없으면 실행하는 코드
            System.out.println("Value is not present");
        }


        // 데이터를 가지지 않는 Optional 객체
        Optional<String> optionalNull = Optional.of(null);

        if (optionalValue.isPresent()) {
            System.out.println("Value is present" + optionalValue.get());
        } else {
            System.out.println("Value is not present");
        }

        String resultOpt = optionalNull.orElse("Default Value");
        System.out.println("Value (orElse): " + resultOpt);

    }
}
