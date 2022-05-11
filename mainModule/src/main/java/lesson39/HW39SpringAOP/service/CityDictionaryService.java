package lesson39.HW39SpringAOP.service;

import lesson39.HW39SpringAOP.dto.CityDto;

import java.util.Optional;
import java.util.Set;

public interface CityDictionaryService {

    Set<CityDto> getCity();
    Optional<CityDto> getCityByCode(String code);
}
