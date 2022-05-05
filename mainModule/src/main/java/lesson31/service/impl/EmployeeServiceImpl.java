package lesson31.service.impl;

import lesson25.entity.Department;
import lesson25.entity.Employee;
import lesson31.repository.DepartmentRepository;
import lesson31.repository.EmployeeRepository;
import lesson31.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @Setter(onMethod_ = {@Lazy, @Autowired})
    private EmployeeServiceImpl self;

    @Override
    public List<Employee> findBySalary(BigDecimal salary) {
        List<Employee> employees = employeeRepository.findBySalary(salary);
        employees.forEach(employee -> {
            final Department department = employee.getDepartment(); // обход аннотации @Lazy
        });
        return employees;
    }

    @Override
    public List<Employee> findBySalaryAndName(BigDecimal salary, String name) {
        return employeeRepository.findBySalaryOrEmpName(salary, name);
    }

    @Override
    public List<Employee> findByDepartmentId(Integer id) {
        return employeeRepository.findEmployeeByDepartmentId(id);
    }

    @Override
    @Transactional(noRollbackFor = IllegalStateException.class, rollbackFor = URISyntaxException.class) // такая анотация вешается над методом не на сервисе, а на имплементации
    public void resetSalary(Integer id) {
        employeeRepository.updateById(id, BigDecimal.ZERO);
//        self.updateDepartment(id, 15); // только используя self правильно отработает метод, над которым развешаны
//        //аннотации метода, иначе они будут проигнорированы(сброшены)
    }

    @Override
    @Transactional//(propagation = Propagation.REQUIRES_NEW)
    public void updateDepartment(Integer employeeId, Integer departmentId) {
        employeeRepository.updateDepartmentForEmployee(
                departmentRepository.getById(departmentId),
                employeeId
        );
    }

    @Override
    @Transactional
    public void updateEmployeeById(Integer employeeId, String newEmpName) {
        employeeRepository.findById(employeeId).ifPresent(employee -> {
            employee.setEmpName(newEmpName);
        });
    }

//    @Override
//    public List<Employee> findAllByEmpName(String name) {
//        return employeeRepository.findAllByEmpName(name, PageRequest.of(1, 2)); // возвращает с указанной страницы
//        // указанное кол-во результатов, т.е. если под параметры подходит 100 результатов, выведутся только 2.
//    }


    // здесь - в limit определяется ограничитель (стр 0, макс. кол-во данных - 2);
    // затем возвращается первая выборка по заданным параметрам с первой страниц (0-ая страница), затем переходим к
    // следующей странице. Если там есть данные, то они тоже считываются, если нет, идёт вывод в консоль и так пока не
    // считаются все данные.
    @Override
    public List<Employee> findAllByEmpName(String name) {
        List<Employee> result = new ArrayList<>();
        Pageable limit = PageRequest.of(0, 2); // разметка страницы, т.е. страница 0 с 2 элементами на ней.
        Page<Employee> page;
        do {
            page = employeeRepository.findAllByEmpName(name, limit);
            result.addAll(page.getContent());
            limit = page.nextPageable();
        } while (page.hasNext());
        return result;
    }
}
