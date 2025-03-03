package com.codeq.leetcode;

/*
 * 58. Length of Last Word Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5. Example
 * 2:
 * 
 * Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word is "moon" with
 * length 4.
 */
public class Length_of_Last_Word {

    public static void main(
            String arg[]) {

        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(
            String s) {

        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;

            } else {
                break;
            }
        }
        return count;

    }
}
