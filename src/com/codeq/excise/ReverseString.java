package com.codeq.excise;

import java.util.Arrays;

public class ReverseString {

    public static void main(
            String arg[]) {

        String s = "Ganesh";
        int n = s.length();
        System.out.println(reverse(s, n));
        System.out.println(reverseApi(s));
        System.out.println(reverseApi(s));
        System.out.println(re(s));
    }

    public static String reverse(
            String s,
            int n) {

        if (n < 1) {
            return "";
        }

        return s.charAt(n - 1) + reverse(s, n - 1);
    }

    public static String reverseApi(
            String s) {

        return Arrays.asList(s.split(""))
                .stream()
                .reduce("", (
                        a,
                        b) -> b + a);

    }

    public static String reversep(
            String s) {

        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = ch.length - 1; i > 0; --i) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static String re(
            String s) {

        return new StringBuilder(s).reverse()
                .toString();
    }
}
