package com.example.demospring.j17.stringblock;

public class TestStringBlock {
    public static void main(String[] args) {
        String aBlock = """
                this is a block""";
        // this is a block
        System.out.println(aBlock);
        System.out.println("--------");
        String bBlock = """
                this is a block
                """;
        // this is a block\n
        System.out.println(bBlock);
        System.out.println("--------");
    }
}
