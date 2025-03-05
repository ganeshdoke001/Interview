package com.codeq.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {

    public static void main(
            String arg[]) {

        // java.util.ConcurrentModificationException
        Map<Integer, String> map = new HashMap<>();
        map = new ConcurrentHashMap<Integer, String>();
        map.put(1, "Ganesh");
        map.put(2, "Kaustub");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
            map.put(3, "Talha");
        }
        System.out.println();
        Iterator<Map.Entry<Integer, String>> it = map.entrySet()
                .iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.print(e.getValue() + " ");
            map.put(3, "Talha");
        }
        System.out.println();
        map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "Talha");
        map.put(1, "Rahul");
        map.put(2, "Akash");
        map.entrySet()
                .forEach(System.out::print);
        System.out.println();
        map = new LinkedHashMap<Integer, String>();
        map.put(3, "Talha");
        map.put(1, "Rahul");
        map.put(2, "Akash");

        map.entrySet()
                .forEach(System.out::println);
    }
}
