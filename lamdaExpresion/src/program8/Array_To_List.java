package program8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_To_List {
	public static void main(String[] args) {
		
//===============Using Arrays.asList()============================	
		Integer[] array = {1, 2, 3, 4, 5};

        // Convert array to list
        List<Integer> list = Arrays.asList(array);

        System.out.println(list); // Output: [1, 2, 3, 4, 5]
        
 //===============Using Stream API and collect()====================
        
        List<Integer> list1 = Arrays.stream(array)
                .collect(Collectors.toList());

        System.out.println(list1); // Output: [1, 2, 3, 4, 5]
 //================================================================
    }

}
