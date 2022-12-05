package com.example.demospring.record;

import java.math.BigDecimal;

public record ReVehicle(String brand, BigDecimal price, int passengerNum) {
    static int num;

    public ReVehicle {
        num++;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        ReVehicle.num = num;
    }
}
