package lesson43.HW43CitySpringDataRestApp.service;

import lesson43.HW43CitySpringDataRestApp.dto.CityDto;
import lesson43.HW43CitySpringDataRestApp.dto.CityPageDto;
import lesson43.HW43CitySpringDataRestApp.model.City;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface CityService {

    List<CityDto> findAll();
    CityPageDto getPage(Pageable pageable);
    Optional<CityDto> getById(@NotEmpty String id);
    CityDto save (@Valid CityDto city);
    void deleteById(String id);
    void delete(@Valid City city);
}
