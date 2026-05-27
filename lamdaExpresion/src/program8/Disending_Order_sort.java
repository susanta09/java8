package program8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Disending_Order_sort {
	public static void main(String[] args) {
		Integer array[]= {7,4,8,3,9,5};
		
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
		
		list=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
	}

}
