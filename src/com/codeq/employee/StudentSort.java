package com.codeq.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StudentSort {

    public static void main(
            String arg[]) {

        // find the Student name which has max mark in English in java 8
        List<Student> studentList = List.of(new Student("Ganesh", Map.of("English", 76, "Math", 75)),
                new Student("Rahul", Map.of("English", 66, "Math", 55)));

        Student stu = studentList.stream()
                .sorted(Comparator.comparingInt(s -> ((Student) s).getSub()
                        .get("English"))
                        .reversed())
                .findFirst()
                .orElseThrow();

        System.out.println(stu.getName());

    }
}
