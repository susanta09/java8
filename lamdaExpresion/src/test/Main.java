package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesWithDuplicates = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 60000),
                new Employee("David", 55000),
                new Employee("Eve", 60000)
        );

        List<Employee> uniqueEmployees = employeesWithDuplicates.stream()
                .collect(Collectors.toMap(Employee::getSalary, e -> e, (e1, e2) -> e2))
                .values()
                .stream()
                .collect(Collectors.toList());

        System.out.println("Unique employees based on salary:");
        uniqueEmployees.forEach(System.out::println);
    }
}

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//class Employee {
//    private String name;
//    private double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(employee.salary, salary) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(salary);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Alice", 50000));
//        employees.add(new Employee("Bob", 60000));
//        employees.add(new Employee("Charlie", 60000));
//        employees.add(new Employee("David", 55000));
//        employees.add(new Employee("Eve", 60000));
//
//        List<Employee> distinctEmployees = employees.stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println("Distinct employees based on salary:");
//        distinctEmployees.forEach(System.out::println);
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Employee {
//    private String name;
//    private double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<Employee> employeesWithDuplicates = Arrays.asList(
//                new Employee("Alice", 50000),
//                new Employee("Bob", 60000),
//                new Employee("Charlie", 60000),
//                new Employee("David", 55000),
//                new Employee("Eve", 60000)
//        );
//
//        List<Employee> uniqueEmployees = employeesWithDuplicates.stream()
//                .collect(Collectors.groupingBy(Employee::getSalary))
//                .values().stream()
//                .map(employees -> employees.get(0))
//                .collect(Collectors.toList());
//
//        System.out.println("Unique employees: " + uniqueEmployees);
//    }
//}
//
//
//
