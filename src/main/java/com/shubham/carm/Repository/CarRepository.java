package com.shubham.carm.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shubham.carm.Entity.Car;



@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	
	@Query("SELECT c FROM Car c WHERE c.name LIKE %:keyword% OR c.model LIKE %:keyword% OR " +
	           "c.year LIKE %:keyword% OR c.color LIKE %:keyword% OR c.fuelType LIKE %:keyword%")
	List<Car> searchCars(@Param("keyword") String keyword);




}
