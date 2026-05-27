package program8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_2nd_Largest_Element {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(7,9,2,7,4,3,6,8,5);
		int k=list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).findFirst().get();
		System.out.println(k);
	}

}
