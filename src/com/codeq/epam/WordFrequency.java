package com.codeq.epam;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

// frequest of word: means count of word
public class WordFrequency {

    public static void main(
            String arg[]) {

        String words = "My name name is Ganesh";

        Arrays.asList(words.split(" "))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
