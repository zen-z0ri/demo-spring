package com.example.demospring.scanner;

import java.util.Scanner;

import static java.lang.System.out;

public class ScanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            out.println(sc.next());
        }
    }
}
