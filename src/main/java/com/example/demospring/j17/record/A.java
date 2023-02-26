package com.example.demospring.j17.record;

import java.util.ArrayList;
import java.util.List;

public record A(List<String> list) {
    public A(List<String> list) {
        this.list = new ArrayList<>(list);
    }
}
