package com.example.demospring.leetcode.utillearning;

import java.util.Scanner;

import static java.lang.System.out;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            out.println(sc.next());
        }
        sc.close();
    }
}
