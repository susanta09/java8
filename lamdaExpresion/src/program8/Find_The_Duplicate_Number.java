package program8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_The_Duplicate_Number {
	public static void main(String[] args) {
Integer array[]= {6,4,9,6,5,1,3,3};
		
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
//===================Using Collections.frequency(list, e)====================	
		
		Set<Integer> dub=list.stream().filter(e->Collections.frequency(list, e)>1)
				.collect(Collectors.toSet());
		System.out.println(dub);
		
//===================Using Collections.frequency(list, e)====================		
		Map<Integer, Long> fMap = list.stream()
				.collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
		System.out.println(fMap);
		
		Map<Integer, Long> dMap = fMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(dMap);
	
		/*
		 *  Collectors.groupingBy() is actually part of the java.util.stream.Collectors class
		 * Collectors.groupingBy() is a powerful tool in Java streams for efficiently
		 * grouping elements of a stream based on various criteria, providing a
		 * convenient way to perform operations such as counting, summing, or
		 * aggregating data within each group.
		 * 
		 * The Collectors.toMap() method in Java's Stream API is used to collect elements from a stream into a Map.
		 * Collectors.toMap(keyMapper, valueMapper)
		 * 
		 * keyMapper: This is a function that extracts a key from each element of the stream.
           valueMapper: This is a function that extracts a value from each element of the stream.
		 */	 
	
		
		
	}

}
