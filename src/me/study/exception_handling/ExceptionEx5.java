package me.study.exception_handling;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e;
            // throw new Exception("고의로 발생시킴"); // 위 2줄을 한줄로 가능
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었음.");
    }
}
