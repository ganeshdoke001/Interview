package com.codeq.pwc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoRepeat {

    public static void main(
            String arg[]) {

        String s = "Gannneshh";

        Map<String, Long> map = Arrays.asList(s.split(""))
                .stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // find first with maximum time duplicate

        map.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .ifPresent(e -> System.out.println(e.getKey()));
    }
}
