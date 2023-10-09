package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
	private final List<Car> cars;

	public CarRepository() {
		cars = new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public Car getCarById(String id) {
		for (Car car : cars) {
			if (car.getId().equals(id)) {
				return car;
			}
		}
		return null;
	}
}
