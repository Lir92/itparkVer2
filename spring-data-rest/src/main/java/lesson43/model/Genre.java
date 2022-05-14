package lesson43.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GENRE")
public class Genre {

    @Id
    @NotEmpty
    @Column(name = "CODE", nullable = false, unique = true)
    private String code;

    @NotEmpty
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
}