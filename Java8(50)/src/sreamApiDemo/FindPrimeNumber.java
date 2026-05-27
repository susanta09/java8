package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindPrimeNumber {
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return true;
		return IntStream
				.rangeClosed(2,(int)Math.sqrt(n))
				.noneMatch(i->n%i==0);
	}
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,21,13,16,15,8,9,7);
		Boolean b=list.stream().anyMatch(FindPrimeNumber::isPrime);
		System.err.println("Prime number present..."+b);
		list.stream().filter(FindPrimeNumber::isPrime).forEach(System.out::println);
//		list.stream().filter(e->
//			IntStream.rangeClosed(2, (int)Math.sqrt(e))
//			.noneMatch(i->e%i==0)
//		).forEach(System.out::println);
		Boolean r=list.stream()
						.anyMatch(e->
								IntStream.rangeClosed(2, (int)Math.sqrt(e))
								.noneMatch(i->e%i==0)
						);
		System.err.println("Prime number present..."+r);
		
	}

}
