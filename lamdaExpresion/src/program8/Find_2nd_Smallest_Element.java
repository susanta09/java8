package program8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_2nd_Smallest_Element {
	public static void main(String[] args) {
		Integer array[]= {6,2,8,3,5,1};
		
		List<Integer> list = Arrays.stream(array)
                .collect(Collectors.toList());
		int k=list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(k);
	}
}
