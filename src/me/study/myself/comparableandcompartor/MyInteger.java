package me.study.myself.comparableandcompartor;

public class MyInteger implements Comparable<MyInteger> {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyInteger o) {
        return this.value - o.value; // -(this.value - o.value) 수식으로 변경하면 내림차순 가능
    }
}
