package lesson25.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "employee")
@ToString(exclude = "department") // исключаем это поле из распечатки
@NamedEntityGraph(name = Employee.DEPARTMENT_GRAPH_NAME, attributeNodes = {@NamedAttributeNode("department")})
public class Employee {

    public static final String DEPARTMENT_GRAPH_NAME = "Employee.department";

    @Id
    @Column(name = "emp_id")
    @GeneratedValue//(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    private BigDecimal salary;

    @ManyToOne(fetch = FetchType.LAZY) // если ничего не указывать в скобках, то по умолчанию подтянется и это поле.
    @JoinColumn(name = "department_id")
    private Department department;
}
