package lesson41.HW41ReactCityWebApp.repository;

import lesson41.HW41ReactCityWebApp.model.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CityRepository extends ReactiveMongoRepository<City, String> {
}
