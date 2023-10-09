package org.example;

import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor ist nur für Final-Attribute
@RequiredArgsConstructor
public class CarService {
	private final CarRepository carRepository;

	public void addCar(Car car){
		carRepository.addCar(car);
	}

	public Car getCarById(String id){
		return carRepository.getCarById(id);
	}
}
