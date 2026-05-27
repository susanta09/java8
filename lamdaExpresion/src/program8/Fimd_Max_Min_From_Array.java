package program8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fimd_Max_Min_From_Array {
	public static void main(String[] args) {
		Integer array[]= {0};
		
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
		
		Optional<Integer> r=list.stream().max(Integer::compareTo);
		if(r.isPresent())
		 System.out.println("Max value: "+r.get());
		
//		We have a list of integers numbers.
//		We convert this list to a stream using stream().
//		We then call the max() method on the stream, passing Integer::compareTo as a comparator to find the maximum value.
//		The max() method returns an Optional, which may or may not contain the maximum value.
//		We check if the Optional contains a value using isPresent(). If it does, we retrieve the value using get() and print it. Otherwise, we print a message indicating that the list is empty.
		
		Optional<Integer> k=list.stream().max(Comparator.comparing(Integer::valueOf));
		if(k.isPresent())
		 System.out.println("Max value: "+k.get());
		
		/*
		 * list.stream(): This converts the list list into a stream of elements. A
		 * stream allows you to process the elements in a declarative way, performing
		 * operations such as filtering, mapping, and reducing.
		 * 
		 * .max(Comparator.comparing(Integer::valueOf)): This part of the expression is
		 * where we find the maximum element in the stream.
		 * 
		 * max() is a terminal operation in streams that returns an Optional containing
		 * the maximum element of the stream, based on the provided comparator.
		 * 
		 * Comparator.comparing(Integer::valueOf) is a comparator that compares elements
		 * based on their natural ordering. In this case, Integer::valueOf is a method
		 * reference to the valueOf method of the Integer class, which converts an int
		 * to an Integer. This comparator essentially compares elements as Integer
		 * objects.
		 * 
		 * When you use Comparator.comparing(Integer::valueOf), it compares elements by
		 * their natural order (ascending order). If you want to find the maximum
		 * element based on a different criterion, you can provide a different
		 * comparator here.
		 * 
		 * So, putting it all together,
		 * list.stream().max(Comparator.comparing(Integer::valueOf)) converts the list
		 * into a stream and finds the maximum element in that stream based on their
		 * natural ordering (i.e., comparing them as Integer objects). It returns an
		 * Optional<Integer> containing the maximum element, or an empty Optional if the
		 * list is empty.
		 */
	}

}
