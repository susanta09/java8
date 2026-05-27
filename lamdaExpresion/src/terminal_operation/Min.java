package terminal_operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
class Person{
	String name;
	Integer age;
	int sal;
	public Person(String name, Integer age,int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
	
}

public class Min {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
		
		
		Optional<Integer> max = numbers.stream().min(Comparator.naturalOrder());
		max.ifPresent(System.out::println);
		
		numbers.stream()
				.min(Integer::compare)
				.ifPresent(System.out::println);
		
		List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");
		Optional<String> longest = strings.stream()
						.min(Comparator.comparing(String::length));//length
		longest.ifPresent(System.out::println);
		
		strings.stream().min(String::compareTo)
						.ifPresent(System.out::println);//dicsionary
		
		
		List<Person> people = Arrays.asList(
			    new Person("Alice", 30,15000),
			    new Person("Bob", 25,12000),
			    new Person("Charlie", 35,10000)
			);

			Optional<Person> oldest = people.stream().min(Comparator.comparing(Person::getAge));
			oldest.ifPresent(System.out::println); 
			String name=people.stream()
							  .min(Comparator.comparing(Person::getSal))
//							  .min(Comparator.comparingInt(Person::getSal))
							  .get().getName();
			System.out.println(name);
			
		
		
	}

}
