package lesson43.HW43CitySpringDataRestApp.repository;

import lesson43.HW43CitySpringDataRestApp.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRepository extends JpaRepository<City, String> {
}
