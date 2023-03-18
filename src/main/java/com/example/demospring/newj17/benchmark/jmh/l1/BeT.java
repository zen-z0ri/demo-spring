package com.example.demospring.newj17.benchmark.jmh.l1;

public class BeT {
    static int fin(int n) {
        return n;
    }
    public static void main(String[] args) {
        int n = 43;
        long start = System.nanoTime();
        int fib = fin(n);
        System.out.printf("result = %d is : %d \n", n , fib);
        long end = System.nanoTime() - start;

    }
}
