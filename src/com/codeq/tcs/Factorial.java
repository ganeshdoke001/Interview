package com.codeq.tcs;

public class Factorial {

    public static void main(
            String arg[]) {

        int n = 10;
        System.out.println(factorial(n));
    }

    public static int factorial(
            int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input Invalid");
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
