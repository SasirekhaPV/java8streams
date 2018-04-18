package com.learnshare.javastreams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8StreamsUsingObjects {

    public static void main(String[] args) {

        convertListOfObjectsAndFilterUsingStream();
    }

    private static void convertListOfObjectsAndFilterUsingStream() {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 25, "CAP", new BigDecimal(4000.00)),
                new Employee("David", 25, "CAP", new BigDecimal(5000.00)),
                new Employee("Mark", 30, "CAP", new BigDecimal(5000.00)),
                new Employee("Alice", 32, "CAP", new BigDecimal(6000.00)),
                new Employee("Tim", 35, "CAP", new BigDecimal(7000.00))
        );

        //Before Java 8
        List<String> employeesWhosAgeIsAround30 = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getAge() >= 30) {
                employeesWhosAgeIsAround30.add(employee.getName());
            }
        }

        System.out.println("Employees whose age is around  30 ");
        System.out.println(employeesWhosAgeIsAround30);

        //Using Java 8
        employeeList.stream()
                .filter(employee -> employee.getAge() >= 30)
                .map(employee -> employee.getName())
                .forEach(System.out::println);

        System.out.println("Employees whose age is around 30 using Streams ");
    }
}
