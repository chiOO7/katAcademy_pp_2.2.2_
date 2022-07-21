package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private static int CAR_COUNT;
    private final List<Car> cars;

    private final String[] COLORS = {"RED", "GREEN", "BLACK", "WHITE", "YELLOW"};
    private final String[] MODELS = {"BMW", "LADA", "KIA", "HYUNDAY", "VOLKSWAGEN"};

    {
        cars = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            cars.add(new Car(++CAR_COUNT,MODELS[i - 1], COLORS[i - 1], i * 100));
        }
    }

    public List<Car> showCars(Integer count) {
        if (count == null) return cars;
        if (count <= cars.size() - 1) return new ArrayList<>(cars.subList(0, count));
        else return cars;
    }

}
