package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntToInteger {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		List<Integer> l=
				Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(l);
	}

}
