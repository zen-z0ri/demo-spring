package com.example.demospring.j17.switchupdate;

public class Test {
    static int testWeekDay(Weekday weekday) {
        return switch (weekday) {
            case MONDAY -> 0;
            case TUESDAY -> 0;
            case WEDNESDAY -> 0;
            case THURSDAY -> 0;
            case FRIDAY -> 5;
        };
    }

    static int testSw(int a) {
        return switch (a + 1) {
            case 22 -> {
                yield 666;
            }
            default -> throw new IllegalStateException("Unexpected value: " + a + 1);
        };
    }

    public static void main(String[] args) {
        String testA = "id    :         dsfdsojfios";
        String[] resb = testA.split(":");
        System.out.println(resb[1]);
    }
}
