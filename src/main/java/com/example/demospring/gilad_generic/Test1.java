package com.example.demospring.gilad_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.System.out;

public class Test1 {
    public static void main(String[] args) {
        List<? extends String> ls = new ArrayList<>();
        out.println("mio");
        int a = 11;
        String fm = """
                this isi %d""".formatted(a);
    }
}
