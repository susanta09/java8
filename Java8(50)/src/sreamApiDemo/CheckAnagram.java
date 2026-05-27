package sreamApiDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//public static void main(String[] args) {
//	String a="mam";
//	String b="mmam";
//	Map<Character, Long> m1=a.chars().mapToObj(e->(char)e)
//			.collect(Collectors.groupingBy(e->e,Collectors.counting()));
//	Map<Character, Long> m2=b.chars().mapToObj(e->(char)e)
//			.collect(Collectors.groupingBy(e->e,Collectors.counting()));
//	if(m1.equals(m2))
//	{
//		System.out.println("is anagram");
//	}
//	
//	
////	boolean isAnagram = 
////		    a.length() == b.length() &&
////		    a.chars().sorted().toArray().equals(b.chars().sorted().toArray());
//			
//	
//}



//Input: ["eat","tea","tan","ate","nat","bat"]
//
//		Output:
//		[
//		 [eat, tea, ate],
//		 [tan, nat],
//		 [bat]
//		]
public class CheckAnagram {

	public static void main(String[] args) {
		 String[] input = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> map=Arrays.stream(input).collect(Collectors.groupingBy(
				str -> str.chars()
				.sorted()
				.mapToObj(c->(char)c) //int to Character 
				.map(String::valueOf)// character to string
				.collect(Collectors.joining())
				));
		
map.values().forEach(System.out::println);
System.out.println(map);


        Collection<List<String>> result =
            Arrays.stream(input)
                  .collect(Collectors.groupingBy(
                      str -> str.chars()
                                .sorted()
                                .mapToObj(c -> String.valueOf((char)c))
                                .collect(Collectors.joining())
                  ))
                  .values();
		
	}


}



















