package sreamApiDemo;

import java.util.Arrays;

public class FindNthSmallestElementInArray {
	public static void main(String[] args) {
		int[] arr= {8,9 ,6,1, 5,2,4};
		int n=2;
		Arrays.stream(arr).boxed().sorted().skip(n-1).findFirst().ifPresent(System.out::println);
		//find last element of array
		Arrays.stream(arr).boxed().skip(arr.length-1).findFirst().ifPresent(System.out::println);

	}
}
//int sum = list.stream()
//.mapToInt(Integer::parseInt)
//.sum();