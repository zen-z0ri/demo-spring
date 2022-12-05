package com.example.demospring.collection.set;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class TestSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add(null);
        s.add("ni");
        s.add("hao");
        s.forEach(out::println);
    }
}
