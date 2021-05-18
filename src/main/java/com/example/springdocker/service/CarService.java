package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rakib
 * Date: 2021-05-12
 * Projekt: ALM-Solo
 */
@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository repository;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public void saveNewCar(Car car) {
        repository.save(car);
    }

    public List<String> getRunnableCars() {

        List<Car> runnableCars = repository.findCarsByCanIDriveIt(true);
        return runnableCars.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }
}