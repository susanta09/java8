package program8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Find_kth_Smallest_Number {
	public static int  Kth_smallest_Ele(List<Integer> list,int p)
	{
		return list.stream()
				.sorted()
				//.distinct()
				.limit(p)
				.skip(p-1)
				.findFirst()
				.get();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer array[]= {7,5,3,9,1,5,2,8,5};
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
		System.out.println("Enter position smallest number.");
		int p=sc.nextInt();
		System.out.println(Kth_smallest_Ele(list, p));
		
	}

}
