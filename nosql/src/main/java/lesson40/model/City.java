package lesson40.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Document(collection = "city")
public class City {

    @Id
    private String id;

    @NotEmpty
    private String ruName;

    @NotEmpty
    private String enName;

    private Long code;

    private Long population;
}
