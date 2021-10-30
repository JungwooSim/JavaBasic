package me.study.myself.comparableandcompartor;

import java.util.Arrays;
import java.util.Comparator;

/*
Comparable - compareTo(T o) // 매게변수가 1개
- 자기자신과 다른 객체를 비교
- lang pacakage 에 있기 때문에 import 를 해줄 필요가 없다.

Comparator - compare(T o1, T o2) // 메개변수가 2개
- 두 매게변수를 변수를 비교
- util package 에 있어서 import 필요
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();

//        m.testCompare();
//        m.testComparator();
//        m.testComparator2();
        m.sortTest1();
//        m.sortTest2();
    }

    public void testCompare() {
        Student a = new Student(1, 2);
        Student b = new Student(18, 1);

        int isBig = a.compareTo(b);

        System.out.println("isBig : " + isBig);
        if (isBig > 0) {
            System.out.println("a 객체가 b 객체보다 크다.");
        } else if(isBig == 0) {
            System.out.println("두 객체의 크기는 같다.");
        } else {
            System.out.println("a 객체가 b 보다 작다.");
        }
    }

    public void testComparator() {
        Student a = new Student(1, 2);
        Student b = new Student(18, 1);
        Student c = new Student(20, 1);

        int isBig = c.compare(a, b); // c.compare 으로서 제 3자의 객체가 두개의 객체를 비교

        System.out.println("isBig : " + isBig);
        if (isBig > 0) {
            System.out.println("a 객체가 b 객체보다 크다.");
        } else if(isBig == 0) {
            System.out.println("두 객체의 크기는 같다.");
        } else {
            System.out.println("a 객체가 b 보다 작다.");
        }
    }

    public void testComparator2() {
        Student a = new Student(1, 2);
        Student b = new Student(18, 1);

        Comparator<Student> comp1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        };

        System.out.println(comp1.compare(a, b));

        Comparator<Student> c = (t1, t2) -> t1.age - t2.age;

        System.out.println(c.compare(a, b));
    }

    public void sortTest1() {
        MyInteger[] arr = new MyInteger[10];

        // 객체 배열 초기화
        for (int i=0; i < 10; i++) {
            arr[i] = new MyInteger((int) (Math.random() * 100));
        }

        // 정렬 이전
        System.out.println("정렬 전 --");
        for (int i=0; i < 10; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
        System.out.println();

        // 정렬
        Arrays.sort(arr); // MyInteger 의 Comparable 을 이용하여 정렬

        // 정렬 이후
        System.out.println("정렬 후 --");
        for (int i=0; i < 10; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
    }

    /*
    내림차순
     */
    public void sortTest2() {
        MyInteger[] arr = new MyInteger[10];

        // 객체 배열 초기화
        for (int i=0; i < 10; i++) {
            arr[i] = new MyInteger((int) (Math.random() * 100));
        }

        // 정렬 이전
        System.out.println("정렬 전 --");
        for (int i=0; i < 10; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
        System.out.println();

        // 정렬
        Comparator<MyInteger> comp = (a, b) -> -(a.value - b.value);
        Arrays.sort(arr, comp); // Comparator 익명 객체를 통해 정렬

        // 정렬 이후
        System.out.println("정렬 후 --");
        for (int i=0; i < 10; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
    }
}
