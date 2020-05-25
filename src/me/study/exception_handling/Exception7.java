package me.study.exception_handling;

public class Exception7 {
    public static void main(String[] args) {
        try {
            method1();
        } catch(Exception e) {
            System.out.println("main메소드에서 예외가 처리되었습니다.");
        }
    }

    private static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메소드에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}
