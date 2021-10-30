package me.study.myself.functionalinterface;

public class Main {
    public static void main(String[] args) {
        CustomInterface<String> customInterface = () -> "Hello Custom";

        // abstract method
        System.out.println(customInterface.myCall());

        // default method
        customInterface.printDefault();

        // static method
        CustomInterface.printStatic();
    }

}
