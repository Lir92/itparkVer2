package lesson40;

import com.github.cloudyrock.spring.v5.EnableMongock;
import lesson40.dto.BookDto;
import lesson40.dto.CityDto;
import lesson40.dto.GenreDto;
import lesson40.service.BookService;
import lesson40.service.CityService;
import lesson40.service.GenreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.UUID;

@EnableMongock // необходимая аннотация для миграций
@SpringBootApplication
public class MongoRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(MongoRunner.class, args);
        final GenreService genreService = applicationContext.getBean(GenreService.class);
        genreService.save(new GenreDto("det", "Детективы"));
        genreService.save(new GenreDto("tri", "Триллеры"));
        final GenreDto roman = new GenreDto("rom", "Романы");
        genreService.save(roman);
        final BookService bookService = applicationContext.getBean(BookService.class);
        bookService.save(new BookDto(UUID.randomUUID().toString(), "978-5-17-087888-8", "Анна Каренина", roman.getCode()));

        final CityService cityService = applicationContext.getBean(CityService.class);
        CityDto city = new CityDto("ANA93", "Анапа", "Anapa", 93L, 123L);
        cityService.save(city);
    }
}