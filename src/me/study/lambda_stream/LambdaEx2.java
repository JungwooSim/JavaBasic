package me.study.lambda_stream;

@FunctionalInterface
interface MyFunctionSecond {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunctionSecond f = () -> {};
        Object obj = (MyFunctionSecond) (() -> {});
        String str = ((Object) (MyFunctionSecond) (() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunctionSecond) (() -> {}));
        System.out.println(((Object) (MyFunctionSecond) (() -> {})).toString());
    }
}
