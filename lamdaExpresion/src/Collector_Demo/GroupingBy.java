package Collector_Demo;


import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupingBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25),
                new Person("sumsn", 10)
        );

        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        //output map is TreeMap sorted order
                        TreeMap::new, //{10=[Person{name='sumsn', age=10}], 25=[Person{name='Bob', age=25}, Person{name='David', age=25}], 30=[Person{name='Alice', age=30}, Person{name='Charlie', age=30}]}
                      //output map is HashMap not sorted
                      //  HashMap::new,  //{25=[Person{name='Bob', age=25}, Person{name='David', age=25}], 10=[Person{name='sumsn', age=10}], 30=[Person{name='Alice', age=30}, Person{name='Charlie', age=30}]}
                        Collectors.toList()
                ));
        System.out.println(groupedByAge);
        
        
        Map<Integer, List<Person>> groupedByAge1= people.stream()
        		.collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupedByAge1);
        
        Map<Integer, List<Person>> groupedByAge2= people.stream()
        		.collect(Collectors.groupingBy(Person::getAge,Collectors.toList()));
        System.out.println(groupedByAge2);
        
        
        
    }
}

