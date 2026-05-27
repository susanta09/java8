package lamdaExpresion;

public class Employee {
	String name;
	int age;
	double sal;
	
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
