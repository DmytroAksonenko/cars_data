package com.aksonenko.cars_data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aksonenko.cars_data.dao.CarDAO;
import com.aksonenko.cars_data.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDAO carDAO;
	
	@Override
	@Transactional
	public List<Car> getAllCars() {
		return carDAO.getAllCars();
	}

	@Override
	@Transactional
	public void saveCar(Car car) {
		carDAO.saveCar(car);
		
	}

}
