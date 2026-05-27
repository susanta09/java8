package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClasifiyAnagarWithSameCharGroup {
	public static void main(String[] args) {
		 String[] input = {"eat","tea","tan","ate","nat","bat"};
		 Map<String, List<String>> map=Arrays.stream(input).collect(Collectors.groupingBy(
				 str -> str.chars().boxed()
				 			.sorted().map(String::valueOf)
				 			.collect(Collectors.joining()).toString()
				 ));
		 System.out.println(map.values());
		 for(List<String> l:map.values())
		 {
			 System.out.println(l);
		 }
		 

	}

}
