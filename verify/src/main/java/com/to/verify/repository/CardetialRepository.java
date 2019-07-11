package com.to.verify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.to.verify.model.Car;

@Repository
public interface CardetialRepository extends JpaRepository<Car,Long>
{

}
