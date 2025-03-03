package com.codeq.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * An anagram of a string is another string that contains the exact same characters, but possibly
 * arranged in a different order.
 * 
 * In simpler terms, two strings are anagrams if:
 * 
 * Both strings have the same length. Both strings have the same characters, with the same frequency
 * of each character.' 49. Group Anagrams Given an array of strings strs, group the anagrams
 * together. You can return the answer in any order. Input: strs =
 * ["eat","tea","tan","ate","nat","bat"]
 * 
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Anagram {

    public static void main(
            String arg[]) {

        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> groAnagrams = groupAnagrams(strs);

        for (List<String> o : groAnagrams) {
            System.out.println(o);
        }
    }

    public static List<List<String>> groupAnagrams(
            String strs[]) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key)
                    .add(s);

        }
        return new ArrayList<>(map.values());

    }
}
