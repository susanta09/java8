package terminal_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Count {
	public static void main(String[] args) {
//		Stream<Integer> numbers=Stream.of(1,2,3,4,5,6);
//		long c=numbers.count();
//		System.out.println(c);
//		
//		Stream<Integer> numbers1=Stream.of();
//		long c1=numbers1.count();
//		System.out.println(c1);
		
		
//		Optional<String> reduce = Stream.of("apple", "banana", "pie","xman","kama")
//                .reduce((s, s2) -> s.compareTo(s2) <= 0 ? s : s2);
//System.out.println(reduce.get());
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = numbers.parallelStream().reduce(0, (partialSum, num) -> partialSum + num, Integer::sum);
		System.out.println(sum);

	}

}
