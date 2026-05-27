package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartWith1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,10,23,15,39,1,100,2);
		List<Integer> l=list.stream()
			//	.map(String::valueOf)
				.filter(e->String.valueOf(e).startsWith("1"))
				.collect(Collectors.toList());
		l.forEach(System.out::println);
	}
}
