package me.study.exception_handling;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (MemoryException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            se.printStackTrace();
            throw ie;
        } catch (SpaceException me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.printStackTrace();
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
        // 임시 파일을 삭제하는 코드
    }

    private static void copyFiles() {
        // 파일들을 복사하는 코드
    }

    private static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
//            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }

    private static boolean enoughMemory() {
        // 설치하는 필요한 메모리공간이 있는지 확인하는 코드
        return true;
    }

    private static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드
        return false;
    }

    private static class SpaceException extends Exception {
        public SpaceException(String msg) {
            super(msg);
        }
    }

    private static class MemoryException extends Exception {
        public MemoryException(String msg) {
            super(msg);
        }
    }

    private static class InstallException extends Exception{
        public InstallException(String msg) {
            super(msg);
        }
    }
}
