package binarysearch;

import org.openjdk.jmh.annotations.Benchmark;
import util.SampleArray;

import java.util.Arrays;

public class BinarySearch {
    @Benchmark
    static int binS(int[] s, int t) {
        int left = 0, right = s.length - 1;
        int search;
        while (left <= right) {
            search = left + (right - left)>>>2;
            if (s[search] > t) {
                right = search - 1;
            } else if (s[search] < t) {
                left = search + 1;
            } else {
                return search;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        var sap = new SampleArray();
        System.out.println(binS(SampleArray.intArr1, 1));
        System.out.println(binS(SampleArray.intArr1, 1));
    }
}
