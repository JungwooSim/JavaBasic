package me.study.lambda_stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());
        System.out.println();

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = "+ result1);
        System.out.println("result2 = "+ result2);
        System.out.println();

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3=%d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0); // 0 을 저장
        OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체를 생성

        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false

        System.out.println(optInt1.getAsInt()); // 0
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);
        System.out.println("optInt1.equals (optInt2)? " + optInt1.equals(optInt2));

        Optional<String> opt = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.empty();

        int result3 = optStrToInt(Optional.of("123"), 0);
        int result4 = optStrToInt(Optional.of(""), 0);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    static int optStrToInt(Optional<String> optStr, int defaultValue) {
        try {
            return optStr.map(Integer::parseInt).get();
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
