package com.codeq.sort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Append {

    public static void main(
            String arg[]) {

        String s = "aabbbccc";
        // op:"a3b3c3";

        Map<String, Long> map = Arrays.asList(s.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        map.entrySet()
                .forEach(a -> {
                    sb.append(a.getKey() + "" + a.getValue());
                });

        System.out.println(sb.toString());
    }
}
