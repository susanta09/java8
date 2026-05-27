package program8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_To_Array {
	public static void main(String[] args) {
		
	//==================Using the toArray() method================================
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	        // Convert list to array
	        Integer[] array = list.toArray(new Integer[0]);

	        System.out.println(Arrays.toString(array)); // Output: [1, 2, 3, 4, 5]
	//==================Using the Stream API================================
	        
	        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	        // Convert list to array using Stream API
	        Integer[] array2 = list.stream()
	                             .toArray(Integer[]::new);

	        System.out.println(Arrays.toString(array2)); // Output: [1, 2, 3, 4, 5]
	        
	        
		/*
		 * We create a stream of integers using Stream.of(1, 2, 3, 4, 5). We use the
		 * toArray() method on the stream to convert it into an array. We provide a
		 * generator function Integer[]::new to specify the type of array we want. The
		 * resulting array array contains the elements of the stream. We iterate over
		 * the elements of the array and print each element.
		 */
	}

}
