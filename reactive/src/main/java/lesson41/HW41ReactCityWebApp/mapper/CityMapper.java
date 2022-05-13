package lesson41.HW41ReactCityWebApp.mapper;

import lesson41.HW41ReactCityWebApp.dto.CityDto;
import lesson41.HW41ReactCityWebApp.model.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface CityMapper {

    @Mappings({
            @Mapping(target = "id", source = "entity.id"),
            @Mapping(target = "ruName", source = "entity.ruName"),
            @Mapping(target = "enName", source = "entity.enName"),
            @Mapping(target = "code", source = "entity.code"),
            @Mapping(target = "population", source = "entity.population")
    })
    CityDto toDto(City entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.id"),
            @Mapping(target = "ruName", source = "dto.ruName"),
            @Mapping(target = "enName", source = "dto.enName"),
            @Mapping(target = "code", source = "dto.code"),
            @Mapping(target = "population", source = "dto.population")
    })
    City toEntity(CityDto dto);

    default List<CityDto> toDtos(List<City> entities){
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<CityDto> toOptionalDtos(Optional<City> entity) {
        return entity.map(this::toDto);
    }

}
