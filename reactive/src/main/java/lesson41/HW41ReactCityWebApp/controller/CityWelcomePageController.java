package lesson41.HW41ReactCityWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityWelcomePageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
