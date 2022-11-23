package com.example.demospring.leetcode.utillearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class TestString {
    public static void main(String[] args) {

        String s1 = "This is a 12 littl String for test 37 ";
        out.println(s1.length());
        out.println(s1.split("\s").length);

        Arrays.stream(s1.split("\s")).forEach(out::println);

        List<String> a = new ArrayList<>();
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");
        a.add("ni");

        a.forEach(out::println);
    }
}
