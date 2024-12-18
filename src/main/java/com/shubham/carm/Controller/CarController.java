package com.shubham.carm.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.carm.Entity.Car;
import com.shubham.carm.Service.CarService;


@RestController
@RequestMapping("/api/car")
public class CarController 
{
	@Autowired
    private CarService carService;

    @PostMapping("/addCar")
    public Car addCar(@Valid @RequestBody Car car) {
        return carService.addCar(car);
    }

    @PutMapping("/updateCar/{id}")
    public Car updateCar(@PathVariable Long id, @Valid @RequestBody Car updatedCar) {
        return carService.updateCar(id, updatedCar);
    }

    @DeleteMapping("/deleteCar/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }

    @GetMapping("/getAllCar")
    public Page<Car> getAllCars(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "id") String sortBy,
                                @RequestParam(defaultValue = "asc") String direction) {
        return carService.getAllCars(page, size, sortBy, direction);
    }

    @GetMapping("/search")
    public List<Car> searchCars(@RequestParam String keyword) {
        return carService.searchCars(keyword);
    }

}
