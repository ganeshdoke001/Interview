package com.codeq.epam;

public class BBBSubstring {

    public static void main(
            String arg[]) {

        String s = "abbbcd";
        // output="bbb";
        System.out.println(subSequence(s));
    }

    public static String subSequence(
            String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 || s.charAt(i) == s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = String.valueOf(s.charAt(i));
            }

            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}
