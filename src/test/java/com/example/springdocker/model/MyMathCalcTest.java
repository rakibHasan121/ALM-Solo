package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by rakib
 * Date: 2021-05-18
 * Projekt: ALM-Solo
 */

class MyMathCalcTest {

    MyMathCalc myMathCalc;

    @BeforeEach
    public void init() {
        myMathCalc = new MyMathCalc();
    }

    @DisplayName("Test for Add")
    @Test
    void add() {
        int result = myMathCalc.add(12, 3);
        if (result != 15) System.out.println("Test failed!");
    }

    @DisplayName("Test for Multiply")
    @Test
    void multiply() {
        int result = myMathCalc.multiply(12, 3);
        if (result != 36) System.out.println("Test failed!");
    }

    @DisplayName("Test for Division")
    @Test
    void divide() {
        double result = myMathCalc.divide(12, 3);
        if (result != 4) System.out.println("Test failed!");
    }

}