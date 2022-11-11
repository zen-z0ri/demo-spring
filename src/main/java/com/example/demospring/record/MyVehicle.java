package com.example.demospring.record;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MyVehicle {
    String brand;
    BigDecimal price;
    int passengerNum;
}
