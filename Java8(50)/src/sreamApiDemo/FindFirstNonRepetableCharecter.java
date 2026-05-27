package sreamApiDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetableCharecter {
	public static void main(String[] args) {
		String st="geeksforgeeks";
		st.chars().mapToObj(ch->(char)ch)
				.collect(Collectors.groupingBy(
//						ch->ch,
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet().stream()
				.filter(e->e.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst().ifPresent(System.out::println);
				
	}

}
