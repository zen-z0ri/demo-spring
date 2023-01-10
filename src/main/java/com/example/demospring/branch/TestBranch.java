package com.example.demospring.branch;

public class TestBranch {
    public static void main(String[] args) {
        LableI:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break LableI;
                }
                System.out.println(i + "---" + j);
            }
        }
    }
}
