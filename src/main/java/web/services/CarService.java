package web.services;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private final CarDao carDao = new CarDao();

    public List<Car> showCars(Integer count) {
        return new ArrayList<>(carDao.showCars(count));
    }
}
