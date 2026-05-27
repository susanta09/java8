package program8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Find_Kth_Largest_Element {
	public static int kthLargestElement(List<Integer> list,int p)
	{
		 return list.stream()
				 .sorted(Collections.reverseOrder())//after the sorting the collection then arrange the list in reverse order
				 .distinct()// remove the duplicate element
				 .limit(p)//take limited element from stream like p=2 means 1st,2nd element but not 3th element
				 .skip(p-1) //skip first p-1 number of element from the stream
				 .findFirst()// take first element from the stream after all the operations before findFirst() method
				 .get();

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.asList(7,9,2,7,4,3,6,8,5);
		System.out.println("Enter the position largest element");
		int p=sc.nextInt();
		System.out.println(kthLargestElement(list,p));
	}

}
