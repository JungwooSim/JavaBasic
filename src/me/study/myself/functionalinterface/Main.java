package me.study.myself.functionalinterface;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        main.customFunctionInterface();

//        main.supplierFunctionInterface();

        main.methodReference();

    }

    private void customFunctionInterface() {
        CustomInterface<String> customInterface = () -> "Hello Custom";

        // abstract method
        System.out.println(customInterface.myCall());

        // default method
        customInterface.printDefault();

        // static method
        CustomInterface.printStatic();
    }

    private void supplierFunctionInterface() {
        Supplier<String> supplier = () -> "Hello";

        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> 100 * 10;
        System.out.println(supplier1.get());
    }

    /*
    참조가능한 메서드는 일반 메소드, static 메소드, 생성자 가 있다.
     */
    private void methodReference() {
        // 기존 람다식
        Function<String, Integer> function = (str) -> str.length();

        System.out.println(
                function.apply("Hello World")
        );

        // 메소드 참조
        Function<String, Integer> function2 = String::length;
        function2.apply("Hello World");

        System.out.println(
                function2.apply("Hello World")
        );


        // Static 메서드 참조
        Predicate<Boolean> predicate = Objects::isNull;
        System.out.println(predicate.test(true));

    }
}
