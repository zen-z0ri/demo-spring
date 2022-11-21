package com.example.demospring.java8.lambda;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class HelloWorld {
    public static void main(String[] args) {
        out.println("hello");
        List<String> s = new ArrayList<>();
        switch (2) {
            case 2, 1, 3 -> out.println("small");
            case 7, 8, 9 -> out.println("big");
            default -> out.println("normal");
        };
        switch (2) {
            case 2:
                out.println("nihao");
            case 3:
                out.println("-----");
                break;
            default:
                out.println("fjdsifio");
        }
        


    }
}
