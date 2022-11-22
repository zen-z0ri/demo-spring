package com.example.demospring.guava;

import org.springframework.jmx.export.naming.IdentityNamingStrategy;

import java.util.Optional;

import static java.lang.System.out;

public class TestOptional {
    static Optional<Boolean> pos = Optional.of(true);

    public static void main(String[] args) {
        out.println(pos.isPresent());
        out.println(pos.get().booleanValue());
    }
}
