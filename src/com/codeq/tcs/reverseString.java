package com.codeq.tcs;

import java.util.Arrays;

public class reverseString {

    public static void main(
            String arg[]) {

        String s = "Ganesh";
        int n = s.length();
        System.out.println(reverse(s, s.length()));
        System.out.println(reverse1(s, n));
        System.out.println(reverse2(s));
    }

    public static String reverse(
            String s,
            int n) {

        if (n < 1) {
            return "";
        }
        return s.charAt(n - 1) + reverse(s, n - 1);

    }

    public static String reverse1(
            String s,
            int n) {

        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int c = ch.length - 1; c >= 0; c--) {
            sb.append(ch[c]);
        }
        return sb.toString();
    }

    public static String reverse2(
            String s) {

        return new StringBuilder(s).reverse()
                .toString();
    }

    public static String reverse3(
            String s) {

        return Arrays.asList(s.split(""))
                .stream()
                .reduce((
                        a,
                        b) -> b + a)
                .get();

    }
}
