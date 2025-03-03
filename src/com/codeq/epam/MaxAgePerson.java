package com.codeq.epam;

import java.util.Arrays;
import java.util.Comparator;

public class MaxAgePerson {

    public static void main(
            String atr[]) {

        int n[][] = {{10, 20}, {40, 30}};

        Arrays.stream(Arrays.stream(n)
                .flatMapToInt(Arrays::stream)
                .toArray())
                .forEach(System.out::println);

        Object[][] people = {{"aakash", 20}, {"Rahul", 30}};

        String name = Arrays.stream(people)
                .max(Comparator.comparingInt(person -> (int) person[1]))
                .map(person -> (String) person[0])
                .orElse(null);

        System.out.println(name);
    }
}
