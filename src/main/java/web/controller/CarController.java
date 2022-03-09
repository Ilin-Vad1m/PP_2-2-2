package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

/**
 * @author Vadim Ilin
 */
@Controller
@RequestMapping("/cars")
public class CarController {

    private CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count,
                            Model model) {
        model.addAttribute("cars", carDAO.getCars(count));
        return "cars/cars";
    }
}
