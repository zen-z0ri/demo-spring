package com.example.demospring.newj17.c8inherit.inherit;

import java.util.List;

public class MyDerived extends MyBase{
    final void DerivedStatic(final String s) {
        super.BaseMethod();
    }
     static void main(String[] args) {
        MyBase a = new MyDerived();
        MyDerived d = new MyDerived();
    }
}
