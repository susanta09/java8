package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObject {
	public static void main(String[] args) {
		IntStream is=IntStream.range(3, 8);
		System.err.println(is);
		List<Integer> stream=is.mapToObj(Integer::valueOf) // Convert each int to Integer
								.collect(Collectors.toList());
		System.err.println(stream);
		
		List<String> result = IntStream.range(1, 5)  // IntStream of 1, 2, 3, 4
                .mapToObj(Integer::toString)  // Convert each int to String
                .collect(Collectors.toList());  // Collect to List

System.out.println(result);  // Output: [1, 2, 3, 4]
	}

}
