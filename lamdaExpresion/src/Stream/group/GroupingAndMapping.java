package Stream.group;

import java.util.*;
import java.util.stream.Collectors;
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name;
    }
}
public class GroupingAndMapping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "Engineering"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Engineering"),
            new Employee("Eve", "Marketing")
        );

        Map<String, List<String>> namesByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(emp -> emp.name, Collectors.toList())
            ));

        namesByDept.forEach((dept, names) -> {
            System.out.println(dept + ": " + names);
        });
       
        Map<String, Long> countByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
            ));
        System.out.println();
        System.err.println("-----------------");
        countByDept.forEach((dept, count) -> {
            System.out.println(dept + ": " + count);
        });
        System.out.println();
        System.err.println("-------------");
        countByDept.entrySet().stream()
        						.filter(entry->entry.getValue()>1)
        						.forEach(entry->System.out.println(entry.getKey()));
        
        System.out.println();
        System.err.println("-------------");
		employees.stream().filter(e -> ("HR".equals(e.department)) && e.name.startsWith("A") || e.name.startsWith("J"))
				.collect(Collectors.mapping(e -> e.name, Collectors.toList())).forEach(e->System.out.println(e));;
    }
}

