package me.study.lambda_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        };

        // 학생 이름만 뽑아서 List<String> 에 저장
        List<String> names = names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(); // 줄갱

        // 스트림을 배열로 변환
        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        for (Student s : stuArr2) {
            System.out.println(s);
        }
        System.out.println(); // 줄갱

        // 스트림을 Map<String, Student> 로 변환. 학생이름이 key
        Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));

        for (String name : stuMap.keySet()) {
            System.out.println(name + " - " + stuMap.get(name));
        }
        System.out.println(); // 줄갱

        long count = Stream.of(stuArr).count();
        long totalScore = Stream.of(stuArr).mapToInt(Student::getTotalScore).sum();
        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);
        System.out.println(); // 줄갱

        Optional<Student> topStudent = Stream.of(stuArr).max(Comparator.comparingInt(Student::getTotalScore));
        System.out.println("topStudent = " + topStudent.get());
        System.out.println(); // 줄갱

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);
        System.out.println(); // 줄갱

        String stuNames = Stream.of(stuArr).map(Student::getName).collect(joining(",", "{", "}"));
        System.out.println(stuNames);
    }
}
