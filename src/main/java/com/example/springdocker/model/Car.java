package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by rakib
 * Date: 2021-05-12
 * Projekt: ALM-Solo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String name;
    boolean stylish;
    boolean canIAffordIt;
}