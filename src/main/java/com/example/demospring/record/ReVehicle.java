package com.example.demospring.record;

import java.math.BigDecimal;

import static java.lang.System.out;

public record ReVehicle(String brand, BigDecimal price, int passengerNum) {
    static int num = 10;

    public ReVehicle {
        out.println("this is a Record");
        num++;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        ReVehicle.num = num;
    }
}
