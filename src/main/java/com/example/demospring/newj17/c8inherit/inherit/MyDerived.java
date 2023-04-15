package com.example.demospring.newj17.c8inherit.inherit;

import java.util.*;

public class MyDerived <T, S, U, V> extends MyBase {
    final void DerivedStatic(final String s) {
        super.BaseMethod();
    }

    public static void main(String[] args) {
        MyBase a = new MyDerived();
        MyDerived d = new MyDerived();
        var ls = new ArrayList<Integer>(List.of(1 , 3));
        for (var s : ls) {
            System.out.println(s);
        }
        Stack<String> s = new Stack<>();
    }

}
