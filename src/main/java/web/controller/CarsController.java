package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {

    @Autowired
    private CarService carSer;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer id, ModelMap model) {
        model.addAttribute("cars", carSer.show(id));
        return "cars";
    }
//    @GetMapping("/cars")
//    public String carss(ModelMap model) {
//        model.addAttribute("cars", carSer.getCars());
//        return "cars";
//    }
}

