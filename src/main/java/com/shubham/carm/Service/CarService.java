package com.shubham.carm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shubham.carm.Entity.Car;
import com.shubham.carm.Repository.CarRepository;



@Service
public class CarService 
{
	 @Autowired
	    private CarRepository carRepository;

	    public Car addCar(Car car) {
	        return carRepository.save(car);
	    }

	    public Car updateCar(Long id, Car updatedCar) {
	        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
	        car.setName(updatedCar.getName());
	        car.setModel(updatedCar.getModel());
	        car.setYear(updatedCar.getYear());
	        car.setPrice(updatedCar.getPrice());
	        car.setColor(updatedCar.getColor());
	        car.setFuelType(updatedCar.getFuelType());
	        return carRepository.save(car);
	    }

	    public void deleteCar(Long id) {
	        carRepository.deleteById(id);
	    }

	    public Page<Car> getAllCars(int page, int size, String sortBy, String direction) {
	        Sort sort = direction.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
	        return carRepository.findAll(PageRequest.of(page, size, sort));
	    }

	    public List<Car> searchCars(String keyword) {
	        return carRepository.searchCars(keyword);
	    }

}
