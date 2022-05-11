package lesson39.HW39SpringAOP;

import lesson39.HW39SpringAOP.dto.CityDto;
import lesson39.HW39SpringAOP.service.CityDictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@Slf4j
@SpringBootApplication
public class AspectRunner {

    private static final String MSC = "MSC";
    private static final String SOCHI = "SOCHI";

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(AspectRunner.class, args);
        CityDictionaryService cityDictionaryService = applicationContext.getBean(CityDictionaryService.class);
        Set<CityDto> cities = cityDictionaryService.getCity();
        log.info("Получен список городов {}", cities);

        CityDto msc = cityDictionaryService.getCityByCode(MSC).orElse(null);
        log.info("Информация о городе с кодом {}: {}", MSC, msc);

        CityDto sochi = cityDictionaryService.getCityByCode(SOCHI).orElse(null);
        log.info("Информация о городе с кодом {}: {}", SOCHI, sochi);
    }
}
