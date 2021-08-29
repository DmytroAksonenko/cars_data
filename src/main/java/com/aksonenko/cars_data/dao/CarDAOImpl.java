package com.aksonenko.cars_data.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aksonenko.cars_data.entity.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Car> getAllCars() {
		Session session = sessionFactory.getCurrentSession();
		Query<Car> query = session.createQuery("from Car", Car.class);
		List<Car> allCars = query.getResultList();

		return allCars;
	}

	@Override
	public void saveCar(Car car) {
		Session session = sessionFactory.getCurrentSession();
		session.save(car);		
	}

}
