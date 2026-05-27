package sreamApiDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrindAllDuplicatesNumber {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,6,5,7,4,6,1,9);
		Set<Integer> set=new HashSet<Integer>();
		list.stream().filter(e->!set.add(e)).forEach(System.out::println);
		//all unic number
		List<Integer>l=list.stream().collect(Collectors.groupingBy(
				Function.identity(),
					Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
//		System.out.println(l);
		//remove duplicates
//		list.stream().distinct().forEach(System.out::println);
	
	}

}
