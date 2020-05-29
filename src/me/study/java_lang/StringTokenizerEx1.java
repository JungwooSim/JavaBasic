package me.study.java_lang;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";

        StringTokenizer st = new StringTokenizer(expression, "x-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
