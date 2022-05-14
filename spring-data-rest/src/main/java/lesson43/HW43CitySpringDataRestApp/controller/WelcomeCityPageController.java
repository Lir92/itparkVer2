package lesson43.HW43CitySpringDataRestApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeCityPageController {

    @GetMapping
    public String index() {
        return "index";
    }
}
