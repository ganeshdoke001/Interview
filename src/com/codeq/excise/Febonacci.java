package com.codeq.excise;

public class Febonacci {

    public static void main(
            String arg[]) {

        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(febonacci(i) + ", ");
        }
        System.out.println();
        febonacciP(n);

    }

    public static int febonacci(
            int n) {

        if (n <= 1) {
            return n;
        }

        return febonacci(n - 1) + febonacci(n - 2);
    }

    public static void febonacciP(
            int n) {

        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println(a);
        }
        if (n == 1) {
            System.out.println(b);
        }
        if (n < 0) {
            throw new IllegalArgumentException("Invalid value");
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
