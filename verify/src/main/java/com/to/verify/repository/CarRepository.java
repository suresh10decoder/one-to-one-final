package com.to.verify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.to.verify.model.CarModel;
@Repository
public interface CarRepository extends JpaRepository<CarModel,Long>
{
	
}