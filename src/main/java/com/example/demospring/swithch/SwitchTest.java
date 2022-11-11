package com.example.demospring.swithch;

import static java.lang.System.out;

public class SwitchTest {
    static String testS1(int a) {
        String res = null;
        switch (a) {
            case 1: res = "ni";
            case 2: res = "hao";
                break;
            case 3: res = "ma";
                break;
            case 4: res = "?";
                break;
            default:
                res = "default";
        }
       return  res;
    }
    public static void main(String[] args) {
        int a = 1;
        String b = "nihao";
        // breakthrough
        out.println(SwitchTest.testS1(a));

    }
}
