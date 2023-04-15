package com.example.demospring.newj17.c8inherit.inherit;

import com.google.common.primitives.Ints;

import java.util.stream.IntStream;

public class NewTest {

   String concat(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        IntStream.range(1, 203)
                .forEach(System.out::println);
    }
}
