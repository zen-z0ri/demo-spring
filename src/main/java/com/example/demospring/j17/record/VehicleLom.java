package com.example.demospring.j17.record;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class VehicleLom {
    int id;
    BigDecimal price;
    String name;
}
