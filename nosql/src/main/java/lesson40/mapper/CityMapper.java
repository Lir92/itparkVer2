package lesson40.mapper;

import lesson40.dto.BookDto;
import lesson40.dto.CityDto;
import lesson40.model.Book;
import lesson40.model.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface CityMapper {

    @Mappings({
            @Mapping(target = "id", source = "city.id"),
            @Mapping(target = "ruName", source = "city.ruName"),
            @Mapping(target = "enName", source = "city.enName"),
            @Mapping(target = "code", source = "city.code"),
            @Mapping(target = "population", source = "city.population")
    })
    CityDto toDto(City city);

    @Mappings({
            @Mapping(target = "id", source = "city.id"),
            @Mapping(target = "ruName", source = "city.ruName"),
            @Mapping(target = "enName", source = "city.enName"),
            @Mapping(target = "code", source = "city.code"),
            @Mapping(target = "population", source = "city.population")
    })
    City toEntity(CityDto city);

    default List<CityDto> toDtos(List<City> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<CityDto> toOptionalDto(Optional<City> entity) {
        return entity.map(this::toDto);
    }
}
