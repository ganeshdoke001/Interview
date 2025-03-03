package com.codeq.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.codeq.Employee;

public class Sort {

    public static void main(
            String arg[]) {

        List<Employee> empList = List.of(new Employee(1, "Ganesh", 34000.00, "IT"),
                new Employee(2, "Rahul", 44000.00, "MECH"), new Employee(3, "Akash", 55000.00, "CIVIL"),
                new Employee(4, "Amol", 89000.00, "IT"), new Employee(5, "Naru", 98000.00, "MECH"),
                new Employee(6, "Vaishi", 39000.00, "CIVIL"), new Employee(7, "Sona", 78000.00, "IT"));

        // 2nd max
        empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal)
                        .reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        // sort on based on max sal and dept

        empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)
                                .reversed())))
                .entrySet()
                .forEach(e -> {
                    e.getValue()
                            .ifPresent(p -> System.out.println(e.getKey() + " : " + p.getSal()));
                });
        System.out.println(empList.stream()
                .count());

        System.out.println(empList.stream()
                .collect(Collectors.averagingDouble(Employee::getSal))
                .doubleValue());

        // nth highest salary of employee
        int n = 4;
        Entry<String, Double> s = empList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSal))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingDouble(Map.Entry::getValue))
                .collect(Collectors.toList())
                .get(n - 1);

        Employee e = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal)
                        .reversed())
                .collect(Collectors.toList())
                .get(n - 1);

        System.out.println(e.getName() + " : " + e.getSal());
        // nth highest

        Employee e1 = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSal)
                        .reversed())
                .toList()
                .get(n - 1);

        System.out.println(e1.getName() + " : " + e1.getSal());

    }
}
