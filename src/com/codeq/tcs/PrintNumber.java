package com.codeq.tcs;

public class PrintNumber {

    public static void main(
            String arg[]) {

        printNum(10);
    }

    public static void printNum(
            int n) {

        System.out.print(n + " ");
        if (n < 1) {
            return;
        }
        printNum(n - 1);
    }
}
