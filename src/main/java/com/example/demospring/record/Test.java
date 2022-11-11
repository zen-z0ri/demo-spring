package com.example.demospring.record;

import java.math.BigDecimal;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        MyVehicle mv = new MyVehicle("hello", new BigDecimal("1.32"), 3);
        ReVehicle rv = new ReVehicle("gongxiang", new BigDecimal("132.2323"), 1);
        ReVehicle rv1 = new ReVehicle("gongxiang", new BigDecimal("132.2323"), 1);

        out.println(mv);
        out.println(mv.toString());
        out.println(rv);
        out.println(rv.toString());
        out.println(rv.passengerNum());
        out.println(rv.brand());
        out.println(rv.price());
        out.println(rv.equals(mv));
        out.println(rv.equals(rv1));
    }
}
