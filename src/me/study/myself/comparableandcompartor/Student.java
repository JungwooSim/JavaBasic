package me.study.myself.comparableandcompartor;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    int age;
    int className;

    Student(int age, int classNumber) {
        this.age = age;
        this.className = classNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
//        // this 가 더 큰 경우 양수
//        if (this.age > o.age) {
//            return 1;
//        }
//
//        // 같을 경우 0
//        if (this.age == o.age) {
//            return 0;
//        } else {
//            // 파라미터의 값이 더 클 경우 음수
//            return -1;
//        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
