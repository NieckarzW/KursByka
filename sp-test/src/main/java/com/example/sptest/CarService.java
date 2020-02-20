package com.example.sptest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CarService {

  private List<Car> carList;

  public CarService() {
    Car car1 = new Car("BMW","i8");
    Car car2 = new Car("Skoda","Octavia");
    Car car3 = new Car("Alfa","159");
    carList = new ArrayList<>();
    carList.add(car1);
    carList.add(car2);
    carList.add(car3);
  }

  @EventListener(ApplicationReadyEvent.class)
    public List<Car> getCars() {
    return carList;
  }
}
