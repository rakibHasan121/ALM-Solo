package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rakib
 * Date: 2021-05-12
 * Projekt: ALM-Solo
 */
@Repository
public interface CarRepository extends MongoRepository<Car, String> {
    List<Car> findCarsByCanIDriveIt(boolean canDrive);
}