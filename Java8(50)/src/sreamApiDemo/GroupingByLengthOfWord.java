package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLengthOfWord {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("i","a","bad","boy");
		Map<Integer,List<String>> m=l.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(m);
	}

}
