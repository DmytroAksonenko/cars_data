package com.aksonenko.cars_data.service;

import java.util.List;

import com.aksonenko.cars_data.entity.Car;

public interface CarService {
	
	public List<Car> getAllCars();
	
	public void saveCar(Car car);
	
}
