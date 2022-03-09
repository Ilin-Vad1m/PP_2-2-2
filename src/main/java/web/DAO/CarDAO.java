package web.DAO;

import org.springframework.cache.annotation.CacheAnnotationParser;
import org.springframework.stereotype.Component;
import org.springframework.web.util.pattern.PathPattern;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vadim Ilin
 */
@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("GURRI", 12548, "black"));
        cars.add(new Car("JINNE", 45568, "white"));
        cars.add(new Car("AKSEL", 124578, "blue"));
        cars.add(new Car("BIUK", 653298, "black"));
        cars.add(new Car("LOID", 145871, "red"));
    }

    public List<Car> index() {
        return cars;
    }

    public List<Car> getCars(int quantCars) {
        if(quantCars >= 5 || quantCars == 0){
            return cars;
        }
        return cars.stream().limit(quantCars).collect(Collectors.toList());
    }


}
