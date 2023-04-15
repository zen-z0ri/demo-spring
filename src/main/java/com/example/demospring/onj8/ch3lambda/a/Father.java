package com.example.demospring.onj8.ch3lambda.a;

import com.google.common.base.CaseFormat;
import java.util.stream.IntStream;

public class Father {
    private String pri = "sji";
    public Father() {
        System.out.println("father create");
    }

    static void sta() {
        System.out.println("static");
    }

    void sing() {
        System.out.println("sing=====");
    }
    void say() {
        System.out.println("ffather");
    }
    public static void main(String[] args) {
        IntStream.range(2, 40).forEach(System.out::println);

    }
}

