package me.study.exception_handling;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch(SpaceException e) {
            System.out.println("에러 메시지 : "+e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : "+me.getMessage());
            me.printStackTrace();
            System.gc(); // Garbage Collection을 수행하여 메모리는 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles(); // 프로그램 설치에 사용된 임시 파일을 삭제
        }
    }

    private static void deleteTempFiles() {
    }

    private static void copyFiles() {

    }

    private static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    private static boolean enoughMemory() {
        // 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
        return true;
    }

    private static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 얼마나 있는지 확인하는 코드
        return false;
    }

    private static class SpaceException extends Throwable {
        public SpaceException(String msg) {
            super(msg);
        }
    }

    private static class MemoryException extends Throwable {
        public MemoryException(String msg) {
            super(msg);
        }
    }
}
