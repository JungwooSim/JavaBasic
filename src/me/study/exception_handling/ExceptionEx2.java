package me.study.exception_handling;

public class ExceptionEx2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 고의로 장애 발생시킨다.
            System.out.println(4); // 위 라인에서 장애로 인해 출력되지 못한다.
        } catch(ArithmeticException ae) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
