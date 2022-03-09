package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarServiceImpl;

/**
 * @author Vadim Ilin
 */
@Controller
@RequestMapping("/cars")
public class CarController {

    private CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count,
                            Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars/cars";
    }
}
