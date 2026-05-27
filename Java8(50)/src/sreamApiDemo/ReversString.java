package sreamApiDemo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversString {
	public static void main(String[] args) {
		String s="susanta";
		int n=s.length();
		String st=IntStream.range(0,n)
					.mapToObj(e->s.charAt(n-e-1))
					.collect(
							StringBuilder::new,
							StringBuilder::append,
							StringBuilder::append
							).toString();
//		String st=IntStream.range(0,n)
//				.mapToObj(e->s.charAt(n-e-1))
//				.map(String::valueOf)
//				.collect(
//						Collectors.joining()// joining only string not char
//						);
		System.out.println(st);
	}

}
