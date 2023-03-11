package com.example.demospring.j17.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Arr1 {
    public static void main(String[] args) {
        int[] a = new int[2];
        int[] b = new int[0];
        int c = 0;
        int[] d = {1, 3};
        int[] f = {10, 2, 5};
        d = f;
        System.out.println(d);
        Arrays.sort(f);
        System.out.println(Arrays.toString(f));


        var map = new HashMap<String, Integer>();
        for (var le : map.entrySet()  ) {

        }
    }
}
