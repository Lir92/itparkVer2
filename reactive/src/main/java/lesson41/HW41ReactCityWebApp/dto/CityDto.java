package lesson41.HW41ReactCityWebApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

    @NotNull
    @Size(min = 1, max = 7)
    private String id;

    @NotNull
    @Size(min = 1, max = 120)
    private String ruName;

    @NotNull
    @Size(min = 1, max = 120)
    private String enName;

    private Long code;

    private Long population;

}
