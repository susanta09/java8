package QueryDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

 class Employee {
    Integer id;
    String name;
    String dept;
    Double sal;

    public Employee(Integer id, String name, String dept, Double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
    
}

public class StreamDemo {
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
		List<Employee> el=getEmployees();
		List<Employee> result=new ArrayList<Employee>();
		
		
//		//1.Get all the Employee Who are work it dept?============
		
//		System.out.println("//1.Get all the Employee Who are work "IT" dept?");
//		result=el.stream().filter(e->"IT".equalsIgnoreCase(e.dept))
//											.collect(Collectors.toList());
//		result.forEach(System.out::println);
//		
//		//2.Get all the Employee whose salary greater then 6000?================
		
//		System.out.println("//======2.Get all the Employee whose salary greater then 6000?");
//		result=el.stream().filter(e->e.sal!=null&&e.sal>60000).collect(Collectors.toList());
//		result.forEach(System.out::println);
		
//		System.out.println("//======3.Get all the Employee whose salary greater then 6000 and work it dept ?");
//
//		//3.Get all the Employee whose salary greater then 6000 and work it dept ?==============
		
//		result=el.stream().filter(e->"IT".equalsIgnoreCase(e.dept)&&e.sal>70000)
//																.collect(Collectors.toList());
//		result.forEach(System.out::println);
		
//4.Find the number of employee in each dept?================================
		
//		Map<String, Long> map1=el.stream().filter(e->e.dept!=null)
//								.collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//		map1.forEach((d,c)->System.out.println(d+"->"+c));
//		
//5.Find avarage salary in each department?================================
		
//		Map<String, Double> m1=el.stream().filter(e->e.dept!=null).filter(e->e.sal!=null)
//									.collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSal)));
//		m1.forEach((d,c)->System.out.println(d+"->"+c));
		
//6.Print Total salary in each department?================================
//		
//		Map<String, Double> totalSalaryPerDept = el.stream()
//		        .filter(e -> e.dept != null && e.sal != null) // avoid nulls
//		        .collect(Collectors.groupingBy(
//		                Employee::getDept,
//		                Collectors.summingDouble(e -> e.sal)
//		        ));
//
//		totalSalaryPerDept.forEach((dept, total) ->
//		        System.out.println(dept + " -> " + total)
//		);
		
//		List<Double>ld = el.stream()
//		        .filter(e -> e.dept != null && e.sal != null) // avoid nulls
//		        .collect(Collectors.groupingBy(
//		                Employee::getDept,
//		                Collectors.summingDouble(e -> e.sal)
//		        )).values().stream().collect(Collectors.toList());
//		System.out.println(ld);
		
//7.Find the all Employee whose name start with "A" or  "J" in HR department?=============
		
//		List<Employee> r=el.stream()
//				.filter(e->e.dept!=null&&e.name!=null)
//				.filter(e->"HR".equalsIgnoreCase(e.dept)
//								&&( e.name.startsWith("N")||e.name.startsWith("P")))
//				.peek(e->System.out.println(e))
//				.collect(Collectors.toList());
//		System.out.println(r);
		
		
//8.Find Total salary of employee from "IT" dept and each employee have salary more then 60000.===
		
//		Double tsalary=el.stream()
//				.filter(e->"IT".equalsIgnoreCase(e.dept)&&e.sal>60000)
//				.mapToDouble(Employee::getSal)
//				.sum();
//		System.out.println(tsalary);
		
//9.1.Print the sorted list of employee based on salary(asc) from the "Finance" dept========
		
//		List<Employee>list=el.stream()
//								.filter(e->e.dept!=null&&e.sal!=null)
//								.filter(e->"Finance".equals(e.dept))
//								.sorted(Comparator.comparingDouble(Employee::getSal))
//								.collect(Collectors.toList());
//		list.forEach(e->System.out.println(e));
		
//9.2.Print the sorted list of employee based on salary(desc) from the "Finance" dept==========
		
//		List<Employee>list1=el.stream()
//				.filter(e->e.dept!=null&&e.sal!=null)
//				.filter(e->"Finance".equals(e.dept))
//				.sorted(Comparator.comparingDouble(Employee::getSal).reversed())
//				.collect(Collectors.toList());
//		list1.forEach(e->System.out.println(e));
		
//9.3.Print only name of employee sorted based on salary(desc) from the Finance dept========
		
//		List<String>naleList=el.stream()
//				.filter(e->e.dept!=null&&e.sal!=null)
//				.filter(e->"Finance".equals(e.dept))
//				.sorted(Comparator.comparingDouble(Employee::getSal).reversed())
//				.map(Employee::getName)
//				.collect(Collectors.toList());
//		naleList.forEach(e->System.out.println(e));
		
//10.print 3 highest paid employee============================================
		
//		el.stream().filter(e->e.sal!=null)
//				.sorted(Comparator.comparing(Employee::getSal).reversed())
//				.distinct()
//				.limit(3)
//				.forEach(System.out::println);
		
//10.1.print 3 lowest paid employee=================================================
		
//				el.stream().filter(e->e.sal!=null)
//						.sorted(Comparator.comparing(Employee::getSal))
//						.distinct()
//						.limit(3)
//						.forEach(System.out::println);
		
//		Map<String, List<Employee>> map=el.stream()
//				.filter(e->e.getDept()!=null)
//				.collect(Collectors.groupingBy(Employee::getDept));
//		map.entrySet().forEach(System.out::println);      
		
		
//		Map<String,Double> map=el.stream()
//				.filter(e->e.getDept()!=null&&e.getSal()!=null)
//				.collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSal)));
//		map.forEach((a,b)->System.out.println(a+" - "+b));
		
// Find the highest salary in each department=======================================
		
//		Map<String, Employee> es=el.stream().filter(e->e.getSal()!=null&&e.getDept()!=null)
//				.collect(Collectors.groupingBy(Employee::getDept))
//				.entrySet().stream().collect(Collectors.toMap(
//						Map.Entry::getKey,
//						entry -> entry.getValue().stream().max(Comparator.comparing(Employee::getSal))
//						.orElse(null)
//						));
//		es.forEach((d,e)->{
//					System.out.print(d+"->");
//					System.err.print(e);
//					System.out.println();
//		});
		
//		Map<String, Employee> m=el.stream()
//				.filter(e->e.getSal()!=null&&e.getDept()!=null)
//				.collect(Collectors.groupingBy(Employee::getDept,
//						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)), 
//														opt->opt.orElse(null))));
//		m.forEach((dept,emp)->{
//			System.out.println(dept);
//			System.out.println(emp.getSal());
//		});
//		Map<String, Optional<Employee>> m=el.stream()
//				.filter(e->e.getSal()!=null&&e.getDept()!=null)
//				.collect(Collectors.groupingBy(Employee::getDept,
//						Collectors.maxBy(Comparator.comparing(Employee::getSal))));
//		m.forEach((dept,emp)->{
//			System.out.println(dept);
//			System.out.println(emp.orElse(null));
//		});

//		Map<String, Employee> m = el.stream()
//			    .collect(Collectors.groupingBy(
//			        e -> e.getDept() == null ? "UNKNOWN" : e.getDept(),
//			        Collectors.collectingAndThen(
//			            Collectors.maxBy(
//			                Comparator.comparingDouble(e -> 
//			                    e.getSal() == null ? 0.0 : e.getSal())
//			            ),
//			            opt -> opt.orElse(null)
//			        )
//			    ));
//		m.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue().getSal()));
		
		Map<String, Double> m = el.stream()
			    .collect(Collectors.groupingBy(
			        e -> e.getDept() == null ? "UNKNOWN" : e.getDept(),
			        	Collectors.averagingDouble(
			        			e->e.getSal()== null ? 0.0 : e.getSal()
			        			)	
			    		));
		m.entrySet().forEach(e->
		System.out.println(e.getKey()+" "+e.getValue())
		);

	System.out.println("End");	
	}
}
