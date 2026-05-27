package sreamApiDemo;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {
	public static void main(String[] args) {
		String st="hello world world";
		//find frequency of word
		Arrays.stream(st.split("\\s++"))
		.filter(s->!s.isEmpty())
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()))
				.forEach((string,count)->{
							System.out.println(string+" : "+count);
						});
		//find length of each word// it not work for input="hello world world";
		//because of duplicates
////		Arrays.stream(st.split(" "))
//		.filter(s->!s.isEmpty())
//		.collect(Collectors.toMap(
////				Function.identity(),
//				e->e,
//				String::length))
//		.forEach((string,count)->{
//			System.out.println(string+" : "+count);
//				});
		
System.out.println("=============================================");		
		
		Arrays.stream(st.split(" "))
		.distinct()
		.filter(s->!s.isEmpty())
		.collect(Collectors.toMap(
//				Function.identity(),
				e->e,
				String::length))
		.forEach((string,count)->{
			System.out.println(string+" : "+count);
				});
		
	}

}
