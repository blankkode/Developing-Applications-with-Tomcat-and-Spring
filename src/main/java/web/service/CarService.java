package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = Arrays   .asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2019),
            new Car("Ford", "Focus", 2018),
            new Car("BMW", "3 Series", 2021),
            new Car("Audi", "A4", 2022)
    );

    public List<Car> getCars(int count) {
        System.out.println("1A"+count);
        if (count >= cars.size() || count < 0) {
            System.out.println("2A"+count);
            return cars;
        }
        System.out.println("3A"+count);
        return cars.subList(0, count);
    }
}
