package com.to.verify.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.to.verify.model.Car;
import com.to.verify.model.CarModel;
import com.to.verify.repository.CarRepository;
import com.to.verify.repository.CardetialRepository;

@Component
public class CartaskdbService {

	@Autowired
	CarRepository carRepository;
	@Autowired
	CardetialRepository Repository;

	public CarModel insert(CarModel carmodel) {

		return carRepository.save(carmodel);
	}

	public Car newInsert(Car car) {

		return Repository.save(car);
	}

	public ArrayList<CarModel> getall() {

		return (ArrayList<CarModel>) carRepository.findAll();
	}

	public ArrayList<Car> newGetall() {

		return (ArrayList<Car>) Repository.findAll();
	}
//	public Optional<Car> getbyid( long id){
//		return  repository.findById(id);
//	}
//	public CarModel delete(Car a) {
//		
//		
//		return repository.delete(a);
//	}
//	public void deleteall() {
//	}
//	
//	@Override
//	public CarModel update( long id,CarModel a) {
//		
//	}
//
//	@Override
//	public CarModel insert(CarModel a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public CarModel delete(CarModel a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public CarModel update(long id, CarModel a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Car newinsert(Car b) {
//		// TODO Auto-generated method stub
//		return null;
}
