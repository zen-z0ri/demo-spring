package com.example.demospring.newj17.c20generic.l1;

public record ForRecord <E> (String name, Integer age, E e){
    static {
        System.out.println("on java");
    }
    public ForRecord {
        name = "nihao";
        age = Integer.valueOf(12);
        e = e;
    }
}
