package lesson40.service;

import lesson40.dto.CityDto;
import lesson40.dto.CityPageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface CityService {
    List<CityDto> findAll();
    CityPageDto getPage(Pageable pageable);
    Optional<CityDto> getById(String cityId);
    CityDto save(@Valid CityDto city);
    void deleteById(String cityId);
    void delete(@Valid CityDto city);
}
