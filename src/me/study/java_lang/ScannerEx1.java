package me.study.java_lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.sun.tools.javac.main.Option.CLASSPATH;

public class ScannerEx1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum=" + sum);
        System.out.println("average=" + (double)sum/cnt);
    }
}
