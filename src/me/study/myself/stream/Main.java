package me.study.myself.stream;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        main.flatMapEx();
//        main.flatMapEx2();
//        main.flatMapEx3();

        System.out.println("--parallelStreamEx1--");
        main.parallelStreamEx1();

        System.out.println("--parallelStreamEx2--");
        main.parallelStreamEx2();
    }

    /*
    - Collection Interface 는 Collection Framework 에서 List 와 Set 의 공통점들을 모아 재정의 한 것.
    - FlatMap 는 중첩구조(2중 배열, 2중 리스트)에서 한 단계 제거하기 위한 중간 연산
    - FlatMap 는 Function Interface 를 파라미터로 받고 있다. 이는 Stream 을 extends 구현한 객체어야 한다.
    - collect 는 Stream 의 요소들을 List, Set, Map 등 다른 종류의 결과로 수집하고 싶은 경우 collect 함수를 이용한다.
     */
    private void flatMapEx() {
        // 2중 리스트
        List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));

        List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatList);
    }

    private void flatMapEx2() {
        Stream<String[]> strStream = Stream.of(
                new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"}
        );

//         map 을 사용하면 2중 stream 으로 반환
//        Stream<Stream<String>> stream = strStream.map(Arrays::stream);

        // flatMap 을 사용하여 1중 Stream 으로 차원 낮춤
        Stream<String> stream2 = strStream.flatMap(Arrays::stream);
        stream2.forEach(System.out::println);
    }

    private void flatMapEx3() {
        List<Student> students = Arrays.asList(
                new Student(80, 90, 75),
                new Student(70, 100, 75),
                new Student(85, 90, 85),
                new Student(80, 100, 90)
        );

        // 모든 점수의 평균
        double avg = students.stream().flatMapToInt(
                student -> IntStream.of(student.getKor(), student.getEng(), student.getMath())
        ).average().getAsDouble();

        System.out.println(avg);
    }

    /*
    병렬 스트리밍
    Parallel Stream 은 내부적으로 fork & join 을 사용
    ThreadPool 의 개수는 최대 5개이며, 사용가능한 물리적인 CPU 코어의 수에 따라 다르게 설정
     */
    private void parallelStreamEx1() {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.println("사용가능한 쓰레드 수 : " + forkJoinPool.getParallelism());
    }

    private void parallelStreamEx2() {
        Arrays.asList("a", "b", "c", "d", "e").parallelStream().filter(s -> {
            System.out.format("filter : %s [%s]\n", s, Thread.currentThread().getName());
            return true;
        }).map(s -> {
            System.out.format("map : %s [%s]\n", s, Thread.currentThread().getName());
            return s.toLowerCase();
        }).forEach(s -> System.out.format("forEach : %s [%s]\n", s, Thread.currentThread().getName()));
    }
}
