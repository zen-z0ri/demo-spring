package com.example.demospring.newj17.c20generic.l1;

import lombok.SneakyThrows;

import java.io.File;
import java.net.URI;

public record ForRecord <E> (String name, Integer age, E e) {
    static {
        System.out.println("on java");
    }


    static void sTry2() {
        sTry();
    }
    @SneakyThrows
    static void sTry() {
        File s = new File(new URI("dfjsiofjds"));
    }


    static void tes() {
        String a = null;
        System.out.println(a);
    }

    public ForRecord(String name, Integer age, E e) {
        this.name = name;
        this.age = age;
        this.e = e;
        sTry();
    }
}
