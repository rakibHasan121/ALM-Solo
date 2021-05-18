package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by rakib
 * Date: 2021-05-18
 * Projekt: ALM-Solo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyMathCalc {
    private int num1, num2, result;

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        return a / b;
    }
}