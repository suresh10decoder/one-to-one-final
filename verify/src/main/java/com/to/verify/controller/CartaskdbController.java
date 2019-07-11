package com.to.verify.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.to.verify.model.Car;
import com.to.verify.model.CarModel;
import com.to.verify.service.CartaskdbService;

@RestController
@RequestMapping("car")
public class CartaskdbController {
	@Autowired
	CartaskdbService service;

	@PostMapping("insert")
	private CarModel insert(@RequestBody CarModel a) {
		return service.insert(a);
	}

	@PostMapping("newinsert")
	private Car newInsert(@RequestBody Car b) {
		return service.newInsert(b);
	}

	@GetMapping("getall")
	private ArrayList<CarModel> getall() {
		return service.getall();
	}

	@GetMapping("newgetall")
	private ArrayList<Car> newGetall() {
		return service.newGetall();
	}

//	@GetMapping("getbyid/{id}")
//	private Optional<Car> getbyid(@PathVariable long a) {
//		return service.getbyid(a);
//	}
//
//	@DeleteMapping("delete/{id}")
//	private CarModel delete(@PathVariable long id, CarModel a) {
//
//		return service.delete(a);
//	}
//
//	@DeleteMapping("deleteall")
//	private void deleteall() {
//		service.deleteall();
//	}
//
//	@PutMapping("update/{id}")
//	private CarModel update(@PathVariable long id, @RequestBody CarModel a) throws  InvalidNameException  {
//
//		return service.update(id, a);
//	}
}