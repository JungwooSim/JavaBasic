package me.study.myself.predicate;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Type T 인자를 받고 boolean 을 리턴하는 함수형 인터페이스
 */
public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = (a) -> a.equals("b");

        System.out.println(predicate.test("a")); // false
        System.out.println(predicate.test("b")); // true

        Predicate<Integer> predicate1 = (num) -> num > 10;
        Predicate<Integer> predicate2 = (num) -> num < 20;

        /*
        and() 는 predicate 객체를 연결하여 and 조건을 만들어 준다.
         */
        System.out.println(
                predicate1.and(predicate2).test(25) // false
        );

        System.out.println(
                predicate1.and(predicate2).test(15) // true
        );

        /*
        or() 는 predicate 객체를 연결하여 or 조건을 만들어 준다.
         */

        Predicate<Integer> predicate3 = (num) -> num > 10;
        Predicate<Integer> predicate4 = (num) -> num < 0;

        System.out.println(
                predicate3.or(predicate4).test(5) // false
        );

        System.out.println(
                predicate3.or(predicate4).test(-5) // true
        );

        System.out.println(
                predicate3.or(predicate4).test(15) // true
        );

        /*
        isEqual() 는 Stream() 에서 사용될 수 도 있고, 인자로 전달된 객체와 같은지 확인
         */

        Stream<Integer> stream = IntStream.range(1, 10).boxed(); // int, long, double 요소를 Integer, Long, Double 요소로 박싱 후 stream 생성

        stream.filter(Predicate.isEqual(5))
                .forEach(System.out::println);

        /*
        negate() Predicate()가 리턴하는 값의 반대 값을 리턴
         */

        Predicate<Integer> predicate5 = (num) -> num > 10;
        Predicate<Integer> predicate6 = predicate5.negate();

        System.out.println(
                predicate5.test(100) // true
        );

        System.out.println(
                predicate6.test(100) // false
        );

    }
}
