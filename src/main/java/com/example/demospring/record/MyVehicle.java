package com.example.demospring.record;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MyVehicle {
    static int s = 20;

    public static int getS() {
        return s;
    }

    public static void setS(int s) {
        MyVehicle.s = s;
    }

    MyVehicle () {
        s++;
    }
    String brand;
    BigDecimal price;
    int passengerNum;
}
