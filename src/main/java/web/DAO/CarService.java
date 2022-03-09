package web.DAO;

import web.models.Car;

import java.util.List;

/**
 * @author Vadim Ilin
 */
public interface CarService {

    public List<Car> getCars(int quantCars);
}
