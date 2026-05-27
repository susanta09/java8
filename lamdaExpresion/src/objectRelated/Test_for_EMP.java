package objectRelated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private int joinYear;
    private String gender;
    private String department;
	public Employee(String name, double salary, int joinYear,String gender,String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.joinYear = joinYear;
		this.gender=gender;
		this.department=department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getJoinYear() {
		return joinYear;
	}
	public void setJoinYear(int joinYear) {
		this.joinYear = joinYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
    
  
}

public class Test_for_EMP {
    public static void main(String[] args) {
        // Example list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000,2012,"Female","HR"));
        employees.add(new Employee("Bob", 60000,2015,"Male","IT"));
        employees.add(new Employee("Charlie", 45000,2010,"Male","Finance"));
        employees.add(new Employee("David", 70000,2018,"Male","HR"));
        employees.add(new Employee("Eve",70000,2017, "Female","HR"));
//============================================================
        // Find the employee with the highest salary
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        // Check if max is present and print the result
        highestPaidEmployee.ifPresent(employee ->
                System.out.println("Highest paid employee: " + employee.getName() + " ($" + employee.getSalary() + ")"));
        
        String highestPaidEmployeeName = employees.stream()
                .max(Comparator.comparing(Employee::getSalary)).get().getName();
        System.out.println(highestPaidEmployeeName);

 //============================================================
        
        // Filter employees who joined after 2014
        List<Employee> employeesJoinedAfter2014 = employees.stream()
                .filter(employee -> employee.getJoinYear() > 2014)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Employees who joined after 2014:");
        employeesJoinedAfter2014.forEach(employee ->
                System.out.println(employee.getName() + " joined in " + employee.getJoinYear()));
  //===========================================================
                   //******using Collectors.groupingBy()*******
        // Group employees by gender and count the number of employees in each group
        Map<String, Long> genderCounts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        // Print the counts
        System.out.println(genderCounts);
        System.out.println("Number of male employees: " + genderCounts.getOrDefault("Male", 0L));
        System.out.println("Number of female employees: " + genderCounts.getOrDefault("Female", 0L));
        
        Map<String, Long> genderCounts1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,TreeMap::new,Collectors.counting()));

        // Print the counts
        System.out.println(genderCounts);
        System.out.println("Number of male employees: " + genderCounts1.getOrDefault("Male", 0L));
        System.out.println("Number of female employees: " + genderCounts1.getOrDefault("Female", 0L));
        
        // Count male employees
        long maleCount = employees.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .count();
        			//******using filter()*******
        // Count female employees
        long femaleCount = employees.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
                .count();

        // Print the counts
        System.out.println("Number of male employees: " + maleCount);
        System.out.println("Number of female employees: " + femaleCount);
        
   //===============================================================
        // Calculate the average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary) // Extract salary as double values
                .average() // Calculate the average
                .orElse(0); // If the stream is empty, return 0 as default value

        // Print the average salary
        System.out.println("Average salary: " + averageSalary);
        
               //********using collectors.averagingInt()******
        Double ave=employees.stream()
        		.collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary: " + ave); 
        
    //=========================================================================
        // Get all unique department names
        List<String> departments = employees.stream()
                .map(Employee::getDepartment) // Extract department names
                .distinct() // Filter out duplicates
                .collect(Collectors.toList()); // Convert stream to list

        // Print all department names 
        System.out.println("Unique department names:");
        departments.forEach(System.out::println);
        
        
        Map<String,Double> avgOfMaleAndFemaleSalary=
        		employees.stream()
        		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Avg of male salary: "+ avgOfMaleAndFemaleSalary.getOrDefault("Male",(double) 0L));
        System.out.println("Avg of Female salary: "+ avgOfMaleAndFemaleSalary.getOrDefault("Female",(double) 0L));
  //==================================================================================
        //******find kTH Experience employee  
       Employee e=employees.stream()
    		   .sorted((a,b)->a.getJoinYear()-b.getJoinYear())
    		   .distinct()
    		   .skip(2)
    		   .findFirst().get();
       System.out.println(e.getName());
       
       // Find the employee with the most working experience based on joining year
       Optional<Employee> mostExperiencedEmployee = employees.stream()
               .max(Comparator.comparing(employee -> LocalDate.now().getYear() - employee.getJoinYear()));

       // Check if max is present and print the result
       mostExperiencedEmployee.ifPresent(employee ->
       System.out.println("Most experienced employee: " + employee.getName() + " (Joined in " + employee.getJoinYear() + ")"));
       
  

  //==========================================================================
       Optional<Employee> r=employees.stream()
    		   .filter(emp->emp.getGender().equals("Female")&& emp.getDepartment().equals("HR"))
    		   .min(Comparator.comparing(emp->LocalDate.now().getYear()-emp.getJoinYear()));
       
       r.ifPresent(employee->
       System.out.println("Youngest Female Employee in HR department: "+employee.getName()));

    }
}
