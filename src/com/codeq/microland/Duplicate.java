package com.codeq.microland;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(
            String arg[]) {

        String s = "abcdabcdem";
        Arrays.asList(s.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.partitioningBy(e -> e.getValue() > 1))
                .entrySet()
                .forEach(System.out::println);

        // even/odd

        int n[] = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        Arrays.stream(n)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .entrySet()
                .forEach(System.out::println);
    }
}
