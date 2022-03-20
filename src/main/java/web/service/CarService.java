package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();

    private static int CAR_COUNT;

    {
        cars.add(new Car(++CAR_COUNT, "Subaru", "Forester"));
        cars.add(new Car(++CAR_COUNT, "Toyota", "Rav-4"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "Primera"));
        cars.add(new Car(++CAR_COUNT, "Suzuki", "Escudo"));
        cars.add(new Car(++CAR_COUNT, "Mitsubishi", "Gallant"));
    }

    public List<Car> show(Integer id) {
        if(id == null) return cars;
        return cars.stream().limit(id).collect(Collectors.toList());
    }
}
