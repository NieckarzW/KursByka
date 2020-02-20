package com.example.sptest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

  private CarService carService;

  @Autowired
  public CarController(CarService carService) {
    this.carService = carService;
  }

  public List<Car> get(){
    return carService.getCars();
  }
}
