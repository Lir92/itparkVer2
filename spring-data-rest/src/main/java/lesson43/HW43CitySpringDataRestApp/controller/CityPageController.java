package lesson43.HW43CitySpringDataRestApp.controller;

import lesson43.HW43CitySpringDataRestApp.dto.CityDto;
import lesson43.HW43CitySpringDataRestApp.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CityPageController {

    private final CityService cityService;

    @GetMapping("/cities")
    public String allCities() {
        return "city/cities";
    }

    @GetMapping("/city/add")
    public String newCity() {
        return "city/city";
    }

    @GetMapping("/city/edit")
    public String currentCity(@RequestParam("id") String id, Model model) {
        CityDto currentCity = cityService.getById(id)
                .orElseThrow(() -> new IllegalArgumentException("Non existed city"));
        model.addAttribute("city", currentCity);
        return "city/city";
    }

    @PostMapping("/city/save")
    public String saveCity(CityDto city) {
        cityService.save(city);
        return "redirect:/cities";
    }
}
