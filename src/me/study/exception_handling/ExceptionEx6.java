package me.study.exception_handling;

import java.io.File;

public class ExceptionEx6 {
    public static void main(String[] args) {
        // command line에서 입력받은 값을 갖는 파일을 생성
        File f = createFile("");
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유효하지 않습니다.");
            }
        } catch(Exception e) {
            // fileName이 부적절한 경우, 파일 이름을 "제목없음.txt"로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile(); // 파일 생성
        } catch(Exception e) {
        }
    }
}
