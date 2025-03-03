package com.codeq.epam;

import java.util.HashMap;
import java.util.Map;

/*
 * Isomorphic: to check if two strings are isomorphic, we need to ensure that each character in one
 * string maps to exactly one character in the other string, and vice versa.
 */

public class Isomorphic {

    public static void main(
            String str[]) {

        String s1 = "paper";
        String s2 = "title";

        if (isIsomorphic(s1, s2)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }

    }

    public static boolean isIsomorphic(
            String s1,
            String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        // Maps to track the character mappings
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            // Check if there's already a mapping in map1
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            } else {
                map1.put(char1, char2);
            }

            // Check if there's already a mapping in map2 (reverse check)
            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            } else {
                map2.put(char2, char1);
            }
        }
        return true;
    }
}
