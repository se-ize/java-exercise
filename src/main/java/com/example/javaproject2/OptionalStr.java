package com.example.javaproject2;

import java.util.Optional;

public class OptionalStr {
    public static String nullableMethod() {
        return null;
    }
    public static void main(String[] args) {
        String result = nullableMethod();
        Optional<String> optionalValue = Optional.ofNullable(result);

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
