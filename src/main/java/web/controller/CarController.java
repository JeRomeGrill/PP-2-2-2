package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam (value = "count",defaultValue = "5")int count) {
        List<Car> carList = CarServiceImpl.getCarsFromList(Car.createFiveCars(),count);
        model.addAttribute("carlist", carList.toString());
        return "cars";
    }
}
