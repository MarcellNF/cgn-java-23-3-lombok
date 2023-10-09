package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Car car = Car.builder()
				.id("1")
				.brand("BMW")
				.hasTuev(true)
				.build();
		System.out.println(car);
		Car vw = car.withBrand("VW");
		car.setBrand("Toyota");
		System.out.println(car);
		System.out.println(vw);

		CarRepository carRepository = new CarRepository();
		CarService carService = new CarService(carRepository);

		carService.addCar(car);
		System.out.println(carService.getCarById("1"));
	}
}