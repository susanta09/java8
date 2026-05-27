package Stream;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary()
    {
    	return salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class SortByNameExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Charlie", 6000),
            new Employee("Alice", 5000),
            new Employee("David", 4000),
            new Employee("Bob", 7000)
        );

        // 🔸 Ascending order (A-Z)
        List<Employee> sortedAsc = employees.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());

        System.out.println("Sorted by Name (Ascending):");
        sortedAsc.forEach(System.out::println);

        // 🔸 Descending order (Z-A)
        List<Employee> sortedDesc = employees.stream()
            .sorted(Comparator.comparing(Employee::getName).reversed())
            .collect(Collectors.toList());

        System.out.println("\nSorted by Name (Descending):");
        sortedDesc.forEach(System.out::println);
        
        
        
        // 🔸 Ascending order
        List<Employee> sortedAscs = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());

        System.out.println("Sorted by Salary (Ascending):");
        sortedAscs.forEach(System.out::println);
        
        List<Employee> sortedAscsL = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .limit(2).skip(1)
                .collect(Collectors.toList());

            System.out.println("Sorted by Salary (Ascending):");
            sortedAscsL.forEach(System.out::println);
            
        // 🔸 Descending order
        List<Employee> sortedDescs = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        System.out.println("\nSorted by Salary (Descending):");
        sortedDescs.forEach(System.out::println);
    }
    
}

