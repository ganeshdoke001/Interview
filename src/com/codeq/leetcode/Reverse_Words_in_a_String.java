package com.codeq.leetcode;

/*
 * 
 * 151. Reverse Words in a String
 */
public class Reverse_Words_in_a_String {

    public static void main(
            String arg[]) {

        // Input: s = "the sky is blue"
        // Output: "blue is sky the"

        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(
            String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; --i) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString()
                .trim();

    }

}
