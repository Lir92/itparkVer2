package lesson39.HW39SpringAOP.service.impl;

import lesson39.HW39SpringAOP.dto.CityDto;
import lesson39.HW39SpringAOP.service.CityDictionaryService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CityDictionaryServiceImpl implements CityDictionaryService {

    private static final Set<CityDto> CITY_DTOS = Set.of(new CityDto("ANAPA", "Анапа"),
            new CityDto("NOVO", "Новороссийск"),
            new CityDto("KRD", "Краснодар"),
            new CityDto("MSC", "Москва"),
            new CityDto("SPB", "Санкт-Петербург"),
            new CityDto("EKB", "Екатеринбург"));

    private static final Map<String, CityDto> CITY_MAP = CITY_DTOS.stream()
            .collect(Collectors.toMap(CityDto::getCityCode, Function.identity()));

    @Override
    public Set<CityDto> getCity() {
        return CITY_DTOS;
    }

    @Override
    public Optional<CityDto> getCityByCode(String code) {
        return Optional.ofNullable(CITY_MAP.get(code));
    }
}
