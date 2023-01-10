package com.example.demospring.switch1;

import com.example.demospring.util.Day;

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

    static int testS2(Day day) {

        int dayOfWeek;
        // fall through: forget break;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                dayOfWeek = 6;
                break;
            case TUESDAY:
                dayOfWeek = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                dayOfWeek = 8;
                break;
            case WEDNESDAY:
                dayOfWeek = 9;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }

        return dayOfWeek;
    }

    public static void main(String[] args) {
        int a = 1;
        String b = "nihao";

        out.println(SwitchTest.testS1(a));
        out.println(SwitchTest.testS2(Day.MONDAY));

        // switch expression jdk 14
    int dayOfWeek = switch (Day.FRIDAY) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
//            case WEDNESDAY              -> 9;
            default                     -> 0;

        };

        out.println(dayOfWeek);
    }
}
