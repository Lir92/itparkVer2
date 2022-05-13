package lesson41.HW41ReactCityWebApp;

import lesson41.HW41ReactCityWebApp.model.City;
import lesson41.HW41ReactCityWebApp.repository.CityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
@EnableMongoRepositories
public class ReactCityWebRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReactCityWebRunner.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> composedCityRoutes(CityRepository cityRepository) {
        return route()
                .GET("/api/cities", accept(APPLICATION_JSON),
                        request -> ok().contentType(APPLICATION_JSON).body(cityRepository.findAll(), City.class)
                )
                .DELETE("/api/cities/{id}",
                        request -> cityRepository.deleteById(request.pathVariable("id")).flatMap(v -> ok().build())
                ).build();
    }

}
