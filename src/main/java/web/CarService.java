package web;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Audi", 5));
        cars.add(new Car(1, "BMW", 2));
        cars.add(new Car(1, "Lada", 7));
        cars.add(new Car(1, "Kia", 3));
        cars.add(new Car(1, "Seat", 6));
    }

    public List<Car> getCarsList(int count) {
        if (count > cars.size() || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
