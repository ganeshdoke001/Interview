package com.codeq.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReplaceDuplicateWithZero {

    public static void main(
            String arg[]) {

        int nums[] = {1, 2, 3, 4, 1, 2, 5, 1, 2};

        Map<Integer, Long> frequency = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> array = Arrays.stream(nums)
                .boxed()
                .map(n -> {
                    return frequency.get(n) > 1 ? 0 : n;
                })
                .collect(Collectors.toList());

        System.out.println(array);

    }
}
