package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinTwoStreams {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(12,10,23,15,39);
		List<Integer> l2=Arrays.asList(1,100,2);
		Stream<Integer> s=Stream.concat(l1.stream(), l2.stream());
		s.forEach(System.out::println);

	}

}
