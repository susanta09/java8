package sreamApiDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindWordWith3RdHighestLength {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","banana","kiwi","chery","mango");
		list.stream()
			.sorted(Comparator.comparingInt(String::length).reversed())
			.limit(3).skip(2)
			.findFirst().ifPresent(System.out::println);
		//grouping by length
		Map<Integer, List<String>> map=list.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}

}
