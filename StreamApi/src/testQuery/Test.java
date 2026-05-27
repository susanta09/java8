package testQuery;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	 public static List<Employee> getEmployees() {
	        return Arrays.asList(
	            new Employee(101, "Amit Kumar", "IT", 75000.00),
	            new Employee(102, "Priya Sharma", "HR", 55000.00),
	            new Employee(103, "Ravi Verma", "Finance", 65000.00),
	            new Employee(104, "Neha Gupta", "Marketing", 60000.00),
	            new Employee(105, "Suresh Reddy", "IT", 80000.00),
	            new Employee(106, "Anjali Singh", "Finance", 70000.00),
	            new Employee(107, "rajesh nair", "HR", 58000.00), // lowercase name
	            new Employee(108, "Deepak Joshi", "Sales", 62000.00),
	            new Employee(109, "Kavita Mehta", "Marketing", 64000.00),
	            new Employee(110, "Manoj Patel", "IT", 90000.00),
	            new Employee(111, "Sunita Yadav", "Sales", 72000.00),
	            new Employee(112, "Vikram Sahu", "Finance", 68000.00),
	            new Employee(113, "Nisha Chauhan", "HR", 50000.00),
	            new Employee(114, "Arun Kumar", "IT", 95000.00),
	            new Employee(114, "susanta barman", "HR", 95000.00),
	            new Employee(115, "Pooja Sharma", "Marketing", 56000.00),
	            new Employee(116, "Gaurav Bansal", "Finance", 88000.00),
	            new Employee(117, "Meena Agarwal", "Sales", 61000.00),
	            new Employee(118, "Harish Singh", "IT", 72000.00),
	            new Employee(119, "Tanya Roy", "HR", 63000.00),
	            new Employee(120, "Vikas Mishra", "Finance", 77000.00),
	            // Duplicates and nulls
	            new Employee(121, "Ajay Kumar", "IT", 75000.00),  // duplicate salary
	            new Employee(122, "Kiran Rao", null, 68000.00),   // null department
	            new Employee(123, "Rahul Dev", "Finance", null),  // null salary
	            new Employee(124, "Priya Sharma", "HR", 55000.00), // same name & salary
	            new Employee(125, "Sameer Khan", "Sales", 62000.00), // same salary as Deepak
	            new Employee(101, "Duplicate ID", "IT", 80000.00) // duplicate ID
	        );
	    }
	 public static void main(String[] args) {
		 List<Employee> ls=getEmployees();
		 
	}

}
