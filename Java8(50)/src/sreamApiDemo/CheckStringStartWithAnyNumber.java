package sreamApiDemo;

import java.util.Arrays;
import java.util.List;

public class CheckStringStartWithAnyNumber {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("1Apple","2Banana","5Charry","Mango");
		
		list.stream().filter(e->!e.isEmpty()&&Character.isDigit(e.charAt(0)))
						.forEach(System.out::println);
//		list.stream().filter(e->!e.isEmpty()&&Character.isAlphabetic(e.charAt(0)))
//		.forEach(System.out::println);

	}
}
