package lesson31.service;

import lesson25.entity.Employee;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {

    List<Employee> findBySalary(BigDecimal salary);

    List<Employee> findBySalaryAndName(BigDecimal salary, String name);

    List<Employee> findByDepartmentId(Integer id);

    void updateEmployeeById(Integer employeeId, String newEmpName);

    void resetSalary(Integer id);

    void updateDepartment(Integer employeeId, Integer departmentId);

//    List<Employee> findAllByEmpName(String name);

    List<Employee> findAllByEmpName(String name);
}
