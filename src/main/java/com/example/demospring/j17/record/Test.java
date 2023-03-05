package com.example.demospring.j17.record;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;
public class Test {
    public static void main(String[] args) {
        VehicleLom vl1 = new VehicleLom(2, new BigDecimal(12.22), "benz");
        VehicleLom vl2 = new VehicleLom(2, new BigDecimal(12.22), "benz");

        VehicleRecord re1 = new VehicleRecord(1, new BigDecimal(12), "test");
        out.println(re1);
    }
}
