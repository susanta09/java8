package program8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_The_Array {
	public static void main(String[] args) {
		Integer array[]= {4,9,7,2,5,2,8};
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
		System.out.println("Before sorted");
		System.out.println(list);
		list=list.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorted");
		System.out.println(list);
	}

}
