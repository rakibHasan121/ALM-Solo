package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rakib
 * Date: 2021-05-18
 * Projekt: ALM-Solo
 */
@DataMongoTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    List<Car> actual;

    @DisplayName("If car object is drivable")
    @Test
    void findCarsByCanIDriveIt() {
        String expectedId = "1";
        String expectedName = "Toyota";
        Boolean expectedStylish = false;
        Boolean expectedDriveable = true;

        Car carInstance = new Car();
        carInstance.setId(expectedId);
        carInstance.setName(expectedName);
        carInstance.setStylish(expectedStylish);
        carInstance.setCanIDriveIt(expectedDriveable);

        carRepository.save(carInstance);

        if (expectedDriveable) actual = carRepository.findCarsByCanIDriveIt(expectedDriveable);
        assertTrue(actual.contains(carInstance));

    }

}