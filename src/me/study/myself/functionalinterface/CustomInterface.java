package me.study.myself.functionalinterface;

/*
함수형 인터페이스는 1개의 추상 메서드를 갖는 인터페이스
 */
@FunctionalInterface
public interface CustomInterface<T> {
    // abstract method
    T myCall();

    // default method
    default void printDefault() {
        System.out.println("Hello Default");
    }

    // static method
    static void printStatic() {
        System.out.println("Hello Static");
    }
}
