package com.codeq.tcs;

/*
 * The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding
 * ones, starting from 0 and 1. The sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * F(n) = F(n-1) + F(n-2), where F(0) = 0 and F(1) = 1
 * 
 */
public class Fibonacci {

    public static void main(
            String arg[]) {

        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(printFibonacci(i) + ", ");
        }
        System.out.println();
        printFibonacciNo(n);
    }

    public static int printFibonacci(
            int n) {

        if (n <= 1) {
            return n;
        }

        return printFibonacci(n - 1) + printFibonacci(n - 2);

    }

    public static void printFibonacciNo(
            int n) {

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(n);
        }
        if (n == 1) {
            System.out.println(n);
        }

        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }
    }
}
