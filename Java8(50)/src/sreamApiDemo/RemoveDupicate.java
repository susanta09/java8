package sreamApiDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveDupicate {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("A","B","C","B","D","C","E");
		list.stream().distinct()
//					.peek(e->System.err.println(e))
					.sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
		
	}

}
