package lamdaExpresion;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
//		Consumer<String> c= s->System.out.println(s);
//		c.accept("rama");
		
//==========================================================		
		List<String> li=new ArrayList<String>();
		li.add("aa");
		li.add("bb");
		li.add("cc");
		li.add("dd");
		//li.stream().forEach(c);
//note:-forEach() method internally use consumer functional interface
//      if you want to run 18 instruction then you must be write 9 and 10 instruction 
//=============================================================
//note:- if you want execute 23 instruction then no need to write 9 and 10 instruction		
		li.stream().forEach(s->System.out.print(s+" "));
		System.out.println();
		List<Integer> list=Arrays.asList(5,2,6,3,8);
		list.stream().forEach(t->System.out.print(t+" "));
		
		System.out.println();
		List<Employee> emplist=Arrays.asList(
				new Employee("rama",25,2345.90),
				new Employee("krishana",30,2345.90),
				new Employee("balaram",40,52345.90));
		emplist.stream().forEach(t->System.out.println(t.getName()+" "+t.getAge()+" "+t.getSal()));
		
	}
	

}
