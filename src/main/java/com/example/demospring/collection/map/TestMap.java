package com.example.demospring.collection.map;

import java.util.*;

import static java.lang.System.out;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> s = new HashMap<>();
        Set<String> s2 = new HashSet<>();
        List<String> l = new ArrayList<>();
        s2.add("djsio");
        l.add("jfids");
        s.put(null, 1);
        s.put("ni", null);
        s.put("hao", null);
        s.forEach((k, v) -> {
            out.println(k);
            out.println(v);
        });

    }
}
