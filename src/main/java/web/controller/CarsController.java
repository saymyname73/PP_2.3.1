package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService;

@Controller
@RequestMapping("")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count, Model model) {
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
