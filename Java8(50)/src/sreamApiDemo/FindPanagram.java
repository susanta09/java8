package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindPanagram {
	public static void main(String[] args) {
		 List<String> input = Arrays.asList(
		            "the quick brown fox jumps over the lazy dog",
		            "hello world",
		            "pack my box with five dozen liquor jugs",
		            "java streams"
		        );

		        Map<Boolean, List<String>> grouped =
		            input.stream()
		                  .collect(Collectors.partitioningBy(str ->
		                      str.toLowerCase()
		                         .chars()
		                         .filter(c -> c >= 'a' && c <= 'z')
		                         .distinct()
		                         .count() == 26
		                  ));

		        System.out.println("Pangrams: " + grouped.get(true));
		        System.out.println("Non-Pangrams: " + grouped.get(false));
		    }
	

}
