package com.aksonenko.cars_data.dao;

import java.util.List;

import com.aksonenko.cars_data.entity.Car;

public interface CarDAO {
	public List<Car> getAllCars();

	public void saveCar(Car car);
}
