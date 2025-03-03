package com.codeq.tcs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(
            String arg[]) {

        String s = "Gannessh";

        Arrays.asList(s.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .findFirst()
                .ifPresent(System.out::println);
        Arrays.asList(s.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
