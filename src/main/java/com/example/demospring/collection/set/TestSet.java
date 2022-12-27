package com.example.demospring.collection.set;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * @author tung
 */
public class TestSet {

    static final int THE_MAGIC = 1_0;
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add(null);
        s.add("ni");
        s.add("hao");
        out.println("jij");
        s.forEach(out::println);
        mLa:
        for (int k = 0; k < THE_MAGIC; k++) {

            for (int w = 0; w < THE_MAGIC; w++) {
                if (w == 6) {
                    continue mLa;
                }
                out.println(w + "" + k);
            }
        }
    }
}
