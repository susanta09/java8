package sreamApiDemo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfUniqueNumber {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,10,2,15,10,3,1,100,2);
		int sum=list.stream().distinct()
//				.peek(e->System.out.print(e+" "))
				.mapToInt(Integer::valueOf).sum();
		System.out.println(sum);
		//Frequency of number
		Map<Integer, Long> map=list.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()));
		System.err.println(map);
		System.err.println(map.getClass());//class java.util.LinkedHashMap
		Map<Integer, Long> map1=list.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		System.err.println(map1);
		System.err.println(map1.getClass());//class java.util.HashMap

		

	}

}
