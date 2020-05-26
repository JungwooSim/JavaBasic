package me.study.exception_handling.practice_problem;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }

}
class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    public UnsupportedFunctionException(String message, int errCode) {
        super(message);
        ERR_CODE = errCode;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "["+ERR_CODE+"]"+super.getMessage();
    }
}
