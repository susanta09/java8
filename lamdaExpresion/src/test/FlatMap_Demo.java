package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap_Demo {
	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("a", "b", "c");
	        List<String> list2 = Arrays.asList("d", "e", "f");
	        

//	        Stream<List<String>> streamOfLists = Stream.of(list1, list2);
	        // Flattening the stream of lists into a stream of strings
//	        Stream<String> flattenedStream = streamOfLists.flatMap(List::stream);
//	        flattenedStream.forEach(System.out::println); 
	        
	        
	        
	        List<List<String>>listOfList=Arrays.asList(list1,list2);

	        Stream<String> flattenedStream = listOfList.stream().flatMap(List::stream);
	        flattenedStream.forEach(System.out::println);
	        System.out.println("==================================================");
	        listOfList.stream().flatMap(e->e.stream()).forEach(System.out::println);
	}
}
