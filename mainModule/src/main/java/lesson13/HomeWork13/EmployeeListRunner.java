package lesson13.HomeWork13;

import java.util.*;

public class EmployeeListRunner {

    public static void main(String[] args) {

        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee(1, "Ульянов Михаил Ярославович", 7));
        employees.add(new Employee(2, "Плюшкин Борис Романович", 3));
        employees.add(new Employee(3, "Селезнев Михаил Евгеньевич", 11));
        employees.add(new Employee(4, "Селезнев Иван Евгеньевич", 10));
        employees.add(new Employee(5, "Цукерберг Евгений Станиславович", 13));
        employees.add(new Employee(6, "Печенька Даниил Кириллович", 3));
        employees.add(new Employee(7, "Горелый Руслан Романович", 15));
        employees.add(new Employee(8, "Базаров Григорий Сергеевич", 4));
        employees.add(new Employee(9, "Сахаров Леонид Евгеньевич", 11));
        employees.add(new Employee(10, "Петров Андрей Ярославович", 9));

        int experience = 10;
        System.out.println("Находим работников чей стаж ниже установленного - " + experience + " лет.");
        for (Iterator<Employee> experienceIterator = employees.iterator(); experienceIterator.hasNext();) {
            Employee next = experienceIterator.next();
            if (next.getExperience() > experience) {
                System.out.println(next);
            }
        }

        System.out.println("");
        System.out.println("Ниже удаляем работников, стоящих на нечётной позиции:");
        int counter = 0;
        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            counter++;
            if(counter % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(employees);
    }
}
